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
		Cosmetics cosmetic = new Cosmetics("blue", 150);
		Electronics electronic = new Electronics("Microwave", 50, 30, 25, 12);
		Fridge fridge = new Fridge(-2);


		System.out.println("Product:");
		System.out.println(product.getPrice());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		System.out.println(product.getQuantity());

		System.out.println("Cosmetics:");
		System.out.println(cosmetic.getColor());
		System.out.println(cosmetic.getWeight());

		System.out.println("Electronics:");
		System.out.println(electronic.getType());
		System.out.println(electronic.getLength());
		System.out.println(electronic.getWidth());
		System.out.println(electronic.getHeight());
		System.out.println(electronic.getWeight());

		System.out.println("Fridge:");
		System.out.println(fridge.getTemperature());
	}
}