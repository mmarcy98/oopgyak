package masodfoku;

import java.util.Scanner;
 
public class Egyenlet {

	public static void main(String[] args) {
		int coefficients[] =  new int[3];
		double discriminant = 0;
		double x1, x2 = 0;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Kérem az 1. együtthatót: ");
		coefficients[0] = sc.nextInt();
		
		System.out.println("Kérem az 2. együtthatót: ");
		coefficients[1] = sc.nextInt();
		
		System.out.println("Kérem az 3. együtthatót: ");
		coefficients[2] = sc.nextInt();
		
		sc.close();
		
		a = coefficients[0];
		b = coefficients[1];
		c = coefficients[2];
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0) {
			System.out.println("Nincs valós megoldás!");
		} else {
			x1 = (b * (-1) + Math.sqrt(discriminant)) / (2 * a);     
			x2 = (b * (-1) - Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("A megoldások: " + "x1:" + x1 + " x2:" + x2);
		}
	}
}