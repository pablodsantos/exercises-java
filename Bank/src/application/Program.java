package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.excepctions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdraw = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdraw);
		System.out.println();
		System.out.println("Account: " + account);
		
		System.out.print("Enter the amount to withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
