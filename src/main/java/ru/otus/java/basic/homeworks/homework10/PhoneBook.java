package ru.otus.java.basic.homeworks.homework10;

import java.util.*;

public class PhoneBook {
    private Map<Long, String> book;

    public PhoneBook(Map<Long, String> book) {
        this.book = book;
    }

    public void add(Long telephone, String fio) {
        book.put(telephone, fio);
    }

    public List<Long> find(String fio) {
        List<Long> phones = new ArrayList<>();
        for (Map.Entry<Long, String> entry : book.entrySet()) {
            if (entry.getValue() == fio) {
                phones.add(entry.getKey());
            }
        }
        return phones;
    }

    public String containsPhoneNumber(Long phone) {
        return book.getOrDefault(phone, phone + " - номер телефона в справочнике отсутствует");
    }
}
