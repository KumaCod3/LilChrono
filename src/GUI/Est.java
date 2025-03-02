package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Est {
	public static Color sfondo=new Color(142,209,252);//verdino chiaro 122,220,180
	public static Color scuro=new Color(6,147,227);
	public static Color verde=new Color(0,208,130);
	
	public static Font boldFont=new Font("Tahoma", Font.BOLD, 20);
	public static Font plainFont=new Font("Tahoma", Font.PLAIN, 20);
	public static Font boldFontBig=new Font("Tahoma", Font.BOLD, 30);
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static double width=screenSize.getSize().getWidth();
	public  static double height=screenSize.getSize().getSize().getHeight();
	private static double wi=width*0.8;
	private static double he=height*0.8;
	private static double he80=he/11.5;
	private static double wi310=wi/2;
	public static Dimension standard=new Dimension((int)wi, (int)he);
	public static Dimension grossoMin=new Dimension((int)(wi310/3),(int)(he80/6));
	public static Dimension testa=new Dimension((int)(width/3),(int)(height/12));
	public static Dimension err=new Dimension((int)wi310,(int)(he/1.8));
	public static Dimension bigErr=new Dimension((int)wi310,(int)(he80));
	
	public static Dimension chronMax=new Dimension((int)(width/3),(int)(height/4));
	
	public static int marginX=(int)((screenSize.getSize().getWidth()/2)-(standard.getSize().getWidth()/2));
	public static int marginY=(int)((screenSize.getSize().getSize().getHeight()/2)-(standard.getSize().getHeight()/2));
	
	public static Border bordo= BorderFactory.createEmptyBorder(1,1,1,1);
	public static Border bordoMax= BorderFactory.createEmptyBorder(10,10,10,10);
	public static Border bordoLo= BorderFactory.createEmptyBorder(1,1,15,1);
	public static Border bordoEt= BorderFactory.createEmptyBorder(25,10,0,10);
	public static MatteBorder borCol= BorderFactory.createMatteBorder(0, 4, 4, 4, scuro);
	public static Border borColHe= BorderFactory.createMatteBorder(4, 4, 0, 4, scuro);
	public static Border borColTut= BorderFactory.createMatteBorder(4, 4, 4, 4, scuro);
	
	public static void showFont() {
		System.out.println("To Know the available font family names"); 
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
  
        System.out.println("Getting the font family names"); 
  
        // Array of all the fonts available in AWT 
        String fonts[] = ge.getAvailableFontFamilyNames(); 
  
        // Getting the font family names 
        for (String i : fonts) { 
            System.out.println(i + " "); 
        } 
	}
}