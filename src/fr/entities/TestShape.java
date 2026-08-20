package fr.entities;

public class TestShape {
    public static void main(String[] args) {

            Circle c1 = new Circle(20, 30, 50);
            Point p = new Point(100, 150);
            Circle c2 = new Circle(15, p);

            Square s1 = new Square(50, 200, 200);
            Square s2 = new Square(65, 200, 50);

            Circle c3 = new Circle(30, 300, 300);

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(c3);
        }
    }

