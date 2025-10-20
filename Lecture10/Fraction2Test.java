package Lecture10;

public class Fraction2Test {
    public static void main(String[] args) {
        /*
         * ・Fraction2(int n, int d):分子と分母をそれぞれnとdにする．
         * ・void add(Fraction2 f): 引数の分数との足し算
         * ・void sub(Fraction2 f): 引数の分数との引き算
         * ・void multi(Fraction2 f): 引数の分数との掛け算
         * ・void div(Fraction2 f): 引数の分数との割り算
         * ・void reduce(): 約分
         * ・double toDecimal(): その分数を小数（double型）に変換した値を返す
         * ・String toString():その分数を表現する文字列("分子/分母")を返す
         * ただし，分母が1のときは分子のみを表す文字列を返す（例えば，4/1のときは"4"を返す）
         */

        System.out.println("----------引数の分数との足し算------------");
        // 分母同じ
        Fraction2 fraction0 = new Fraction2(2, 6);
        fraction0.add(new Fraction2(3, 6));

        // 分母同じじゃない
        Fraction2 fraction1 = new Fraction2(3, 6);
        fraction1.add(new Fraction2(1, 3));
        fraction1.reduce();
        System.out.println(fraction0.toString());
        System.out.println(fraction1.toString());

        System.out.println("----------引数の分数との引き算------------");
        // 分母同じ
        Fraction2 sub0 = new Fraction2(3, 4);
        sub0.sub(new Fraction2(1, 4));
        sub0.reduce();
        // 分母同じじゃない
        Fraction2 sub1 = new Fraction2(2, 3);
        sub1.sub(new Fraction2(1, 6));
        sub1.reduce();
        System.out.println(sub0.toString());
        System.out.println(sub1);

        System.out.println("----------引数の分数との掛け算------------");
        Fraction2 mul = new Fraction2(2, 3);
        mul.multi(new Fraction2(2, 5));
        mul.reduce();
        System.out.println(mul.toString());

        System.out.println("----------引数の分数との割り算------------");
        Fraction2 div = new Fraction2(6, 7);
        div.div(new Fraction2(6, 7));
        div.reduce();
        System.out.println(div.toString());

        System.out.println("----------小数（double型）に変換した値を返す------------");
        Fraction2 decimal = new Fraction2(5, 2);
        System.out.println(decimal.toDecimal());

    }
}
