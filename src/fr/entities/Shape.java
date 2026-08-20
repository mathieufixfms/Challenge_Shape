import java.awt.Graphics;


// Shape représente une forme générale.
// Point, Circle et Square pourront hériter de cette classe.
public abstract class Shape {

    // Chaque forme DOIT savoir se dessiner.
    // Mais la façon de se dessiner dépend de la forme.
    public abstract void draw(Graphics g);
}