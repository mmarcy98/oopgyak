package tomb;

public class Tomb {
	public static void main(String[] args) {
		int[] array = new int[10];
		boolean vane = false;
		 
		for(int i=0;i<array.length;i++) {
			array[i] = i+1;
			System.out.println("Az " + i + ".elem: " + array[i]);
		}
		
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] > max)
				max = array[i];
		}
		System.out.println("\nA t�mb legnagyobb eleme: " + max);
				
		
		int searched = 5;
		for(int i=0;i<array.length;i++) {
			if(array[i] == searched) 
				vane = true;
		}
			
		if(vane)
			System.out.println("\nMegtal�lhat� a t�mbben a keresett elem! (" + searched + ")");
		else
			System.out.println("\nNincs a t�mbben a keresett elem! (" + searched + ")" );
	}
}