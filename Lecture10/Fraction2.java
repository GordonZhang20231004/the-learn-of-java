package Lecture10;

public class Fraction2 {
    private int num;
    private int den;// 分母

    public Fraction2(int n, int d) {
        num = n;
        den = d;
    }

    public void add(Fraction2 f) {
        if (den == f.den) {
            num = this.num + f.num;
            den = this.den;
        } else {
            num = num * f.den + f.num * den;
            den = den * f.den;
        }

    }

    public void sub(Fraction2 f) {
        if (f.den == this.den) {
            num = this.num - f.num;
            den = this.den;
        } else {
            num = num * f.den - f.num * den;
            den = den * f.den;
        }

    }

    public void multi(Fraction2 f) {
        num *= f.num;
        den *= f.den;

    }

    public void div(Fraction2 f) {

        numerator *= f.denominator;
        denominator *= f.numerator;

    }

    public int gcd(int numerator, int denominator) {
        return denominator == 0 ? numerator : gcd(denominator, numerator % denominator);
    }

    public void reduce() {
        int gcd = gcd(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    // その分数を小数（double型）に変換した値を返す
    public double toDecimal() {
        return (double) num / den;
    }

    // その分数を表現する文字列("分子/分母")を返す
    public String toString() {
        if (den == 1) {
            return new String(num + " ");
        }
        return new String(num + "/" + den);
    }

    // getter
    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

}
