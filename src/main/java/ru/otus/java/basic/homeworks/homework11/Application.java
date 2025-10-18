package ru.otus.java.basic.homeworks.homework11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Person masha = new Person("Mary", Position.MANAGER);
        Person misha = new Person("Mikhail", Position.DEVELOPER);
        Person katya = new Person("Ekaterina", Position.ENGINEER);
        Person olya = new Person("Olga", Position.QA);
        Person vasya = new Person("Vasilyi", Position.PLUMBER);
        Person dasha = new Person("Darya", Position.JUNIOR_DEVELOPER);

        PersonDataBase dataBase = new PersonDataBase();
        dataBase.add(masha);
        dataBase.add(misha);
        dataBase.add(katya);
        dataBase.add(olya);
        dataBase.add(vasya);
        dataBase.add(dasha);


        for (Map.Entry<Long, Person> per : dataBase.getPersonMap().entrySet()) {
            System.out.println(per.toString());
        }

        System.out.println(dataBase.findById(4L).toString());
        Person pit = new Person("Piter", Position.JANITOR);
        dataBase.add(pit);

        for (Map.Entry<Long, Person> per : dataBase.getPersonMap().entrySet()) {
            System.out.println(per.toString());
        }

        System.out.println(dataBase.isEmployee(6L));
        System.out.println(dataBase.isEmployee(0L));

        System.out.println(dataBase.isManager(pit));
        System.out.println(dataBase.isManager(masha));


        int[] array = {5, 6, 1, 0, 11, 9, 4};
        System.out.println(Arrays.toString(Sort.bubbleSort(array)));
        int[] array1 = {5, 6, 1, 0, 11, 9, 4};
        Sort.quickSort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
