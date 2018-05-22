package Aru;

import java.awt.Color;

import Pont.SzinesPont;
import szinezheto.ISzinezheto;
 
public class Fut {
	public static void main(String[] args) {
		ISzinezheto szinRef;
		SzinesPont szPont = new SzinesPont(Color.BLUE);

		szinRef = szPont;

		System.out.println(szinRef.toString());
		szinRef.setColor(Color.GREEN);
		System.out.println(szinRef.toString());

		System.out.println("");

		reColoring(szinRef);
		System.out.println(szinRef.toString());

		System.out.println("");

		Pen toll = new Pen("Toll", 150, 27, Color.CYAN, "Tomi");
		System.out.println(toll.toString());
		toll.setColor(Color.RED);
		System.out.println(toll.toString());

		System.out.println("");

		reColoring(szinRef);
		System.out.println(szinRef.toString());
	}

	public static void reColoring(ISzinezheto szinezheto) {
		szinezheto.setColor(ISzinezheto.defaultColor);
	}
}