package ro.fasttrackit.homework9.exercise1;

public class Cosmetics extends Product {
	public String color;
	public int weight;

	public Cosmetics(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	public void cosmeticsMethod() {
		System.out.println("--- Cosmetics ---");
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
	}
}
