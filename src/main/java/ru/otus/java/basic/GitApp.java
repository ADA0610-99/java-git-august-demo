package ru.otus.java.basic;

import ru.otus.java.basic.homeworks.homework6.Cat;
import ru.otus.java.basic.homeworks.homework6.Plate;

public class GitApp {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", 2);
        Cat pushok = new Cat("Pushok", 15);
        Cat dasha = new Cat("Dasha", 5);
        Cat bob = new Cat("Bob", 6);
        Cat[] cats = {murka, pushok, dasha, bob};

        Plate plate = new Plate(15);
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()) {
                System.out.println(cats[i].getName() + " сытый");
                continue;
            }
            if (!plate.eat(cats[i].getAppetite())) {
                System.out.println(cats[i].getName() + " не хватило еды");
                continue;
            }
            ;
            cats[i].setSatiety();
            System.out.println(cats[i].toString());
        }
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()) {
                System.out.println(cats[i].getName() + " сытый");
                continue;
            }
            if (!plate.eat(cats[i].getAppetite())) {
                System.out.println(cats[i].getName() + " не хватило еды");
                continue;
            }
            ;
            cats[i].setSatiety();
            System.out.println(cats[i].toString());
        }
    }
}