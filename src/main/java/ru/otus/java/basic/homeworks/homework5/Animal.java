package ru.otus.java.basic.homeworks.homework5;

public class Animal {

    protected final String name;
    protected final int runSpeed; //скорость бега
    protected int endurance; // выносливость
    protected final int exhaustionRateForRun; //скорость потери выносливости при беге

    public Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
        this.exhaustionRateForRun = 1;
    }

    public int run (int distance){
        int time = distance/this.runSpeed;
        this.endurance = this.endurance - (distance * exhaustionRateForRun);
        if (this.endurance <= 0){
            System.out.println("У животного появилось состояние усталости");
            return -1;
        }
        System.out.println("Животное пробежало:" + distance + " - за " + time + " секунд");
        return time;
    }

    public void info() {
        System.out.println(this.name +
                " имеет единиц выносливости: " + this.endurance +
                " при скорости бега: " + this.runSpeed +
                " и скорости потери выносливости при беге: " + this.exhaustionRateForRun
        );
    }
}
