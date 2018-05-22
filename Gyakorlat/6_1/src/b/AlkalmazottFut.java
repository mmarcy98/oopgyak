package b;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
public class AlkalmazottFut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfEmp = 0;
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // a datum formatuma

		System.out.println("Kérem az alkalmazottak számát: ");
		numOfEmp = sc.nextInt();

		Alkalmazott[] alkArray = new Alkalmazott[numOfEmp];

		for (int i = 0; i < alkArray.length; i++) {
			System.out.println("Kérem az " + i + ". alkalmazott nevét: ");
			String name = sc.next();

			System.out.println("Kérem az " + i + ". alkalmazott születési dátumát (yyyy-MM-dd): ");
			String dateOfBirthString = sc.next();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, dateFormatter);

			System.out.println("Kérem az " + i + ". alkalmazott fizetését: ");
			int payment = sc.nextInt();

			alkArray[i] = new Alkalmazott(name, dateOfBirth, payment);
		}
		sc.close();

		System.out.println("");

		for (int i = 0; i < alkArray.length; i++) {
			System.out.println(alkArray[i].getAdatok());
		}

		System.out.println("");

		Alkalmazott.setNyudgijKorhatar(60);
		for (int i = 0; i < alkArray.length; i++) {
			System.out.println(alkArray[i].getAdatok());
		}

		System.out.println("");
		System.out.println("Azon alkalmazottak, akiknek 5 évnél kevesebb idõ van hátra a nyugdíjig:");
		for (Alkalmazott a : alkArray) {
			if (a.getEvekNyugdijig() < 5 && a.getEvekNyugdijig() > 0) {
				System.out.println(a.getAdatok());
			}
		}

		System.out.println("");
		System.out.println("Azon alkalmazottak, akiknek az átlagnál több éve van hátra a nyugdíjig:");
		int sum = 0;
		double average = 0;
		for (Alkalmazott a : alkArray) {
			sum = sum + a.getEvekNyugdijig();
		}
		average = (double) sum / (double) alkArray.length;

		for (Alkalmazott a : alkArray) {
			if (a.getEvekNyugdijig() > average) {
				System.out.println(a.getAdatok());
			}
		}

		System.out.println("");
		System.out.println("Alkalmazottak a nyugdíjig hátralévõ idõ alapján növekvõ sorrendben:");

		Alkalmazott[] sortedArray = new Alkalmazott[alkArray.length];
		Alkalmazott temp;
		for (int j = 0; j < alkArray.length - 1; j++) {
			for (int i = 0; i < alkArray.length - 1; i++) {
				if (alkArray[i].getEvekNyugdijig() > alkArray[i + 1].getEvekNyugdijig()) {
					temp = alkArray[i];
					alkArray[i] = alkArray[i + 1];
					alkArray[i + 1] = temp;
					sortedArray = alkArray;
				}
			}
		}

		for (Alkalmazott a : sortedArray) {
			System.out.println(a.getAdatok());
		}

	}
}