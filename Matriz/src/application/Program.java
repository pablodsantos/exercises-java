package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite ordem da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
				
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz completa: ");
		imprimeMatrizOrdemN(mat, n);
		
		System.out.println("Diagonal principal: ");
		diagonalPrincipal(mat, n);
		
		System.out.println();
		System.out.println("Quantidade numeros negativos: ");
		System.out.println(quantidadeNumerosNegativos(mat, n));
		
		sc.close();
	}
	
	public static void imprimeMatrizOrdemN(int[][] mat, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
		//outra implementacao tb seria
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				System.out.print(mat[i][j] + "\t");
//			}
//			System.out.println();
//		}
	}
	
	public static void diagonalPrincipal(int[][] mat, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
	}
	
	public static int quantidadeNumerosNegativos(int mat[][], int n) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		return count;
	}
}
