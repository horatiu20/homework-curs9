package ro.fasttrackit.homework9.exercise1;

public class Fridge extends Electronics {
	protected int temperature;

	public Fridge(int temperature) {
		this.temperature = temperature;
	}

	public void fridgeMethod() {
		System.out.println("--- Fridge ---");
		System.out.println("Temperature: " + temperature);
	}
}
