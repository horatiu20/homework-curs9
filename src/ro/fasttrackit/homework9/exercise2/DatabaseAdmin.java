package ro.fasttrackit.homework9.exercise2;

public abstract class DatabaseAdmin extends Employee {
	private String dbTechnology;

	public DatabaseAdmin(String dbTechnology) {
		this.dbTechnology = dbTechnology;
	}

	public String getDbTechnology() {
		return dbTechnology;
	}
}

