package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        final String sql = "INSERT INTO person (id, name) values (uuid_generate_v4(), ?);";

        return jdbcTemplate.update(
                sql,
                person.getName()
        );

    }

    @Override
    public int insertPerson(Person person) {
        return PersonDAO.super.insertPerson(person);
    }

    @Override
    public List<Person> selectAllPeople() {
        final String sql = "SELECT id, name FROM person;";
        return jdbcTemplate.query(sql, (resultSet, i) -> {

            return new Person(
                    UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name")
            );
        });
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        final String sql = "SELECT id, name FROM person where id = ?;";

        Person person = jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                (resultSet, i) -> {
            UUID personID = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(personID, name);
        });

        return Optional.ofNullable(person);
    }

    @Override
    public int deletePersonByID(UUID id) {
        final String sql = "DELETE from person where id = ?";

        return jdbcTemplate.update(
                sql,
                id
        );
    }

    @Override
    public int updatePersonByID(UUID id, Person person) {
        final String sql = "UPDATE person SET name =? where id =?";

        return jdbcTemplate.update(
                sql,
                person.getName(),
                person.getId()
        );
    }
}
