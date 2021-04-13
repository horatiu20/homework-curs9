package ro.fasttrackit.homework9.exercise2;

import java.time.LocalDateTime;

public abstract class Employee implements Person {
	private LocalDateTime dateOfEmployment;
	private String position;
	private int salary;

	public Employee(LocalDateTime dateOfEmployment, String position, int salary) {
		this.dateOfEmployment = dateOfEmployment;
		this.position = position;
		this.salary = salary;
	}

	public Employee() {

	}

	public LocalDateTime getDateOfEmployment() {
		return dateOfEmployment;
	}

	public String getPosition() {
		return position;
	}

	public abstract int getSalary(int salary);
}
