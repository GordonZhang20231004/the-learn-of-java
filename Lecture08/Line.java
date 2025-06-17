package Lecture09;

public class Line {
    private Point p0;
    private double m;

    public Line(Point p, double s) {
        p0 = p;
        m = s;
    }

    public Line(double s, int b) {
        p0 = new Point(0, b);
        m = s;
    }

    public boolean contains(Point p1) {
        if (p0.equals(p1))
            return true;

        return (m == (p1.getY() - p0.getY()) / (p1.getX() - p0.getX()));
    }

    public boolean equals(Line line) {
        return (getSlope() == line.getSlope() && yIntercept() == line.yIntercept());
    }

    public Point getPoint() {
        return p0;
    }

    public double getSlope() {
        return m;
    }

    public double xIntercept() {
        return p0.getX() - p0.getY() / m;
    }

    public double yIntercept() {
        return p0.getY() - m * p0.getX();
    }

    public String toString() {
        return "y = " + (float) m + "x +" + (float) yIntercept();
    }
}
