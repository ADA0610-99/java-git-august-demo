package ru.otus.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private Transport currentTransport;
    private int resourse;

    public Human(String name, Transport transport) {
        this.name = name;
        this.currentTransport = transport;
        this.resourse = 22;
    }

    public int getResourse() {
        return resourse;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }


    public boolean drive(int distance) {
        if ((this.resourse == 0) || (this.resourse < (distance * 3))) {
            System.out.println("не хватает ресурса!");
            return false;
        }
        resourse -= distance;
        if (currentTransport instanceof Bike) {
            System.out.println("Человек проехал на велосипеде" + distance + " миль. Сил осталось: " + this.resourse);
            return true;
        }
        System.out.println("Человек прошел" + distance + " миль. Сил осталось: " + this.resourse);
        return true;
    }

}
