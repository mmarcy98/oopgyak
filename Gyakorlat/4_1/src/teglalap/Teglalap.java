package teglalap;

public class Teglalap {
	private int a;
	private int b;
 
	public Teglalap(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public Teglalap(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getTerulet() {
		return a * b;
	}

	public String getAdatok() {
		return "A oldal:" + a + " B oldal:" + b + " Terulet:" + getTerulet();
	}

	public void setOldalak(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public void setOldal(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public boolean getTeruletMasik(Teglalap other) {
		if (getTerulet() > other.getTerulet())
			return true;

		return false;
	}

	public boolean getOldalakEgyeznekE(Teglalap other) {
		if (a == other.a && b == other.b)
			return true;

		return false;
	}

}