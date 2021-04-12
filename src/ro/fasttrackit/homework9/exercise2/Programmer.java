package ro.fasttrackit.homework9.exercise2;

public abstract class Programmer extends Employee {
	protected String language;

	public Programmer(String language) {
		this.language = language;
	}

	public void getLanguage(String language) {
		System.out.println("Programming language: " + language);
	}
}
