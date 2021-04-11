package ro.fasttrackit.homework9.exercise2;

//import java.time.LocalDateTime;

public abstract class DatabaseAdmin extends Employee {
/*	public DatabaseAdmin(LocalDateTime dateOfEmployment, String position, int salary) {
		super(dateOfEmployment, position, salary);
	}*/

	public void getDbTechnology(String dbTechnology) {
		System.out.println("Database technology: " + dbTechnology);
	}
}

