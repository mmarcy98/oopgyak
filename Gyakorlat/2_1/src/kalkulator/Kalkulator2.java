package kalkulator;

import java.util.Scanner;
 
public class Kalkulator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		String op = "";
		int res = 0;
		String array[] = new String[10]; 
		
		System.out.println("Kérem a mûveltet!:");
		array = sc.nextLine().split(" ");
		
		number1 = Integer.parseInt(array[0]);
		op = array[1];
		number2 = Integer.parseInt(array[2]);
		
		sc.close();
		
		switch(op) {
			case "+" : res = number1 + number2;
					   System.out.println("Eredmény: " + res);
					   break;
					   
			case "-": res = number1 - number2;
					  System.out.println("Eredmény: " + res);
			   		  break;
					
			case "*": res = number1 * number2;
			          System.out.println("Eredmény: " + res);
			          break;
			          
			case "/": 
				if(number2 == 0) { 
					System.out.println("0-val nem lehet osztani!");
					break;
				} else {
					res = number1 / number2;
				    System.out.println("Eredmény: " + res);
				}
				    break;
		}		
	}
}