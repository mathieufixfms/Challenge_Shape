import javax.swing.JFrame;
 
public class Main {
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("Mes formes");
 
        DrawingPanel panel = new DrawingPanel();
 
        frame.add(panel);
 
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}