import java.awt.Graphics;

public class Point extends Shape{
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// Chaque Shape doit avoir sa propre méthode draw().
    @Override
    public void draw(Graphics g) {

        // Un point est représenté ici par un petit carré de 2x2 pixels.
        g.fillRect(x, y, 2, 2);
    }
}

