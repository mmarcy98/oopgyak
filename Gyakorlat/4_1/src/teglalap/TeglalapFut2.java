package teglalap;
  
import java.util.Scanner;

public class TeglalapFut2 {
	public static void main(String[] args) {
		Teglalap rectangles[] = new Teglalap[10];

		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Teglalap((int) (Math.random() * 9) + 2, (int) (Math.random() * 9) + 2);
			System.out.println(rectangles[i].getAdatok());
		}

		System.out.println("");
		int mini = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = i;
		}
		System.out.println("A legkisebb területû téglalap adatai: " + rectangles[mini].getAdatok());

		Scanner sc = new Scanner(System.in);
		System.out.println("Kérem a téglalap A oldalát: ");
		int newA = sc.nextInt();
		System.out.println("Kérem a téglalap B oldalát: ");
		int newB = sc.nextInt();

		Teglalap newRectangle = new Teglalap(newA, newB);

		int db = 0;
		for (Teglalap t : rectangles) {
			if (t.getTerulet() < newRectangle.getTerulet())
				db++;
		}
		System.out.println("A megadott új téglalaptól kisebb területû téglalapok száma: " + db);

		System.out.println("");
		boolean isTrue = false;
		int index = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getOldalakEgyeznekE(newRectangle)) {
				isTrue = true;
				index = i;
				break;
			}
		}

		if (isTrue)
			System.out.println("Az egyezõ oldalú téglalap objektum indexe: " + index);
		else
			System.out.println("Nem volt egyezõ méretû téglalap!");

	}

}
