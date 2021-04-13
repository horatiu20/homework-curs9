package ro.fasttrackit.homework9.exercise1;

public class Cosmetics extends Product {
	private String color;
	private int weight;

	public Cosmetics(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	public void cosmeticsMethod() {
		System.out.println("--- Cosmetics ---");
		System.out.println("Color: " + getColor());
		System.out.println("Weight: " + getWeight());
	}
}
