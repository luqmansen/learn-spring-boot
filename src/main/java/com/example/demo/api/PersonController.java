package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person addPerson(@Valid @NotNull @RequestBody Person person){
        return personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonByID(@PathVariable("id") UUID id){
        return personService.getPersonByID(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonByID(@PathVariable("id") UUID id){
         personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public Person updatePerson(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Person person ){
        return personService.updatePerson(id, person);
    }


}
