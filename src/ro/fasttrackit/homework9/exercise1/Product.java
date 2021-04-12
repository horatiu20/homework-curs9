package ro.fasttrackit.homework9.exercise1;

public class Product {
	protected int price;
	protected String name;
	protected String description;
	protected int quantity;

	public Product(int price, String name, String description, int quantity) {
		this.price = price;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public Product() {

	}

	public void productMethod() {
		System.out.println("--- Product ---");
		System.out.println("Price: " + price);
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Quantity: " + quantity);
	}
}
