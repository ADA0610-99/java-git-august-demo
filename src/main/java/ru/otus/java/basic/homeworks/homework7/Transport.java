package ru.otus.java.basic.homeworks.homework7;

public interface Transport {
    void drive(int distance);

    boolean isActive();

    int getResource();

    void gotIn();

    void getOut();
}
