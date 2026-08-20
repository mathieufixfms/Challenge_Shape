import javax.swing.JFrame;
 
public class Main {
 
    public static void main(String[] args) {
 
		// 1. Création de la fenêtre
        JFrame frame = new JFrame("Mes formes");
 
		// 2. Création de notre surface de dessin
        DrawingPanel panel = new DrawingPanel();
        
        panel.addShape(new Circle(30,100,100));
        panel.addShape(new Square(30,300,300));
        panel.addShape(new Circle(60,500,200));
        panel.addShape(new Square(90,350,50));
 
		// 3. On ajoute la surface dans la fenêtre
        frame.add(panel);
 
		// 4. On définit la taille de la fenêtre
        frame.setSize(600, 400);
		
		// Ferme réellement le programme quand on ferme la fenêtre.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 6. On affiche la fenêtre
        frame.setVisible(true);
    }
}