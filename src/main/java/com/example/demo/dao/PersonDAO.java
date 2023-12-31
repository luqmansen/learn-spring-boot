package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    Person insertPerson(UUID id, Person person);

    default Person insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonByID(UUID id);
    int deletePersonByID(UUID id);

    Person updatePersonByID(UUID id, Person person);


}
