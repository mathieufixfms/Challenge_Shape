package fr.entities;
/**
 * Représente un point dans un plan, défini par ses coordonnées x et y.
 */
public class Point {
	private int x;
	private int y;
	/**
	 * Construit un point à partir de ses coordonnées.
	 *
	 * @param x coordonnée horizontale du point
	 * @param y coordonnée verticale du point
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Accesseurs
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

	/**
	 * Retourne une représentation textuelle du point.
	 *
	 * @return une chaîne contenant les coordonnées du point
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

