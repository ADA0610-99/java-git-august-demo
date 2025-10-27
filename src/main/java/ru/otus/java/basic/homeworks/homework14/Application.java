package ru.otus.java.basic.homeworks.homework14;

import java.time.Duration;
import java.time.Instant;

public class Application {

    public static void main(String[] args) {
        Instant start = Instant.now();

        transformationArray();

        Instant end = Instant.now();
        System.out.println("Время выполнения: " + Duration.between(start, end).toMillis() + " мс");

        Instant start1 = Instant.now();

        flowTransformationArray();

        Instant end1 = Instant.now();
        System.out.println("Время выполнения при многопоточности: " + Duration.between(start1, end1).toMillis() + " мс");

    }

    public static double[] transformationArray() {
        double[] doubles = new double[100_000_000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return doubles;
    }

    public static double[] flowTransformationArray() {
        double[] doubles = new double[100_000_000];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < doubles.length / 4; i++) {
                doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = doubles.length / 4; i < 2 * (doubles.length / 4); i++) {
                doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 2 * (doubles.length / 4); i < 3 * (doubles.length / 4); i++) {
                doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 3 * (doubles.length / 4); i < doubles.length; i++) {
                doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        try {
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return doubles;
    }
}

