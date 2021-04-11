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

		product.productMethod();
		cosmetic.cosmeticsMethod();
		electronic.electronicsMethod();
		fridge.fridgeMethod();

	}
}
