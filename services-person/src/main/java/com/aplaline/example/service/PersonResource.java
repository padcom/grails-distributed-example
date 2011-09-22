package com.aplaline.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.aplaline.example.person.Person;

@Path("/person/{id}")
public class PersonResource {
    @GET
    @Produces("application/json")
    public Person getPerson(@PathParam("id") Long id) {
    	Person person = new Person();
    	person.setId(id);
    	person.setFirstName("John");
    	person.setLastName("Doe");
        return person;
    }
}
