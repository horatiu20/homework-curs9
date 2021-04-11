package ro.fasttrackit.homework9.exercise1;

/*Define the following classes:
Product: price, name, description, quantity.
Cosmetics: (extends Product): color, weight.
Electronics: (extends Product) type(String), length, width, height, weight.
Fridge: (extends Electronics): temperature.
Create a Main where you use them.*/

public class Main {
	public static void main(String[] args) {
		Product product = new Product(1000, "ASUS", "Laptop", 1);
		Cosmetics cosmetic = new Cosmetics();
		Electronics electronic = new Electronics();
		Fridge fridge = new Fridge();

		System.out.println("--- Product ---");
		System.out.println("Price: " + product.getPrice());
		System.out.println("Name: " + product.getName());
		System.out.println("Description: " + product.getDescription());
		System.out.println("Quantity: " + product.getQuantity());

		cosmetic.cosmeticsMethod();
		electronic.electronicsMethod();
		fridge.fridgeMethod(-2);

	}
}
