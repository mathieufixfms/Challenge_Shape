/**
 * Programme permettant l'affichage de plusieurs formes g�om�triques
 * 
 * @author El babili - 2023
 * 
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Graphic() {
		super("Voici nos formes g�om�triques !");			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override	//le rep�re x,y commence en haut � gauche (0,0)
	public void paint(Graphics g) {	
		super.paint(g);
		
		g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diam�tre)
		g.drawOval(150, 50, 45, 70);
		g.drawRect(50, 150, 50, 50);
		g.fillRect(150, 150, 70, 50);		
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
		g2d.fillRect(250, 50, 70, 50);		
		
		g2d.fillOval(250,150,55,55);		
	}
	
	public static void main(String[] args) {
		new Graphic();
	}
}
