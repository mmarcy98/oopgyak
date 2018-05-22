package zh;
 
public class Aruhaz {
	public static void main(String[] args) {
		Vasarlo[] tomb = new Vasarlo[100];
		java.util.Random v = new java.util.Random();
		int szum = 0;

		for (int i = 0; i < 100; i++) {
			tomb[i] = new Vasarlo(50000 + v.nextInt(50000));
		}

		for (int i = 0; i < 100; i++) {
			try {
				tomb[i].vasarol(75000);
				szum++;
			} catch (Exception e) {
				System.out.println(i + " " + e.getMessage());

			}
		}

		System.out.println(szum + " vasarlo tudta megvenni a tv-t");
	}
}
