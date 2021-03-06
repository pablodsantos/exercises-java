package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int n = sc.nextInt();
		System.out.print("Colunas: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Number: ");
		int num = sc.nextInt();
		
		System.out.println("Matriz completa: ");
		imprimeMatriz(mat, n, m);
		
		if(existsNumberMatriz(mat, n, m, num) > 0) {
			System.out.println("Encontrado!");
			imprimePosicoes(mat, n, m, num);
		}else {
			System.out.println("N?o encontrado!");
		}
		
		sc.close();
	}
	
	public static int existsNumberMatriz(int[][] mat, int n, int m, int number) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == number) {
					count ++;
					break;
				}
			}
		}
		
		return count;
	}
	
	public static void imprimeMatriz(int[][] mat, int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void imprimePosicoes(int[][] mat, int n, int m, int number) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == number) {
					System.out.println(i + " , " + j + "\n");
					if(j != 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if(j < m -1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if(i != 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if(i != n - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
	}
}
