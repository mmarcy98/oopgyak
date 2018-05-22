package zh;

public class Aru {
	private String neve;
	private int ara;

	public Aru(String nev, int ar) {
		neve = new String(nev);
		ara = ar;
	} 

	public String getNev() {
		return neve;
	}

	public int vasarlas(int menny) {
		int osszeg;
		return osszeg = menny * ara;
	}

	public String toString() {
		return "Az aru neve:" + neve + " ara:" + ara;
	}
}
