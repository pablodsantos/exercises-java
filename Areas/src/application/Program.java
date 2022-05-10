package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int quantityShapes = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for(int i = 1; i <= quantityShapes; i++) {
			System.out.println("Shape # " + i + " data: ");
			sc.nextLine();
			System.out.print("Rectangle or circle (r/c)? ");
			String shape = sc.nextLine();
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			
			if(shape.equals("c")) {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(Color.valueOf(color), radius));
			}else {
				System.out.print("Weidth: ");
				double weidth = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(color), weidth, height));
			}
		}
		
		System.out.println("SHAPE AREAS");
		for(Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		
		sc.close();
	}

}
