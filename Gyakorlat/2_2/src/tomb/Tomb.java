package tomb;

import java.util.Random;
 
public class Tomb {

	public static void main(String[] args) {
		int array[] = new int[50];
		Random rn = new Random();
		int evenArray[] = new int[50];
		
		for(int i=0;i<array.length;i++) {
			array[i] = rn.nextInt(50) + 1;
		    // array[i] = (int)(Math.random() * 50) + 1;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[49-i] + " ");
		}
		
		
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] > max & array[i]%2 == 0)
				max = array[i];
		}
		System.out.println("\nA legnagyobb páros szám: " + max);
		
		
		
		// vagy: atmeneti tomb letrehozasa a paros szamoknak majd abba max kereses
		for(int i=0;i<array.length;i++) {
			if(array[i] % 2 == 0) {
				evenArray[i] = array[i];
			}
		}
		
		int maxEven = evenArray[0];
		for(int i=0;i<evenArray.length;i++) {
			if(evenArray[i] > maxEven)
				maxEven = evenArray[i];
		}
		System.out.println("\nA legnagyobb páros szám: " + maxEven);
			
	}
}