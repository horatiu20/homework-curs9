package ro.fasttrackit.homework9.exercise2;

public abstract class DatabaseAdmin extends Employee {
	private final String dbTechnology;

	public DatabaseAdmin(String dbTechnology) {
		super(dbTechnology);
		this.dbTechnology = dbTechnology;
	}

	public String getDbTechnology() {
		return dbTechnology;
	}
}
