package com.aplaline.example.person.client.impl;

import org.junit.Assert;
import org.junit.Test;

import com.aplaline.example.person.Person;
import com.aplaline.example.person.client.PersonClient;

public class PersonClientTest {
	@Test
	public void will_return_person() {
		// given
		PersonClient client = new JerseyPersonClient("http://localhost:8080/services-person/api");
		
		// when
		Person actual = client.getPerson(123L);
		
		// then
		Assert.assertNotNull(actual);
		Assert.assertEquals(Long.valueOf(123L), actual.getId());
	}
}
