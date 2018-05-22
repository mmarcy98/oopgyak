package zh;

public class Csinibaba {
	private String nev;
	private int mellboseg;
	private int derekboseg;
	private int csipoboseg;
 
	public Csinibaba(String nev, int mellboseg, int derekboseg, int csipoboseg) {
		this.nev = nev;
		this.mellboseg = mellboseg;
		this.derekboseg = derekboseg;
		this.csipoboseg = csipoboseg;
	}

	public int getMellboseg() {
		return mellboseg;
	}

	public boolean tetszikE() {
		return (mellboseg > 72 && mellboseg < 85) && (derekboseg < 90);
	}

	public String toString() {
		return nev + " : " + mellboseg;
	}

}
