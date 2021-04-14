package ro.fasttrackit.homework9.exercise1;

public class Electronics extends Product {
	private String type;
	private int length;
	private int width;
	private int height;
	private int weight;

	public Electronics(String type, int length, int width, int height, int weight) {
		super(type, length, width, height, weight);
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public Electronics(int temperature) {
		super(temperature);
	}

	public String getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
}