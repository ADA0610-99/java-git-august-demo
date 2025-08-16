package ru.otus.java.basic;

import java.util.Scanner;

public class GitApp {
    public static void main(String[] args) {
        greetings();
        checkSign(2, 4, 99);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(19, 4, true);
        selectMethod();
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = (int) (a + b + c);
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 20;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 19;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static void selectMethod() {
        System.out.println("Введите число от 1 до 5:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            greetings();
        } else if (a == 2) {
            int f = (int) Math.random();
            int b = (int) Math.random();
            int c = (int) Math.random();
            checkSign(f, b, c);
        } else if (a == 3) {
            selectColor();
        } else if (a == 4) {
            compareNumbers();
        } else if (a == 5) {
            int d = (int) Math.random();
            int i = (int) Math.random();
            addOrSubtractAndPrint(d, i, false);
        }
    }
}
