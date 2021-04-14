package ro.fasttrackit.homework9.exercise1;

public class Fridge extends Electronics {
	private final int temperature;

	public Fridge(int temperature) {
		super(temperature);
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}
}