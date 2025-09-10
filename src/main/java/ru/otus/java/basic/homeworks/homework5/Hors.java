package ru.otus.java.basic.homeworks.homework5;


import java.lang.module.FindException;

public class Hors extends Animal {

    private final int swimSpeed; //скорость плавания
    private final int exhaustionRateForSwim; //скорость потери выносливости при плавании

    public Hors(String name, int runSpeed, int endurance, int swimSpeed) {
        super(name, runSpeed, endurance);
        this.swimSpeed = swimSpeed;
        this.exhaustionRateForSwim = 4;
    }

    public int swim(int distance) {
        int time = distance / this.swimSpeed;
        this.endurance = this.endurance - (distance * exhaustionRateForSwim);
        if (this.endurance <= 0) {
            System.out.println("У животного появилось состояние усталости");
            return -1;
        }
        System.out.println("Животное проплыло:" + distance + " - за " + time + " секунд");
        return time;
    }

    public void info() {
        System.out.println(this.name +
                " имеет единиц выносливости: " + this.endurance +
                " при скорости бега: " + this.runSpeed +
                " и скорости потери выносливости при беге: " + this.exhaustionRateForRun +
                " при скорости плавания: " + this.swimSpeed +
                " и скорости потери выносливости при плавании: " + this.exhaustionRateForSwim
        );
    }


}
