package beolvas;

import java.util.Scanner;

public class Beolvas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kerem a nevet: ");
		String read = scanner.next();
		
		scanner.close();
		
		System.out.println("A beolvasott nev: " + read);
	}
}