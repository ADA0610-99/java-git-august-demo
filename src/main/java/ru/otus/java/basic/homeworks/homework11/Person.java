package ru.otus.java.basic.homeworks.homework11;

public class Person {
    String name;
    Position position;
    Long id;

    public Person(String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ИД: " + this.id +
                ", Имя: " + this.name +
                ", Должность: " + this.position;
    }
}
