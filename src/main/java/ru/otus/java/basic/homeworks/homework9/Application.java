package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println(makeSequence(3, 7));
        List<Integer> list = Arrays.asList(1, 4, 6, 8, 9, 0);
        System.out.println(moreFive(list));
        System.out.println(numberRegringer(7, makeSequence(3, 7)));
        System.out.println(numberRegringerSum(7, makeSequence(3, 7)));

        Employee ivan = new Employee("Ivan", 20);
        Employee piter = new Employee("Piter", 47);
        Employee mary = new Employee("Mary", 32);
        Employee pavel = new Employee("Pavel", 23);
        Employee tom = new Employee("Tom", 29);
        List<Employee> employees = Arrays.asList(ivan, pavel, piter, mary, tom);
        System.out.println(getNameAll(employees));
        ArrayList<Employee> employees1 = minAgeControl(30, employees);
        for (int i = 0; i < employees1.size(); i++) {
            System.out.println(employees1.get(i).toString());
        }
        System.out.println("Превышает ли средний возраст минимальное значение?: " + minAverageControl(29, employees));
        System.out.println("Превышает ли средний возраст минимальное значение?: " + minAverageControl(32, employees));
        System.out.println(findYoung(employees));
    }

    public static ArrayList<Integer> makeSequence(Integer min, Integer max) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer sum = min;
        do {
            list.add(sum);
            sum += 1;
        } while (sum <= max);
        return list;
    }

    public static Integer moreFive(List<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
            ;
        }
        return sum;
    }

    public static ArrayList<Integer> numberRegringer(Integer num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
        return list;
    }

    public static ArrayList<Integer> numberRegringerSum(Integer num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
        return list;
    }

    public static ArrayList<String> getNameAll(List<Employee> list) {
        ArrayList<String> listName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listName.add(list.get(i).getName());
        }
        return listName;
    }

    public static ArrayList<Employee> minAgeControl(int minAge, List<Employee> list) {
        ArrayList<Employee> whiteList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= minAge) {
                whiteList.add(list.get(i));
            }
        }
        return whiteList;
    }

    public static boolean minAverageControl(int minAge, List<Employee> list) {
        int average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getAge();
        }
        if (average / list.size() > minAge) {
            return true;
        }
        return false;
    }

    public static Employee findYoung(List<Employee> list) {
        Employee youngest = list.get(0);
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() < youngest.getAge()) {
                youngest = list.get(i);
            }
        }
        return youngest;
    }
}
