package Aru;

import java.awt.Color;

import szinezheto.ISzinezheto;
 
public class Pen extends Product implements ISzinezheto {
	private Color color;
	private String brandName;

	public Pen(String name, int netPrice, int percentage, Color color, String brandName) {
		super(name, netPrice, percentage);

		this.color = color;
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", brandName=" + brandName + "]";
	}

	@Override
	public void setColor(Color colorIn) {
		this.color = colorIn;

	}

	@Override
	public Color getColor() {
		return this.color;
	}
}
