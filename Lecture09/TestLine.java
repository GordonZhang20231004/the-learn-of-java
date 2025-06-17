package Lecture09;

public class TestLine {
    public static void main(String[] args) {
        Point p = new Point(5, -4);
        Line line1 = new Line(p, -1);
        System.out.println("line1: " + line1);
        System.out.println("line1.getPoint(): " + line1.getPoint());
        System.out.println("line1.getSlope(): " + line1.getSlope());
        System.out.println("line1.xIntercept(): " + line1.xIntercept());
        System.out.println("line1.yIntercept(): " + line1.yIntercept());
        System.out.println("p: " + p);
        System.out.println("line1.contains(p): " + line1.contains(p));
        Point q = new Point(2, 2);
        System.out.println("q: " + q);
        System.out.println("line1.contains(q): " + line1.contains(q));
        Line line2 = new Line(p, -2);
        System.out.println("line2: " + line2);
        System.out.println("line2.equals(line1): " + line2.equals(line1));
        System.out.println("line1.equals(line2): " + line1.equals(line2));
        Line line3 = new Line(-1, 1);
        System.out.println("line3: " + line3);
        System.out.println("line3.getPoint(): " + line3.getPoint());
        System.out.println("line3.equals(line1): " + line3.equals(line1));
        System.out.println("line1.equals(line3): " + line1.equals(line3));
    }
}
