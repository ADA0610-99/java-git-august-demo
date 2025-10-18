package ru.otus.java.basic.homeworks.homework11;

import java.util.Arrays;
import java.util.TreeSet;

public class Sort {
    public static int[] bubbleSort(int array[]) {
        int countCycle = array.length;
        int countSize = array.length;
        for (int i = 0; i < countCycle; i++) {
            notSortPieceArray(array, countSize);
            countSize--;
        }
        return array;
    }

    private static void notSortPieceArray(int array[], int countSize) {
        int j = 0;
        for (int i = 0; i < countSize; i++) {
            if (i == countSize - 1) {
                break;
            }
            if (array[i] > array[i + 1]) {
                j = array[i + 1];
                array[i + 1] = array[i];
                array[i] = j;
            }
        }
    }

    public static void quickSort(int array[]) {
        TreeSet<Integer> arrayTree = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            arrayTree.add(array[i]);
        }
        int i = 0;
        for (Integer j : arrayTree) {
            array[i] = j;
            i++;
        }

    }
}
