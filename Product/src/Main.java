import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Name product: ");
		product.name =  sc.next();
		System.out.print("Price product: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity product: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Data Product");
		System.out.println(product);

		System.out.println("What to remove in stock? ");
		int quantityRemove = sc.nextInt();
		
		product.removeProdutcs(quantityRemove);
		
		System.out.println("Data Product");
		System.out.println(product);
		
		System.out.println("Value in stock: " + product.totalValueInStock());
		
		sc.close();
	}

}
