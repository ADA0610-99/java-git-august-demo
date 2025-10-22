package ru.otus.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер начал свою работу");
            while (true) {
                Socket client = serverSocket.accept();
                DataInputStream dis = new DataInputStream(client.getInputStream());
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());

                String userInput = dis.readUTF();
                System.out.println("userInput = " + userInput);

                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("клиент разрывает связь");
                    client.close();
                    continue;
                }

                String result = calculator(userInput);
                dos.writeUTF(result);
                dos.flush();
                System.out.println("result = " + result);
            }
        } catch (IOException е) {
            System.out.println("Сервер не поднялся");
        }
    }

    public static String calculator(String str) {
        char[] strInCharArray = str.toCharArray();
        Set<Character> operations = new HashSet<>(Set.of('+', '-', '*', '\\'));
        String arg1 = "";
        String arg2 = "";
        char z = 0;
        for (int i = 0; i < strInCharArray.length; i++) {
            if (operations.contains(strInCharArray[i]) && i != 0 && !operations.contains(strInCharArray[i - 1])) {
                z = strInCharArray[i];
                arg1 = arg2;
                arg2 = "";
                continue;

            }
            arg2 = arg2 + strInCharArray[i];
        }
        try {
            Long argToLong1 = Long.parseLong(arg1);
            Long argToLong2 = Long.parseLong(arg2);
            if (z == '+') {
                return Long.toString(argToLong1 + argToLong2);
            } else if (z == '-') {
                return Long.toString(argToLong1 - argToLong2);
            } else if (z == '/') {
                return Long.toString(argToLong1 / argToLong2);
            } else if (z == '*') {
                return Long.toString(argToLong1 * argToLong2);
            }

        } catch (NumberFormatException e) {
            System.out.println("введите корректное выражение");
        }
        return "Ошибка:введите корректное выражение";
    }
}

