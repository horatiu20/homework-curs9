package ro.fasttrackit.homework9.exercise2;

//import java.time.LocalDateTime;

public abstract class Programmer extends Employee {
/*	public Programmer(LocalDateTime dateOfEmployment, String position, int salary) {
		super(dateOfEmployment, position, salary);
	}*/

	public void getLanguage(String language) {
		System.out.println("Programming language: " + language);
	}
}
