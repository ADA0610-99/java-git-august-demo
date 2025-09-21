package ru.otus.java.basic.homeworks.homework7;

public class Application {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"1", "0", "1", "d"}};
        try {
            int x = ArrayConsumer(array);
            System.out.println(x);
        } catch (AppArraySizeException e) {
            System.out.print(e.getMessage() + ": ");
            System.out.println(e.getSize());
        } catch (AppArrayDataException e) {
            System.out.print(e.getMessage() + ": ");
            System.out.println(e.getArgument());
        }
    }

    public static int ArrayConsumer(String[][] arr) {
        int x = 0;
        if (arr.length != 4) {
            throw new AppArraySizeException(arr.length);
        }
        if (arr[0].length != 4) {
            throw new AppArraySizeException(arr[0].length);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!arr[i][j].matches("\\d+")) {
                    throw new AppArrayDataException(i + " / " + j);
                }
                x += Integer.parseInt(arr[i][j]);
            }
        }
        return x;
    }
}