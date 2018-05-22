package hasabokTarol;
 
import Sikidom.*;

public class HasabTarolFut {
	public static void main(String[] args) {
		HasabTarol hT = new HasabTarol(5);

		hT.setHasabRef(0, new Henger(4, 10));
		hT.setHasabRef(1, new Henger(2, 3));
		hT.setHasabRef(2, new Teglatest(5, 5, 2));
		hT.setHasabRef(3, null);
		hT.setHasabRef(4, null);
		
		for (int i = 0; i < 5; i++) {
			if (hT.getIndexofHasab(i) != null)
				System.out.println(hT.getIndexofHasab(i).toString());
		}

		System.out.println("");
		System.out.println("A hasábok átlagos térfogata: " + hT.getHasabAverageVolume());
		System.out.println("A hengerek száma: " + hT.getHengerHasabokSzama());
		System.out.println("A null elemek száma: " + hT.getNotNullElements());

	}

}
