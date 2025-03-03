package GUI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.Timer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Logic.TimeCounter;



public class Home extends Finestra{
	String segnapostoString=" ";
	Timer timer;
	Etichetta oreEtichetta;
	Etichetta minutiEtichetta;
	Etichetta secondiEtichetta;
	int ore;
	int minuti;
	int secondi;
	
	
	public Home() {
		super("Cronometro");
		
		setMinimumSize(Est.chronMax);
		setMaximumSize(Est.chronMax);
		setPreferredSize(Est.chronMax);
		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(10, 10, this.getWidth()-150, this.getHeight()-230, 100, 100));
		
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image imgg=tk.getImage("pausa.png");
		Image imgPau = imgg.getScaledInstance( 40, 40,  java.awt.Image.SCALE_SMOOTH ) ;
		Icon pauseIcon=new ImageIcon(imgPau);
		imgg=tk.getImage("stop.png");
		imgPau = imgg.getScaledInstance( 40, 40,  java.awt.Image.SCALE_SMOOTH ) ;
		Icon stopIcon=new ImageIcon(imgPau);
		imgg=tk.getImage("play.png");
		imgPau = imgg.getScaledInstance( 40, 40,  java.awt.Image.SCALE_SMOOTH ) ;
		Icon playIcon=new ImageIcon(imgPau);
		
		JPanel contenuto = new JPanel();
		contenuto.setBorder(Est.bordoMax);
		contenuto.setOpaque(false);
		contenuto.setLayout(new GridLayout(2,1));
		
		JPanel topJPanel=new JPanel();
		topJPanel.setOpaque(false);
		topJPanel.setLayout(new FlowLayout());
		contenuto.add(topJPanel);
		
		JPanel lowJPanel=new JPanel();
		lowJPanel.setBorder(Est.bordoLo);
		lowJPanel.setOpaque(false);
		lowJPanel.setLayout(new GridLayout(1,4));
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
		oreEtichetta=new Etichetta("00");
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
		minutiEtichetta=new Etichetta("00");
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
		secondiEtichetta=new Etichetta("00");
		secondiEtichetta.setFont(Est.boldFontBig);
		secondiEtichetta.setForeground(Est.scuro);
		secJPanel.add(secondiEtichetta);
		topJPanel.add(secJPanel);

		
		Bottone playBottone=new Bottone("");
		playBottone.but.setIcon(playIcon);
		playBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start();
			}
		});
		lowJPanel.add(playBottone);
		Bottone pausaBottone=new Bottone("");
		pausaBottone.but.setIcon(pauseIcon);
		pausaBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pause();
			}
		});
		lowJPanel.add(pausaBottone);
		Bottone stopBottone=new Bottone("");
		stopBottone.but.setIcon(stopIcon);
		stopBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop();
			}
		});
		lowJPanel.add(stopBottone);
		Bottone esciBottone=new Bottone("X");
		esciBottone.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
                System.exit(0);
			}
		});
		lowJPanel.add(esciBottone);

		
		c.add("South", lowJPanel);
		c.add("Center", topJPanel);
		pack();
	}
	
	void aggiornaGrafica() {
		oreEtichetta.setText(""+ore);
		minutiEtichetta.setText(""+minuti);
		secondiEtichetta.setText(""+secondi);
	}

	void start() {
		timer = new Timer();
        TimeCounter task = new TimeCounter(this);
        timer.schedule(task, 1000l, 1000l);
	}
	
	void pause() {
		timer.cancel();
	}
	
	void stop() {
		pause();
		ore=0;
		minuti=0;
		secondi=0;
	}
	
	public void passaSec() {
		secondi++;
		if (secondi==60) {
			secondi=0;
			minuti++;
			if(minuti==60) {
				minuti=0;
				ore++;
			}
		}
		aggiornaGrafica();
	}
}