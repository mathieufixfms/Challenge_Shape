import java.awt.*;

public class Square extends Shape {

    //Attributs
    private int side;
 
    public Square(int side, int x, int y) {
        super(x, y);
        setSide(side);
    }
 
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

    @Override
    public void draw(Graphics g) {

    }
}