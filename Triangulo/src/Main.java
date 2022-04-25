import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triangulo x: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();

		System.out.println("Entre com as medidas do triangulo y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Area do triangulo x: " + areaTrianglo(xa,xb,xc));
		System.out.println("Area do triangulo y: " + areaTrianglo(ya,yb,yc));
		
		if(areaTrianglo(xa,xb,xc) > areaTrianglo(ya,yb,yc)) {
			System.out.println("X");
		}else {
			System.out.println("Y");
		}

	}
	
	public static double areaTrianglo(double a, double b, double c) {
		double p = (a + b + c)/2.0;
		
		double area = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
		
		return area;
	} 
}
