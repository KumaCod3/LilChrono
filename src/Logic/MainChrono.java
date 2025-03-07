package Logic;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import GUI.Est;
import GUI.Home;

public class MainChrono {
	public static void main(String[] args) {

		Home home=new Home() {
			@Override
			public void paint(Graphics g) {
		        paintComponents(g);
		        int width = getWidth();
		        int height = getHeight();
		        Graphics2D graphics = (Graphics2D) g;
		        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		        graphics.setStroke(new BasicStroke(4));
		        graphics.setColor(Est.scuro);
		        graphics.drawRoundRect(11, 11, width-25, height-24, 100, 100);//paint border
		     }
		};
		home.setVisible(true);
		
	}
}
