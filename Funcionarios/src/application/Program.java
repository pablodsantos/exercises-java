package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employe: ");
		int quantityEmploye = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i = 0; i < quantityEmploye; i++) {
			System.out.println("Employee #" + (i + 1));
			employees.add(criaEmployee());
		}
		
		imprimeListEmployesPayments(employees);
		
		sc.close();
	}
	
	public static Employee criaEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		System.out.print("Outsourced? ");
		String outsourced = sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Hour: ");
		int hour= sc.nextInt();
		System.out.print("Value per hour: ");
		double value = sc.nextDouble();
		
		if(outsourced.equals("y")) {
			System.out.print("Aditional charge: ");
			double aditional = sc.nextDouble();
			System.out.println();
			employee = new OutsourceEmployee(name, hour, value, aditional);
		}else {
			employee = new Employee(name, hour, value);
			System.out.println();
		}
		return employee;
	}
	
	public static void imprimeListEmployesPayments(List<Employee> employees) {
		 System.out.println("PAYMENTS");
		for(Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + employee.payment());
		}
		
	}
}
