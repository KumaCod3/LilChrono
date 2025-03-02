package GUI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class Home extends Finestra{
	String segnapostoString=" ";
	public Home() {
		super("Cronometro");
		
		setMinimumSize(Est.chronMax);
		setMaximumSize(Est.chronMax);
		setPreferredSize(Est.chronMax);
		
		JPanel contenuto = new JPanel();
		contenuto.setBorder(Est.bordo);
		contenuto.setOpaque(false);
		contenuto.setLayout(new GridLayout(2,1));
		
		JPanel topJPanel=new JPanel();
		topJPanel.setOpaque(false);
		topJPanel.setLayout(new FlowLayout());
		contenuto.add(topJPanel);
		
		JPanel lowJPanel=new JPanel();
		lowJPanel.setBorder(Est.bordoLo);
		lowJPanel.setOpaque(false);
		lowJPanel.setLayout(new GridLayout(1,3));
		contenuto.add(lowJPanel);		
		
		JPanel etiJPanel=new JPanel();
		etiJPanel.setBorder(Est.bordo);
		etiJPanel.setOpaque(false);
		etiJPanel.setLayout(new FlowLayout());
		Etichetta commEtichetta=new Etichetta("Tempo:");
		etiJPanel.add(commEtichetta);
		topJPanel.add(etiJPanel);
		
		JPanel shrsJPanel=new JPanel();
		shrsJPanel.setBorder(Est.bordo);
		shrsJPanel.setOpaque(false);
		shrsJPanel.setLayout(new FlowLayout());
		Etichetta hrsEtichetta=new Etichetta("Ore:");
		shrsJPanel.add(hrsEtichetta);
		Etichetta oreEtichetta=new Etichetta("00");
		oreEtichetta.setFont(Est.boldFontBig);
		oreEtichetta.setForeground(Est.scuro);
		shrsJPanel.add(oreEtichetta);
		topJPanel.add(shrsJPanel);
		
		JPanel minJPanel=new JPanel();
		minJPanel.setBorder(Est.bordo);
		minJPanel.setOpaque(false);
		minJPanel.setLayout(new FlowLayout());
		Etichetta minEtichetta=new Etichetta("Minuti:");
		minJPanel.add(minEtichetta);
		Etichetta minutiEtichetta=new Etichetta("00");
		minutiEtichetta.setFont(Est.boldFontBig);
		minutiEtichetta.setForeground(Est.scuro);
		minJPanel.add(minutiEtichetta);
		topJPanel.add(minJPanel);
		
		JPanel secJPanel=new JPanel();
		secJPanel.setBorder(Est.bordo);
		secJPanel.setOpaque(false);
		secJPanel.setLayout(new FlowLayout());
		Etichetta secEtichetta=new Etichetta("Secondi:");
		secJPanel.add(secEtichetta);
		Etichetta secondiEtichetta=new Etichetta("00");
		secondiEtichetta.setFont(Est.boldFontBig);
		secondiEtichetta.setForeground(Est.scuro);
		secJPanel.add(secondiEtichetta);
		topJPanel.add(secJPanel);

		
		Bottone playBottone=new Bottone("INIZIA");
		playBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		lowJPanel.add(playBottone);
		Bottone pausaBottone=new Bottone("PAUSA");
		pausaBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		lowJPanel.add(pausaBottone);
		Bottone stopBottone=new Bottone("FERMA");
		stopBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		lowJPanel.add(stopBottone);
		
		c.add("South", lowJPanel);
		c.add("Center", topJPanel);
		pack();
	}
}