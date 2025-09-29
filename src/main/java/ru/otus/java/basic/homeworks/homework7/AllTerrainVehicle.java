package ru.otus.java.basic.homeworks.homework7;

public class AllTerrainVehicle implements Transport {

    private boolean isActive;
    private int resource;

    public AllTerrainVehicle() {
        this.resource = 50;
        this.isActive = false;
    }

    public int getResource() {
        return resource;
    }

    public boolean isActive() {
        return isActive;
    }

    public void gotIn() {
        System.out.println("Человек сел в вездеход");
        this.isActive = true;
    }

    public void getOut() {
        System.out.println("Человек вышел из вездехода");
        this.isActive = false;
    }

    @Override
    public void drive(int distance) {
        if (!this.isActive) {
            System.out.println("Сначала сядь в вездеход!");
            return;
        }
        if (this.resource == 0 || this.resource < (distance * 2)) {
            System.out.println("не хватает ресурса!");
            return;
        }
        this.resource -= distance * 2;
        System.out.println("Человек проехал на вездеходе " + distance
                + " миль. Бензина осталось: "
                + this.resource);
    }
}
