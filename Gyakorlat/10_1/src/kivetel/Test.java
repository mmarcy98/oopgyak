package kivetel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Test {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		try {
			readNextInt(array);
			// readNextLine(array);
			// readBFIntValue(array);
			// readBFreadLine(array);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void readNextInt(int[] array) throws primeException {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			int number = sc.nextInt();

			if (isPrime(number)) {
				array[i] = number;
			} else {
				throw new primeException("A beolvasott szám nem prím!");
			}
		}
		sc.close();
	}

	public static void readNextLine(int[] array) throws primeException {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			int number = Integer.parseInt(sc.nextLine());

			if (isPrime(number)) {
				array[i] = number;
			} else {
				throw new primeException("A beolvasott szám nem prím!");
			}
		}
		sc.close();
	}

	public static void readBFIntValue(int[] array) throws primeException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			String number = "";

			try {
				number = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (isPrime(Integer.valueOf(number).intValue())) {
				array[i] = Integer.valueOf(number).intValue();
			} else {
				throw new primeException("A beolvasott szám nem prím!");
			}
		}
		sc.close();
	}

	public static void readBFreadLine(int[] array) throws primeException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			int number = 0;

			try {
				number = Integer.valueOf(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}

			if (isPrime(Integer.valueOf(number).intValue())) {
				array[i] = Integer.valueOf(number).intValue();
			} else {
				throw new primeException("A beolvasott szám nem prím!");
			}
		}
		sc.close();
	}
	
	public static void writeElements(int[] arrayIn) {
		for(int i=0;i<arrayIn.length;i++)
			System.out.println("A tömb " + i + ". eleme: " + arrayIn[i]);
	}

}