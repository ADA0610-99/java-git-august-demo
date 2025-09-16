package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public boolean setSatiety() {
        return this.satiety = true;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + ", аппетит: " + this.appetite + ", сытость:" + this.satiety;
    }
}
