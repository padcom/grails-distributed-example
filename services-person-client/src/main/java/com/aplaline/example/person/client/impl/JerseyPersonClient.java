package com.aplaline.example.person.client.impl;

import com.aplaline.example.person.Person;
import com.aplaline.example.person.client.PersonClient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class JerseyPersonClient implements PersonClient {

	private Client client = new Client();
	private WebResource resource;
	
	public JerseyPersonClient(String url) {
		this.resource = client.resource(url);
	}
	
	@Override
	public Person getPerson(Long id) {
		return resource.path("/person/" + id).get(Person.class);
	}

}
