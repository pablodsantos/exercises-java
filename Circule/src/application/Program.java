package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circunferemce: %.2f%n",  Calculator.circunferemce(radius));
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		System.out.printf("PI %.2f%n", Calculator.PI);

		sc.close();
	}
}
