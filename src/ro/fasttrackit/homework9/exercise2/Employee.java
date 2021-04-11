package ro.fasttrackit.homework9.exercise2;

import java.time.LocalDateTime;

public abstract class Employee implements Person {
	protected LocalDateTime dateOfEmployment;
	protected String position;
	protected int salary;

 public Employee(LocalDateTime dateOfEmployment, String position, int salary) {
		this.dateOfEmployment = dateOfEmployment;
		this.position = position;
		this.salary = salary;
	}

	public Employee(){

	}

	public abstract int getSalary(int salary);
}
