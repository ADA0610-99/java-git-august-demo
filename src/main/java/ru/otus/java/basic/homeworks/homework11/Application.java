package ru.otus.java.basic.homeworks.homework11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args) {

        Person masha = new Person("Mary", Position.MANAGER);
        Person misha = new Person("Mikhail", Position.DEVELOPER);
        Person katya = new Person("Ekaterina", Position.ENGINEER);
        Person olya = new Person("Olga", Position.QA);
        Person vasya = new Person("Vasilyi", Position.PLUMBER);
        Person dasha = new Person("Darya", Position.JUNIOR_DEVELOPER);

        LinkedHashSet<Person> people = new LinkedHashSet<>();
        people.add(masha);
        people.add(misha);
        people.add(katya);
        people.add(olya);
        people.add(vasya);
        people.add(dasha);

        PersonDataBase dataBase = new PersonDataBase(people);

        for (Person person : dataBase.getPersons()) {
            System.out.println(person.toString());
        }

        System.out.println(dataBase.findById(4L));
        Person pit = new Person("Piter", Position.JANITOR);
        dataBase.add(pit);

        for (Person person : dataBase.getPersons()) {
            System.out.println(person.toString());
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
