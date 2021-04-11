package ro.fasttrackit.homework9.exercise2;

//import java.time.LocalDateTime;

public abstract class Programmer extends Employee {
	String language;

	public Programmer(String language) {
		this.language=language;
	}

	public void getLanguage(String language) {
		System.out.println("Programming language: " + language);
	}
}
