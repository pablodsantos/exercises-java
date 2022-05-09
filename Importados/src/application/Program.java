package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the number of products: ");
		int quantityProducts = sc.nextInt();
		sc.nextLine();

		List<Product> products = new ArrayList<>();
		
		for(int i = 1; i <= quantityProducts; i++) {
			Product product = new Product();

			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			String option = sc.nextLine();
						
			if(option.equals("i")) {
				products.add(criaProductImported(product));
			}else if(option.equals("c")) {
				products.add(criaProducCommon(product));
			}else {
				products.add(criaProductUsed(product));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
	
	
	public static Product criaProducCommon(Product product) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		return new Product(name, price);
	}
	
	public static Product criaProductImported(Product product) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Customs Fee: ");
		Double customsFee = sc.nextDouble();
		
		return new ImportedProduct(name, price, customsFee);
	}
	
	public static Product criaProductUsed(Product product) throws ParseException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Manufacture date (DD/MM/YY): ");
		Date date = sdf.parse(sc.next());
		
		return new UsedProduct(name, price, date);
	}
}
