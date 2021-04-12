package ro.fasttrackit.homework9.exercise2;

public abstract class DatabaseAdmin extends Employee {
	protected String dbTechnology;

	public DatabaseAdmin(String dbTechnology) {
		this.dbTechnology = dbTechnology;
	}

	public void getDbTechnology(String dbTechnology) {
		System.out.println("Database technology: " + dbTechnology);
	}
}

