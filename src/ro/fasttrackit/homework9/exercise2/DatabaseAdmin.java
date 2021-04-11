package ro.fasttrackit.homework9.exercise2;

//import java.time.LocalDateTime;

public abstract class DatabaseAdmin extends Employee {
	String dbTechnology;

	public DatabaseAdmin(String dbTechnology) {
		this.dbTechnology = dbTechnology;
	}

	public void getDbTechnology(String dbTechnology) {
		System.out.println("Database technology: " + dbTechnology);
	}
}

