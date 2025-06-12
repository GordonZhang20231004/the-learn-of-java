package Lecture01To08;

public class test {
    public static void main(String[] args) {
        // 次の考え方に従って0～9をカンマ区切りで表示するプログラムを書いてください．
        // 0.1.2.3.4.5.6.7.8.9
        /*
         * for (int i = 0; i < 10; i++) {
         * if (i > 0) {
         * System.out.print(",");
         * }
         * System.out.print(i);
         * }
         */

        // ---------------------------------------------------
        int[][] mat = { { 5, 2, 7 }, { 3, 9, 8 }, { 6, 1, 0 }, { 5, 5, 5 } };
        // 表形式で出力
        /*
         * 目的
         * 5 2 7 | 14
         * 3 9 8 | 20
         * 6 1 0 | 7
         * 5 5 5 | 25
         */

        /*
         * for (int i = 0; i < mat.length; i++) {
         * int c = 0;
         * for (int j = 0; j < mat[i].length; j++) {
         * System.out.print("  " + mat[i][j]);
         * c += mat[i][j];
         * }
         * System.out.print(" | " + c);
         * System.out.println();
         * }
         */

        /*
         * 1行目の整数の総和を計算
         * 5 2 7 | 14
         * 3 9 8 | 20
         * 6 1 0 | 7
         * 5 5 5 | 15
         * 19 17 20
         */

        /*
         * for (int j = 0; j < mat[0].length; j++) {
         * int c = 0;
         * for (int i = 0; i < mat.length; i++) {
         * c += mat[i][j];
         * }
         * System.out.print(" " + c);
         * }
         * System.out.println();
         */

    }
}
