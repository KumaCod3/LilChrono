package GUI;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Finestra extends JFrame {
	public JPanel c;

	public Finestra(String x) {
		super(x);

		
		setLayout(new BorderLayout());
		setLocation(Est.marginX, Est.marginY);
		setMinimumSize(Est.err);
		setMaximumSize(Est.bigErr);
		setBackground(Est.sfondo);
		Header testa = new Header();
		add("North",testa);
		c = new JPanel();
		c.setLayout(new BorderLayout());
		c.setBackground(Est.sfondo);
	//	setBackground(Est.sfondo);
		add("Center", c);

	}
}
