package ru.otus.java.basic.homeworks.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrays {

    public static void main(String[] args) {
        clerk(5, "java");
        calck(new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7});
        filler(5, new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7});
        additional(100, new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7});
        judge(new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7});
        calcArr(new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7}, new int[]{100, 100}, new int[]{200, 200, 200});
        equalizer(new int[]{1, 2, 5, 4, 4});
        equalizer(new int[]{4, 1, 1, 1, 1});
        bearerVerdicts(new int[]{1, 2, 3, 4});
        bearerVerdicts(new int[]{4, 1, 0});
        juggler(new int[]{1, 5, 7, 3, 9, 6, 8, 0, 7});
    }

    public static void clerk(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void calck(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void filler(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void additional(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void judge(int arr[]) {
        int sumL = 0;
        int sumP = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumL += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumP += arr[i];
        }
        if (sumL > sumP) {
            System.out.println("Левая половина массива больше");
        } else {
            System.out.println("Правая половина больше или равна левой");
        }
    }

    public static void calcArr(int[] arr1, int[] arr2, int[] arr3) {
        int[] arrSum = new int[Math.max(Math.max(arr1.length, arr2.length), arr3.length)];
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrSum[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arrSum[i] += arr3[i];
        }
        System.out.println(Arrays.toString(arrSum));
    }

    public static void equalizer(int[] arr) {
        int sumGen = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sumGen += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == sumGen - sum) {
                int j = i + 1;
                System.out.println("Точка находится между элементами с индексами " + i + " и " + j);
                break;
            }
        }
    }

    public static void bearerVerdicts(int[] arr) {
        System.out.println("Если хотите убедиться,что элементы идут в порядке возрастания, то введите 1.\n" + "Если хотите убедиться, что элементы идут в порядке убывания, то введите 0");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0) {
            boolean ver = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("Нет, элементы НЕ идут в порядке убывания");
                    ver = false;
                    break;
                }
            }
            if (ver) {
                System.out.println("Да, элементы идут в порядке убывания");
            }
        }

        if (a == 1) {
            boolean ver = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Нет, элементы НЕ идут в порядке возрастания");
                    ver = false;
                    break;
                }
            }
            if (ver) {
                System.out.println("Да, элементы идут в порядке возрастания");
            }
        }

    }

    public static void juggler(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(result));
    }

}
