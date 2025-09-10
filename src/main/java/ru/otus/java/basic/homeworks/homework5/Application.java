package ru.otus.java.basic.homeworks.homework5;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2, 10);
        Dog dog = new Dog("Барон", 1, 15, 4);
        Hors hors = new Hors("Лола", 15, 100, 5);

        cat.run(3);
        cat.info();
        dog.run(2);
        dog.info();
        dog.swim(4);
        dog.info();
        hors.run(5);
        hors.info();
        hors.swim(100);
        hors.info();
    }



}
