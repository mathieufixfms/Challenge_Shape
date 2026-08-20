//package fr.entities;

import java.awt.*;
/**
 * Représente un carré défini par la longueur de son côté et son centre.
 */
public class Square extends Shape {

    //Attributs
    private int side;
    /**
     * Construit un carré à partir de la longueur de son côté
     * et des coordonnées de son centre.
     *
     * @param side longueur du côté du carré
     * @param x coordonnée x du centre
     * @param y coordonnée y du centre
     */
    public Square(int side, int x, int y) {
        super(x, y);
        setSide(side);
    }
    /**
     * Construit un carré à partir de la longueur de son côté
     * et d'un point central.
     *
     * @param side longueur du côté du carré
     * @param center centre du carré
     */
    public Square(int side, Point center) {
        super(center);
        setSide(side);

    }

    //Accesseurs
    public int getSide() {
        return side;
    }
 
    public void setSide(int side) {
        if (side < 0) side = 0;
        else this.side = side;
    }
    /**
     * Dessine le carré dans le contexte graphique fourni.
     *
     * @param g contexte graphique utilisé pour le dessin
     */
    @Override
    public void draw(Graphics g) {
        g.drawRect(getCenter().getX(), getCenter().getY(), getSide(), getSide());
    }
}