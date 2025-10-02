package ru.otus.java.basic.homeworks.homework7;

public interface Transport {
    boolean drive(int distance);

    boolean isActive();

    int getResource();

    void gotIn();

    void getOut();
}
