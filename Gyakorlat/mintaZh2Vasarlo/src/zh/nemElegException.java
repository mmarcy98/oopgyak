package zh;
 
public class nemElegException extends Exception {
	private int osszeg;

	public nemElegException(int osszege, String uzenet) {
		super(uzenet);
		osszeg = osszege;
	}

	public String toString() {
		return osszeg + "Ft-ja van!";
	}
}
