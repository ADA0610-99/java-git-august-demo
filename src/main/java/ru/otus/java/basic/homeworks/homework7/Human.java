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


    public void drive(int distance) {
        if ((this.resourse == 0) || (this.resourse < (distance * 3))) {
            System.out.println("не хватает ресурса!");
            return;
        }
        resourse -= distance;
        System.out.println("Человек идет" + distance + " миль. Сил осталось: " + this.resourse);
    }

    public void drive(int distance, String str) {
        resourse -= distance;
        System.out.println(str + resourse);
    }
}
