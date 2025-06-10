//再帰呼び出しの授業での練習
public class Lecture08 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("f(" + i + ")" + f(i));
        }
    }

    static long f(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * f(n - 1);
        }

    }
}
