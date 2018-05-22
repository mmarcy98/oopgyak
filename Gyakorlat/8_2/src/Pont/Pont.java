package Pont;
 
public class Pont {
	private int x;
	private int y;

	public Pont(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "A pont adatai: [ x:" + this.x + " y:" + this.y + "]";
	}
}