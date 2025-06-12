package Lecture09;

public class PointTest {
    public static void main(String[] args) {

        Point p = new Point(2, -3);
        System.out.println("p: " + p);
        System.out.println("p.getX(): " + p.getX());
        System.out.println("p.getY(): " + p.getY());

        Point q = new Point(7, 4);
        System.out.println("q " + q);
        System.out.println("q.getX(): " + q.getX());
        System.out.println("q.getY(): " + q.getY());

        System.out.println("q.equals(p): " + q.equals(p));
        System.out.println("q.equals(q): " + q.equals(q));
    }
}
