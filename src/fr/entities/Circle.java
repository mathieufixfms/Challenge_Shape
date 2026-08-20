public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(double radius, int x, int y){
        setRadius(radius);
        setX(x);
        setY(y);
    }

    public Circle(){
        setRadius(1);
        setX(0);
        setY(0);
    }
     public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if(radius < 0) radius = 1;
        else this.radius = radius;
    }
}
