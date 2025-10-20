package Lecture10;

public class Vector2D {
    private int x;
    private int y;

    public Vector2D(Point p1, Point p2) {
        this.x = p2.x - p1.x;
        this.y = p2.y - p1.y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public void add(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void sub(Vector2D v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public void mult(int k) {
        this.x *= k;
        this.y *= k;
    }

    // 内積を計算する
    /*
     * 求め方１
     * a ≠ 0, b ≠ 0, a と b のなす角を θ とするとき
     * 内積 a・b = |a| |b| cosθ
     * 
     * 求め方２
     * a = (x₁, y₁), b = (x₂, y₂) であるとき、
     * 内積 a・b = x₁x₂ + y₁y₂
     * x 成分の積 + y 成分の積
     */
    public double dot(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    // 平行であるかどうかを判定する
    /*
     * 2 つのベクトル a = (x_1, y_1)、b = (x_2, y_2) が平行 ⇔ 「x₁y₂ = x₂y₁」
     * 
     * つまり、比率が等しいかどうかを確認します。ただし 0 除算に注意が必要です。
     */
    public boolean isParallel(Vector2D v) {
        return this.x * v.y == this.y * v.x;
    }

    // 垂直であるかどうかを判定する
    /*
     * 2つのベクトル a = (x_1, y_1)、b = (x_2, y_2) が垂直 ⇔
     * 内積 a \cdot b = x_1x_2 + y_1y_2 = 0 であるとき。
     */
    public boolean isVertical(Vector2D v) {
        return this.x * v.x + this.y * v.y == 0;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
