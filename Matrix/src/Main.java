import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
				
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Elemento ["+ (i+1) + "] [" + (j+1) + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		imprimeMatrix(mat, n, n);
		diagonalPrincipal(mat, n, n);
		numeroNegativos(mat, n, n);

		sc.close();
	}
	
	/*
	 * imprime matriz
	 * recebe como parametro linha = l e coluna = c
	 * return void
	 * */
	static void imprimeMatrix(int[][] mat, int l, int c) {
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static void diagonalPrincipal(int[][] mat, int l, int c) {
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
		System.out.println();
	}
	
	static void numeroNegativos(int[][] mat, int l, int c) {
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				if(mat[i][j] < 0) {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
		System.out.println();
	}
}
