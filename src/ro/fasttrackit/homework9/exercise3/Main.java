package ro.fasttrackit.homework9.exercise3;

/*Create an object that will receive any person and will have methods to return person related data:
 - fullName
 - age ( you need to calculate the number of years between two LocalDateTime variables*/

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		AnyPerson person = new Person();
		LocalDateTime personAge = LocalDateTime.now();
		System.out.println("Name: " + person.getFullName());
		System.out.println("Age: " + (personAge.getYear() - person.getBirthday().getYear()) + " years old");

	}
}