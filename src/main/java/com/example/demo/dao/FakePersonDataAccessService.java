package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO{

    private static List<Person> DB = new ArrayList<>();
    @Override
    public Person insertPerson(UUID id, Person person) {
        Person p =  new Person(id, person.getName());
        DB.add(p);
        return p;
    }

    @Override
    public Person insertPerson(Person person) {
        return PersonDAO.super.insertPerson(person);
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonByID(UUID id) {
        Optional<Person> personMaybe = selectPersonByID(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public Person updatePersonByID(UUID id, Person person) {
        Optional<Person> personMaybe = selectPersonByID(id);
        if (personMaybe.isEmpty()){
            return null;
        }
        int idxToUpdate = DB.indexOf(personMaybe.get());
        DB.set(idxToUpdate, new Person(id, person.getName()));
        return new Person(
                id,
                person.getName()
        );
    }


}
