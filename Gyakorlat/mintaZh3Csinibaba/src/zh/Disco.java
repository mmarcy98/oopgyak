package zh;
 
public class Disco {
	public static void main(String[] args) {
		final int CSAJOK_SZAMA = 50;
		Csinibaba[] csajok = new Csinibaba[CSAJOK_SZAMA];

		java.util.Random v = new java.util.Random();

		for (int i = 0; i < CSAJOK_SZAMA; i++) {
			csajok[i] = new Csinibaba("Baby" + (i + 1), 70 + v.nextInt(50), 70 + v.nextInt(50), 70 + v.nextInt(50));
		}

		for (int i = 0; i < CSAJOK_SZAMA; i++) {
			System.out.print(i + ". csaj: " + csajok[i].getMellboseg());
			if (csajok[i].tetszikE()) {
				System.out.println("  TETSZIK!!");
			} else {
				System.out.println("");
			}
		}
		System.out.println(csajok[0]);
	}
}
