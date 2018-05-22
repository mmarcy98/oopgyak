package zh;
 
public class Bolt {
	public static void main(String[] arg) {
		Aru bevasarlas[] = new Aru[50];
		int osszar = 0;

		for (int i = 0; i < 50; i++) {
			bevasarlas[i] = new BetetesAru("Aru" + (i + 1), 1000 + (i * 100), 25);
		}

		for (int i = 0; i < 50; i++) {
			osszar = osszar + bevasarlas[i].vasarlas(50);
			System.out.println(bevasarlas[i]);
		}
		System.out.println("Az fizetedndo ar:" + osszar);
	}
}
