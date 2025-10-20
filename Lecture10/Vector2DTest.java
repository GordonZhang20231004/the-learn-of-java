package Lecture10;

public class Vector2DTest {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(2, 0);

        Vector2D v1 = new Vector2D(p1, p2);
        Vector2D v2 = new Vector2D(p1, p3);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        System.out.println("v1.length() = " + v1.length());
        System.out.println("v1.dot(v2) = " + v1.dot(v2));
        System.out.println("v1 is parallel to v2: " + v1.isParallel(v2));
        System.out.println("v1 is vertical to v2: " + v1.isVertical(v2));

        v1.add(v2);
        System.out.println("v1 + v2 = " + v1);

        v1.sub(v2);
        System.out.println("v1 - v2 = " + v1);

        v1.mult(2);
        System.out.println("v1 * 2 = " + v1);
    }
}
