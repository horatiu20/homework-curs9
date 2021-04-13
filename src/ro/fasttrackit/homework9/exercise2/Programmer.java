package ro.fasttrackit.homework9.exercise2;

public abstract class Programmer extends Employee {
	private String language;

	public Programmer(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
}
