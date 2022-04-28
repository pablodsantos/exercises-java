package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDateClient = sdf.parse(sc.next());
			
		System.out.println("Enter order data ");
		sc.nextLine();
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Client client = new Client(nameClient, emailClient, birthDateClient);
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int quantityItems = sc.nextInt();
		
		for(int i = 0; i < quantityItems; i++) {
			System.out.println("Product #" + (i+1));
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem ordemItem = new OrderItem(quantityProduct, productPrice, product);
			order.addItem(ordemItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
	
		sc.close();
	}

}
