import java.awt.*;
import java.awt.Graphics;

// Shape représente une forme générale.
// Point, Circle et Square pourront hériter de cette classe.

public abstract class Shape {
    private Point center;

    public Shape(int x, int y) {
        this.center = new Point(x, y);
    }

    public Shape(Point center) {
        this.center = new Point(center.x, center.y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Shape [center=" + center + "]";
    }

    // Chaque forme DOIT savoir se dessiner.
    // Mais la façon de se dessiner dépend de la forme.
    public abstract void draw(Graphics g);

}