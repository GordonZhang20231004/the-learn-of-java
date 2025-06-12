package Lecture01To08;

public class TestPermutation {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(format(p(i, j), 8));
            }
        }
    }

    static long p(int n, int k) {
        return f(n) / f(n - k);
    }

    // 阶乘
    static long f(int n) {
        long f = 1;
        while (n > 1) {
            f *= n--;
        }
        return f;
    }

    static String format(long n, int width) {
        final String BLANKS = "----------------";
        String s = String.valueOf(n);
        return BLANKS.substring(0, width - s.length()) + s;
    }
}
