package ro.fasttrackit.homework9.exercise2;

import java.time.LocalDateTime;

/*Create the class hierarchy as in exercise1.jpeg
hint: for dates use LocalDateTime*/

public interface Person {
	void getFirstName(String firstName);

	void getLastName(String lastName);

	void getBirthday(LocalDateTime birthDay);

	void getAddress(String address);

}
