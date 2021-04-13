package ro.fasttrackit.homework9.exercise1;

public class Fridge extends Electronics {
	private int temperature;

	public Fridge(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void fridgeMethod() {
		System.out.println("--- Fridge ---");
		System.out.println("Temperature: " + getTemperature());
	}
}
