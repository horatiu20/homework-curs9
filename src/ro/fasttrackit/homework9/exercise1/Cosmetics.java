package ro.fasttrackit.homework9.exercise1;

public class Cosmetics extends Product {
	private final String color;
	private final int weight;

	public Cosmetics(String color, int weight) {
		super(color, weight);
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
}