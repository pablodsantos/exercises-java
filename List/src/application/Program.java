package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Integer id;
		String name;
		Double salary;
		
		System.out.println("How many employes will to registered? ");
		int quantityEmployes = sc.nextInt();
		
		List <Employe> listEmployes = new ArrayList<>();
		
		for (int i = 0; i < quantityEmployes; i++) {
			System.out.println("\nEmploye #" + (i+1));
			System.out.print("Id: ");
			id = sc.nextInt();
			
			for(int j = 0; j <listEmployes.size(); j++) {
				while(listEmployes.get(j).getId() == id) {
					System.out.println("Id exists! Please another value.");
					System.out.print("Id: ");
					id = sc.nextInt();
				}
			}
			
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			Employe employe = new Employe(id, name, salary);
			listEmployes.add(employe);
		}
		
		System.out.println("\nList of employes: ");
		for(Employe emp : listEmployes) {
			System.out.println(emp);
		}
		
		System.out.print("Enter the employe id that will have salary increase: ");
		Integer idIncrease = sc.nextInt();
		
		sc.close();
				
		for(int i = 0; i < listEmployes.size(); i++) {
			int count = 0;
			if(listEmployes.get(i).getId() == idIncrease) {
				System.out.println("Id encontrado!");
				System.out.print("Enter to percentage: ");
				double percentage = sc.nextDouble();
				listEmployes.get(i).addSalary(percentage);
				break;
			}else {
				count++;
			}
			
			if(count == listEmployes.size() - 1) {
				System.out.println("Id not find!");
				return;
			}
		}
		
		System.out.println("\nList of employes update: ");
		for(Employe emp : listEmployes) {
			System.out.println(emp);
		}
	}
}
