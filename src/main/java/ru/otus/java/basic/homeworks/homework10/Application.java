package ru.otus.java.basic.homeworks.homework10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Long, String> book = new HashMap<>();

        PhoneBook book1 = new PhoneBook();

        book1.add("Ivanov Ivan Ivanovich", 9989099999999L);
        book1.add("Ivanov Ivan Ivanovich", 9989099999980L);
        book1.add("Smirnova Mary Sergeevna", 9989099999970L);
        book1.add("Baranov Tom Borisovich", 9989099999960L);
        book1.add("Sidorov Petr Nikolaevich", 9989099999950L);

        System.out.println(book1.find("Ivanov Ivan Ivanovich"));
        System.out.println(book1.find("Sidorov Petr Nikolaevich"));
        System.out.println(book1.find("Semenov Ivan Nikolaevich"));


        System.out.println("Поиск владельца номера телефона: " + book1.containsPhoneNumber(998911119566L));
        System.out.println("Поиск владельца номера телефона: " + book1.containsPhoneNumber(9989099999950L));
    }
}
