package ru.otus.java.basic.homeworks.homework7;

public class AppArraySizeException extends ArrayIndexOutOfBoundsException {
    private final int size;

    public int getSize() {
        return size;
    }

    public AppArraySizeException(int size) {
        super("Некорректный размер");
        this.size = size;
    }
}
