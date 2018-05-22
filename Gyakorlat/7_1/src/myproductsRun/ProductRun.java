package myproductsRun;
 
// import myproducts.Bread;
// import myproducts.Product;

import myproducts.*;

public class ProductRun {
	public static void main(String[] args) {
		Product p1 = new Product("Product1", 250, 50);
		Bread b1 = new Bread("Bread1", 200, 27, 2);

		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());

		System.out.println("");

		int priceCompare = p1.productCompare(b1);
		if (priceCompare == 1)
			System.out.println("A p1 ára a nagyobb.");
		else if (priceCompare == -1)
			System.out.println("A b1 ára a nagyobb");
		else
			System.out.println("A p1 és b1 ára megegyezik.");

		System.out.println("");

		Bread b2 = new Bread("Bread2", 250, 24, 3);
		Product product2 = b2;

		System.out.println("A product2 adatai: " + product2.toString());

		System.out.println("");
		Bread bread2 = new Bread("bread2", 270, 20, 3);

		boolean resultPr = Bread.breadPriceCompare((Bread) product2, bread2);
		if (resultPr)
			System.out.println("A product2 ára a nagyobb: " + product2.toString());
		else
			System.out.println("A bread2 ára a nagyobb: " + bread2.toString());

		// referencia dinamikus típusának vizsgálata
		System.out.println("");
		System.out.println("b2 (Bread) instanceof Product: " + (b2 instanceof Product));
		System.out.println("product2 (Product) instanceof Product: " + (product2 instanceof Product));
		System.out.println("bread2 (Bread) instanceof Product: " + (bread2 instanceof Product));
		System.out.println("product2 (Product) instanceof Bread: " + (product2 instanceof Bread));

	}
}