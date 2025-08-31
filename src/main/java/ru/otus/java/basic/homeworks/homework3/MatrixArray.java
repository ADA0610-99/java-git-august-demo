package ru.otus.java.basic.homeworks.homework3;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 9}, {-5, 6, 7}, {1, -6, 3}};
        System.out.println(sumOfPositiveElements(arr));
        malevich(10);
        richard(arr);
        System.out.println(findMax(arr));
        System.out.println(summer(arr));
        int[][] arr1 = {{1, 3, 9}, {-5, 6, 7}, {1, -6, 3}};
        System.out.println(summer(arr1));
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void malevich(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.println("*");
                    continue;
                }
                System.out.print("*");
            }
        }
    }

    public static void richard(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                if (j == arr[i].length - 1) {
                    System.out.println(arr[i][j]);
                    continue;
                }
                System.out.print(arr[i][j]);
            }
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int summer(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int j = 0; j < arr[1].length; j++) {
            sum += arr[1][j];
        }
        return sum;
    }
}
