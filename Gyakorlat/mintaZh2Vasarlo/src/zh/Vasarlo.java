package zh;
 
public class Vasarlo {
	private int vasarlasOsszeg;

	public Vasarlo(int vOsszeg) {
		vasarlasOsszeg = vOsszeg;
	}

	public void vasarol(int ertek) throws nemElegException {
		if (ertek <= vasarlasOsszeg) {
			vasarlasOsszeg -= ertek;
		} else {
			throw new nemElegException(ertek, "Hiba");
		}
	}
}
