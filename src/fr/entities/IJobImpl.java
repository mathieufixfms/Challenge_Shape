//package fr.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


// cré une surface de dessin
// contient le Graphics et qui s'occupe de redessiner les formes.
public class IJobImpl extends JPanel {
	
	// Liste de toutes les formes que l'on veut afficher.
    // On utilise Shape car la liste peut contenir : des Point, des Circle, des Square, etc.
    private List<Shape> shapes = new ArrayList<>();
	
	
	// Cette méthode permet au Main d'ajouter une forme dans notre surface de dessin.
    public void addShape(Shape shape) {
        shapes.add(shape);

        // Demande à Swing de redessiner le panneau.
        // Cela provoquera un nouvel appel à paintComponent().
        repaint();
    }

// ici java cré un objet graphic
// paintComponent est une methode heritée de JPanel appelée automatiquement par Swing
// lorsqu'il faut dessiner ou redessiner le panneau.
    @Override
	protected void paintComponent(Graphics g) {
		// Toujours appeler super.paintComponent(g) au début. Cela nettoie l'ancien dessin.
		super.paintComponent(g);

		// On parcourt toutes les formes que le Main a ajoutées.
		for (Shape shape : shapes) {
			// Chaque forme sait elle-même comment se dessiner.
			shape.draw(g);
		}
	}
	
	// Méthode permettant de dessiner un point.
    public void drawPoint(Graphics g, int x, int y) {
        g.fillRect(x, y, 2, 2);
    }

	// Méthode permettant de dessiner un rectangle.
    public void fillRect(Graphics g, int x, int y, int largeur, int hauteur) {
        g.fillRect(x, y, largeur, hauteur);
    }
	
	// Méthode permettant de dessiner un cercle.
    public void fillCircle(Graphics g, int x, int y, int diametre) {
        g.fillOval(x, y, diametre, diametre);
    }
}