import javax.swing.JFrame;
 
public class Main {
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("Mes formes");
 
        DrawingPanel panel = new DrawingPanel();
        
        panel.addShape(new Circle(30,100,100));
        panel.addShape(new Square(30,300,300));
        panel.addShape(new Circle(60,500,200));
        panel.addShape(new Square(90,350,50));
 
        frame.add(panel);
 
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}