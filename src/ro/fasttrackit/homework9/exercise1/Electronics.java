package ro.fasttrackit.homework9.exercise1;

public class Electronics extends Product {
	protected String type;
	protected int length;
	protected int width;
	protected int height;
	protected int weight;

	public Electronics(String type, int length, int width, int height, int weight) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public Electronics() {

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
