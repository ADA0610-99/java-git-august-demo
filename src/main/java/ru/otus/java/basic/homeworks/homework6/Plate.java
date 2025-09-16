package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    private int food;
    private int maxFood;

    public Plate(int maxFood) {
        this.food = maxFood;
        this.maxFood = maxFood;
    }

    public int add(int newFood) {
        if (food + newFood > maxFood) {
            return food = maxFood;
        }
        return food += newFood;
    }

    public boolean eat(int eatenFood) {
        if (food < eatenFood) {
            return false;
        }
        food -= eatenFood;
        return true;
    }

    @Override
    public String toString() {
        return "Осталось еды: " + this.food + " размер тарелки: " + this.maxFood;
    }
}
