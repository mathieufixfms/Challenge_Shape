// package fr.entities;

import java.awt.*;
import java.awt.Graphics;

// Shape représente une forme générale.
// Point, Circle et Square pourront hériter de cette classe.

public abstract class Shape {
    private Point center;
    /**
     * Construit une forme à partir des coordonnées de son centre.
     *
     * @param x coordonnée x du centre
     * @param y coordonnée y du centre
     */
    public Shape(int x, int y) {
        this.center = new Point(x, y);
    }
    /**
     * Construit une forme à partir d'un point représentant son centre.
     *
     * @param center point central de la forme
     */
    public Shape(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    //Accesseurs
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Retourne une représentation textuelle de la forme.
     *
     * @return une chaîne contenant le centre de la forme
     */
    @Override
    public String toString() {
        return "Shape [center=" + center + "]";
    }

    /**
     * Dessine la forme dans un contexte graphique.
     * Chaque classe fille doit définir sa propre méthode de dessin.
     *
     * @param g contexte graphique utilisé pour dessiner la forme
     */
    public abstract void draw(Graphics g);

}