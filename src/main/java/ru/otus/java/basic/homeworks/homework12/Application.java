package ru.otus.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        String str = "1234680";
        File file = new File("oneFile.txt");
        writer(str, file);

        String str2 = "Привет, мир!";
        File file2 = new File("twoFile.txt");
        writer(str2, file2);

        String str3 = "Salom, dunyo!";
        File file3 = new File("threeFile.txt");
        writer(str3, file3);

        File parent = new File(System.getProperty("user.dir"));

        File[] files = parent.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File d, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        });
        outputFiles(files);
        Scanner scanner = new Scanner(System.in);
        String selectedStr = scanner.nextLine();
        File fileForWrite = outputer(files, selectedStr);
        if (fileForWrite != null) {
            String strForWrite = scanner.nextLine();
            writer(strForWrite, fileForWrite);
        }

    }

    public static void writer(String str, File file) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file.getAbsolutePath()))) {
            byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void outputFiles(File[] files) {
        if (files.length == 0) {
            System.out.println("Текстовых файлов не найдено!");
            return;
        }
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }


    public static File outputer(File[] file, String fileName) {
        for (int i = 0; i < file.length; i++) {
            if (file[i].getName().equals(fileName)) {
                try (InputStreamReader in = new InputStreamReader(new FileInputStream(file[i].getAbsolutePath()))) {
                    int n = in.read();
                    while (n != -1) {
                        System.out.print((char) n);
                        n = in.read();
                    }
                    System.out.println();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return file[i];
            }
        }
        System.out.println("Такого файла нет!");
        return null;
    }
}

