package ru.otus.java.basic.homeworks.homework7;

public class Car implements Transport {
    private boolean isActive;
    private int resource;

    public Car() {
        this.resource = 500;
        this.isActive = false;
    }

    public int getResource() {
        return resource;
    }

    public boolean isActive() {
        return isActive;
    }


    public void gotIn() {
        System.out.println("Человек сел в машину");
        this.isActive = true;
    }

    public void getOut() {
        System.out.println("Человек вышел из машины");
        this.isActive = false;
    }

    @Override
    public boolean drive(int distance) {
        if (!this.isActive) {
            System.out.println("Сначала сядь в машину!");
            return false;
        }
        if (this.resource == 0 || this.resource < (distance)) {
            System.out.println("не хватает ресурса!");
            return false;
        }
        this.resource -= distance;
        System.out.println("Человек проехал на машине " + distance
                + " миль. У машины бензина осталось: "
                + this.resource);
        return true;
    }
}
