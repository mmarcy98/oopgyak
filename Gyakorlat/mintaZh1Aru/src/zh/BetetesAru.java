package zh; 

public class BetetesAru extends Aru {
	private int betetDij;

	public BetetesAru(String nev, int ar, int betetD) {
		super(nev, ar);
		betetDij = betetD;
	}

	public int vasarlas(int menny) {
		return super.vasarlas(menny) + betetDij;
	}

	public String toString() {
		return super.toString() + " A betetdij:" + betetDij;
	}
}
