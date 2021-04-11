package ro.fasttrackit.homework9.exercise1;

public class Cosmetics extends Product {

	public Cosmetics() {
		super("Blue", 150);
	}

	public void cosmeticsMethod() {
		System.out.println("--- Cosmetics ---");
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
	}
}
