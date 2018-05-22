package szinezheto;

import java.awt.Color;
 
public interface ISzinezheto {
	public Color defaultColor = Color.RED;

	public void setColor(Color colorIn);

	public Color getColor();
}