package szamol;

import java.util.Scanner;

public class Szamol {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		 
		System.out.println("Kérem a számot: ");
		int readNumber = in.nextInt();
		
		in.close();
		
		System.out.println("A beolvasott szám: " + readNumber);
		
		for(int i = 0;i<=readNumber;i++) {
			sum += i; 
		}

		System.out.println("Az összeg: " + (sum/readNumber));
	}
}