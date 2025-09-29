package ru.otus.java.basic.homeworks.homework7;

public class Application {
    public static void main(String[] args) {
        Human pit = new Human("Пётр", null);

        Transport[] transports = {
                new Car(),
                new Bike(pit),
                new Horse(),
                new AllTerrainVehicle()
        };

        Terrain[] terrains = {
                new Forest(2),
                new Plain(3),
                new Swamp(1)
        };

        for (Transport t : transports) {
            pit.setCurrentTransport(t);
            pit.getCurrentTransport().gotIn();
            for (Terrain e : terrains) {
                e.doIt(t);
            }
            pit.getCurrentTransport().getOut();
        }
    }
}
