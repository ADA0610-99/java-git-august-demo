package ru.otus.java.basic.homeworks.homework7;

public class Bike implements Transport {

    private boolean isActive;
    private Human human1;

    public Bike(Human human1) {
        this.isActive = false;
        this.human1 = human1;
    }

    public int getResource() {
        return human1.getResourse();
    }

    public boolean isActive() {
        return isActive;
    }


    public void gotIn() {
        System.out.println("Человек сел на велосипед");
        this.isActive = true;
    }

    public void getOut() {
        System.out.println("Человек слез с велосипеда");
        this.isActive = false;
    }

    @Override
    public void drive(int distance) {
        if (!this.isActive) {
            System.out.println("Сначала сядь на велик!");
            return;
        }
        if (this.human1.getResourse() == 0 || this.human1.getResourse() < (distance * 3)) {
            System.out.println("не хватает ресурса!");
            return;
        }
        human1.drive(distance, "Человек проехал на велосипеде " + distance
                + " миль. Сил у человека осталось: ");
    }
}
