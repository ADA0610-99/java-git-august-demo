package ru.otus.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private String email;

    public int getYear() {
        return year;
    }

    public User(String surname, String name, String patronymic, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public String toString() {
        return (
                "Surname: " + surname +
                ", Name: " + name +
                ", Patronymic: " + patronymic +
                ", Year: " + year +
                ", Email: " + email);
    }
}
