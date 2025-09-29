package ru.otus.java.basic.homeworks.homework7;

public class Swamp implements Terrain {
    private int distance;

    public Swamp(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Transport transport) {
        if (transport instanceof Car) {
            System.out.println("Машина не может ехать по болоту!");
            return;
        }
        if (transport instanceof Bike) {
            System.out.println("Велосипед не может ехать по болоту!");
            return;
        }
        if (transport instanceof Horse) {
            System.out.println("Лошадь не может ехать по болоту!");
            return;
        }
        transport.drive(this.distance);
    }
}
