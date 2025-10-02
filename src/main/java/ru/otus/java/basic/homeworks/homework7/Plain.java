package ru.otus.java.basic.homeworks.homework7;

public class Plain implements Terrain {
    private int distance;

    public Plain(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Transport transport) {
        transport.drive(this.distance);
    }
}
