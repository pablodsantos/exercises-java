package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of a tax players: ");
		int quantityNumberPlayers = sc.nextInt();
		
		List<Person> list = new ArrayList<>();
		
		for(int i = 1; i <= quantityNumberPlayers; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			sc.nextLine();
			System.out.print("Individual or company (i/c)? ");
			String option = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if(option.equals("i")) {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				
				Person physical = new PhysicalPerson(name, anualIncome, health);
				list.add(physical);
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				Person legal = new LegalPerson(name, anualIncome, numberEmployees);
				list.add(legal);
			}
		}
		
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for(Person person : list) {
			System.out.printf(person.getName() + ": $ " + "%.2f%n",person.totalTax());
			sum += person.totalTax();
		}
		System.out.println("TOTAL TAXES: " + sum);
		
		sc.close();
	}
}
