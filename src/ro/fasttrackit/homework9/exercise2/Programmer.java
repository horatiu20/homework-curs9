package ro.fasttrackit.homework9.exercise2;

public abstract class Programmer extends Employee {
	private final String language;

	public Programmer(String language) {
		super(language);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
}