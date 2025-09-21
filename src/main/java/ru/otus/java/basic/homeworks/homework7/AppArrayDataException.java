package ru.otus.java.basic.homeworks.homework7;

public class AppArrayDataException extends NumberFormatException {
    private String argument;

    public String getArgument() {
        return argument;
    }

    public AppArrayDataException(String argument) {
        super("Невозможно преобразовать в int строку в ячейке ");
        this.argument = argument;
    }
}