package fr.entities;

import java.awt.*;

public class Shape {
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
}