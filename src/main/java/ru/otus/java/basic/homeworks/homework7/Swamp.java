package ru.otus.java.basic.homeworks.homework7;

public class Swamp implements Terrain {
    private int distance;

    public Swamp(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Transport transport) {
        if (transport instanceof Car || transport instanceof Bike || transport instanceof Horse) {
            System.out.println(transport.getClass().getSimpleName() + " не может ехать по болоту!");
            return;
        }
        transport.drive(this.distance);
    }
}
