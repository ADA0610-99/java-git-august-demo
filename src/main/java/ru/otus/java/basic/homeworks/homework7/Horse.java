package ru.otus.java.basic.homeworks.homework7;

public class Horse implements Transport {

    private boolean isActive;
    private int resource;

    public Horse() {
        this.resource = 5;
        this.isActive = false;
    }

    public int getResource() {
        return resource;
    }

    public boolean isActive() {
        return isActive;
    }

    public void gotIn() {
        System.out.println("Человек сел на лошадь");
        this.isActive = true;
    }

    public void getOut() {
        System.out.println("Человек слез с лошади");
        this.isActive = false;
    }

    @Override
    public boolean drive(int distance) {
        if (!this.isActive) {
            System.out.println("Сначала сядь на лошадь!");
            return false;
        }
        if (this.resource == 0 || this.resource < (distance * 0.5)) {
            System.out.println("не хватает ресурса!");
            return false;
        }
        this.resource -= (int) (distance * 0.5);
        System.out.println("Человек проскакал на лошади " + distance
                + " миль. Сил у лошади осталось: "
                + this.resource);
        return true;
    }
}
