package application;

import java.util.Scanner;

import entitities.Aluguel;

public class Program {
	
	public static void main(String[] args) {
		int TAM = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos deseja alugar: ");
		int quantityRoom = sc.nextInt();
		
		Aluguel[] vectAluguel = new Aluguel[TAM];
			
		for(int i = 0; i < quantityRoom; i++) {
			System.out.printf("\nRent #" + (i + 1) + "\n");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vectAluguel[room] = new Aluguel(name, email, room);
		}
		
		imprimeVetor(vectAluguel);
		
		sc.close();
	}
	
	public static void imprimeVetor(Aluguel[] vectAluguel) {
		System.out.println("\nBusy rooms: ");
				
		for(int i = 0; i < vectAluguel.length; i++) {
			if(vectAluguel[i] != null) {
				System.out.println(vectAluguel[i]);
			}
		}
	}
}
