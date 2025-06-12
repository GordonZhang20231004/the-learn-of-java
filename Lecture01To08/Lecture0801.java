package Lecture01To08;

//再帰呼び出しの授業での練習
public class Lecture0801 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("f(" + i + ")" + f(i));
        }
    }

    // 階乗
    static long f(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * f(n - 1);
        }

    }

    // 前回のメソッド
    static long f1(int n) {
        long f = 1;
        while (n > 1) {
            f *= n--;
        }
        return f;
    }
}
