import java.awt.*;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius, int x, int y){
        super(x, y);
        setRadius(radius);
    }

    public Circle(double radius, Point center){
        super(center);
        setRadius(radius);
    }

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

    @Override
    public void draw(Graphics g) {
        g.drawOval(getCenter().getX(), getCenter().getY(), (int) getRadius(), (int) getRadius());
    }
}
