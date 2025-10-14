package ru.otus.java.basic.homeworks.homework11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PersonDataBase {
    LinkedHashSet<Person> persons;
    List<Person> personList;

    public LinkedHashSet<Person> getPersons() {
        return persons;
    }

    public PersonDataBase(LinkedHashSet<Person> persons) {
        this.persons = new LinkedHashSet<>(persons.size());
        Long i = 0L;
        for (Person person1 : persons) {
            person1.setId(i);
            this.persons.add(person1);
            i++;
        }
        this.personList = new ArrayList<>(this.persons);
    }

    public Person findById(Long id) {
        return personList.get(Math.toIntExact(id));
    }

    public void add(Person person) {
        person.setId((long) this.persons.size());
        this.persons.add(person);
        this.personList.add(person);
    }

    public boolean isManager(Person person) {
        if (person.getPosition() == Position.MANAGER || person.getPosition() == Position.DIRECTOR
                || person.getPosition() == Position.BRANCH_DIRECTOR || person.getPosition() == Position.SENIOR_MANAGER) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        if (personList.get(Math.toIntExact(id)).getPosition() == Position.MANAGER || personList.get(Math.toIntExact(id)).getPosition() == Position.DIRECTOR
                || personList.get(Math.toIntExact(id)).getPosition() == Position.BRANCH_DIRECTOR || personList.get(Math.toIntExact(id)).getPosition() == Position.SENIOR_MANAGER) {
            return false;
        }
        return true;
    }

}
