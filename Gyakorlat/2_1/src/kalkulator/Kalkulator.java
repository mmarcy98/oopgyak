package kalkulator;

import java.util.Scanner;
 
public class Kalkulator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		String op = "";
		int res = 0;
		
		System.out.println("K�rem az egyik sz�mot!:");
		number1 = sc.nextInt();
		
		System.out.println("K�rem az oper�tort!:");
		op = sc.next();
		
		System.out.println("K�rem a m�sik sz�mot!:");
		number2 = sc.nextInt();
		
		sc.close();
		
		switch(op) {
			case "+" : res = number1 + number2;
					   System.out.println("Eredm�ny: " + res);
					   break;
					   
			case "-": res = number1 - number2;
					  System.out.println("Eredm�ny: " + res);
			   		  break;
					
			case "*": res = number1 * number2;
			          System.out.println("Eredm�ny: " + res);
			          break;
			          
			case "/": 
				if(number2 == 0) { 
					System.out.println("0-val nem lehet osztani!");
					break;
				} else {
					res = number1 / number2;
				    System.out.println("Eredm�ny: " + res);
				}
				    break;
		}		
	}
}