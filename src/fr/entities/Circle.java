package fr.entities;

import java.awt.*;
/**
 * Représente un cercle défini par un rayon et un centre.
 */
public class Circle extends Shape{

    private double radius;
    /**
     * Construit un cercle à partir de son rayon et des coordonnées de son centre.
     *
     * @param radius rayon du cercle
     * @param x coordonnée x du centre
     * @param y coordonnée y du centre
     */
    public Circle(double radius, int x, int y){
        super(x, y);
        setRadius(radius);
    }

    /**
     * Construit un cercle à partir de son rayon et d'un point central.
     *
     * @param radius rayon du cercle
     * @param center centre du cercle
     */
    public Circle(double radius, Point center){
        super(center);
        setRadius(radius);
    }

    //Accesseurs
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            this.radius = 1;
        }
        else{
            this.radius = radius;
        }
    }

    /**
     * Dessine le cercle dans le contexte graphique fourni.
     *
     * @param g contexte graphique utilisé pour le dessin
     */
    @Override
    public void draw(Graphics g) {
        g.drawOval(getCenter().getX(), getCenter().getY(), (int) getRadius(), (int) getRadius());
    }
}
