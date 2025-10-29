package ru.otus.java.basic.homeworks.homework14;

import java.time.Duration;
import java.time.Instant;

public class Application {

    public static void main(String[] args) {
        Instant start = Instant.now();

        transformationArrayCreate();

        Instant end = Instant.now();
        System.out.println("Время выполнения: " + Duration.between(start, end).toMillis() + " мс");

        Instant start1 = Instant.now();

        flowTransformationArray();

        Instant end1 = Instant.now();
        System.out.println("Время выполнения при многопоточности: " + Duration.between(start1, end1).toMillis() + " мс");

    }

    public static double[] transformationArrayCreate() {
        double[] doubles = new double[100_000_000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return doubles;
    }

    public static double[] transformationArray(double[] doubles, int start, int end) {
        for (int i = start; i < end; i++) {
            doubles[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return doubles;
    }

    public static double[] flowTransformationArray() {
        double[] doubles = new double[100_000_000];
        Thread[] treads = new Thread[4];
        treads[0] = new Thread(() -> {
            transformationArray(doubles, 0, doubles.length / 4);
        });
        treads[1] = new Thread(() -> {
            transformationArray(doubles, doubles.length / 4, 2 * (doubles.length / 4));
        });
        treads[2] = new Thread(() -> {
            transformationArray(doubles, 2 * (doubles.length / 4), 3 * (doubles.length / 4));
        });
        treads[3] = new Thread(() -> {
            transformationArray(doubles, 3 * (doubles.length / 4), doubles.length);
        });

        for (int i = 0; i < treads.length; i++) {
            treads[i].start();
        }

        try {
            for (int i = 0; i < treads.length; i++) {
                treads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            return doubles;
}
    }

