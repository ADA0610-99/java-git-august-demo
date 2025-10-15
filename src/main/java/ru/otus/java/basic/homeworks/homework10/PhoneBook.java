package ru.otus.java.basic.homeworks.homework10;

import java.util.*;

public class PhoneBook {
    private Map<String, List> book;

    public PhoneBook() {
        this.book = new HashMap();
    }

    public void add(String fio, Long telephone) {
        if (book.containsKey(fio)) {
            book.get(fio).add(telephone);
            return;
        }
        List<Long> telephones = new ArrayList<>();
        telephones.add(telephone);
        book.put(fio, telephones);
    }

    public List<Long> find(String fio) {
        return book.get(fio);
    }

    public boolean containsPhoneNumber(Long phone) {
        for (Map.Entry<String, List> map : this.book.entrySet()) {
            if (map.getValue().contains(phone)) {
                return true;
            }
        }
        return false;
    }

}
