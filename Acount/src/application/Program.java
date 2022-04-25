package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Person person;
		
		Scanner sc = new Scanner(System.in);
		
		double initialValue;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account name: ");
		String holder = sc.next();
		System.out.println("Is there initial deposity (y/n)?");
		String option = sc.next();
		
		if(option.equals("y") || option.equals("Y")) {
			System.out.println("Enter initial value: ");
			initialValue = sc.nextDouble();
			
			person = new Person(number, holder, initialValue);			
		}else {
			person = new Person(number, holder);
		}
		
		System.out.println("Accout data: ");
		System.out.println(person);
		
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
		person.deposit(depositValue);
		
		System.out.println("Update data account: ");
		System.out.println(person);
		
		System.out.println("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		
		person.withdrawal(withdrawValue);
		
		System.out.println("Update data account: ");
		System.out.println(person);
						
		sc.close();
	}

}
