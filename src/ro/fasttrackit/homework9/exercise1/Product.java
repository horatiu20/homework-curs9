package ro.fasttrackit.homework9.exercise1;

public class Product {
	public int price;
	public String name;
	public String description;
	public int quantity;

	public String color;
	public int weight;

	public String type;
	public int length;
	public int width;
	public int height;

	public Product(int price, String name, String description, int quantity) {
		this.price = price;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public Product(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Product(String type, int length, int width, int height, int weight) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
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
