package ru.otus.java.basic.homeworks.homework7;

public class Forest implements Terrain {
    private int distance;

    public Forest(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Transport transport) {
        if (transport instanceof Car) {
            System.out.println("Машина не может ехать по лесу!");
            return;
        }
        transport.drive(this.distance);
    }
}
