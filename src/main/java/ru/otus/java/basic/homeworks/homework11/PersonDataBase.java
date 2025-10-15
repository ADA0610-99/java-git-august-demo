package ru.otus.java.basic.homeworks.homework11;

import java.util.*;

public class PersonDataBase {
    private Map<Long, Person> personMap;
    private final List<Position> managers = new ArrayList<>(
            Arrays.asList(
                    Position.MANAGER,
                    Position.DIRECTOR,
                    Position.BRANCH_DIRECTOR,
                    Position.SENIOR_MANAGER
            )
    );


    public Map<Long, Person> getPersonMap() {
        return this.personMap;
    }

    public PersonDataBase() {
        this.personMap = new HashMap<>();
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public void add(Person person) {
        person.setId((long) this.personMap.size());
        this.personMap.put((long) this.personMap.size(), person);
    }

    public boolean isManager(Person person) {
        if (managers.contains(person.getPosition())) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        if (managers.contains(personMap.get(id).getPosition())) {
            return false;
        }
        return true;
    }

}
