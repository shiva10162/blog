package com.swayam.demo.sort;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PersonComparatorBadTest {

    // @Rule
    // public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCompare_fail() {
	// thrown.expect(IllegalArgumentException.class);
	// thrown.expectMessage("Comparison method violates its general
	// contract!");

	// I want the exception trace to be printed out

	List<Person> persons = getFailingSet();

	try {
	    Collections.sort(persons, new PersonComparatorBad());
	    fail("Expecting a " + IllegalArgumentException.class);
	} catch (IllegalArgumentException e) {
	    e.printStackTrace();
	    assertTrue(true);
	}

    }

    @Test
    public void testCompare_pass() {
	List<Person> persons = getPassingSet();
	Collections.sort(persons, new PersonComparatorBad());
	printPersons(persons);
    }

    private void printPersons(List<Person> persons) {
	persons.forEach((Person person) -> {
	    System.out.println(person.getId());
	});
    }

    private List<Person> getPassingSet() {
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("TestName", 3));
	persons.add(new Person("TestName", 290));
	persons.add(new Person("TestName", 1));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", 1));
	persons.add(new Person("TestName", 398));
	persons.add(new Person("TestName", 46));
	persons.add(new Person("TestName", 45));
	persons.add(new Person("TestName", 0));
	persons.add(new Person("TestName", 3));
	persons.add(new Person("TestName", 45));
	persons.add(new Person("TestName", 130));
	persons.add(new Person("TestName", 33));
	persons.add(new Person("TestName", 56));
	return persons;
    }

    private List<Person> getFailingSet() {
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("TestName", 3));
	persons.add(new Person("TestName", 290));
	persons.add(new Person("TestName", 1));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", null));
	persons.add(new Person("TestName", 1));
	persons.add(new Person("TestName", 398));
	persons.add(new Person("TestName", 46));
	persons.add(new Person("TestName", 45));
	persons.add(new Person("TestName", 0));
	persons.add(new Person("TestName", 3));
	persons.add(new Person("TestName", 45));
	persons.add(new Person("TestName", 130));
	persons.add(new Person("TestName", 33));
	persons.add(new Person("TestName", 56));
	return persons;
    }

}
