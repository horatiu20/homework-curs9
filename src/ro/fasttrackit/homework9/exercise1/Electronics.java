package ro.fasttrackit.homework9.exercise1;

public class Electronics extends Product {

	public Electronics() {
		super("Microwave", 50, 30, 25, 12);
	}

	public void electronicsMethod() {
		System.out.println("--- Electronics ---");
		System.out.println("Type: " + type);
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
	}
}
