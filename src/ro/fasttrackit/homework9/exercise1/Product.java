package ro.fasttrackit.homework9.exercise1;

public class Product {
	private int price;
	private String name;
	private String description;
	private int quantity;

	public Product(int price, String name, String description, int quantity) {
		this.price = price;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public Product(String color, int weight) {
	}

	public Product(String type, int length, int width, int height, int weight) {
	}

	public Product(int temperature) {
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}
}