package ro.fasttrackit.homework9.exercise3;

import java.time.LocalDateTime;

public class AnyPerson {
	private final String fullName;
	private final LocalDateTime birthday;

	public AnyPerson(String fullName, LocalDateTime birthday) {
		this.fullName = fullName;
		this.birthday = birthday;
	}

	public String getFullName() {
		return fullName;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}
}