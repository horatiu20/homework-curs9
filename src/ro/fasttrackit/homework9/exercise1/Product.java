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

	public Product() {

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

	public void productMethod() {
		System.out.println("--- Product ---");
		System.out.println("Price: " + getPrice());
		System.out.println("Name: " + getName());
		System.out.println("Description: " + getDescription());
		System.out.println("Quantity: " + getQuantity());
	}
}
