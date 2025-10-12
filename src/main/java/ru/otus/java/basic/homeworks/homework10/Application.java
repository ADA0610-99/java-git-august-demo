package ru.otus.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Long, String> book = new HashMap<>();

        PhoneBook book1 = new PhoneBook(book);

        book1.add(998919119143L, "Ivanov Ivan Ivanovich");
        book1.add(998919119144L, "Ivanov Ivan Ivanovich");
        book1.add(998911119111L, "Smirnova Mary Sergeevna");
        book1.add(998911114566L, "Baranov Tom Borisovich");
        book1.add(998911114566L, "Sidorov Petr Nikolaevich");

        System.out.println(book1.find("Ivanov Ivan Ivanovich"));
        System.out.println(book1.find("Sidorov Petr Nikolaevich"));
        System.out.println(book1.find("Semenov Ivan Nikolaevich"));

        System.out.println("Поиск владельца номера телефона: " + book1.containsPhoneNumber(998911119566L));
    }
}
