package classes;

import java.awt.Color;

public class MyColor extends Color {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}

	@Override
	public String toString() {
		if(this.equals(BLACK))
			return "BLACK";
		else if(this.equals(RED))
			return "RED";
		else if(this.equals(BLUE))
			return "BLUE";
		else
			return "COLOR";
	}
	
	
}
