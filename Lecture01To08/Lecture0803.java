package Lecture01To08;

import java.util.Random;

public class Lecture0803 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(100);
            int b = rand.nextInt(100);
            int c = rand.nextInt(100);

            System.out.println("min(" + a + ", " + b + ", " + c + ") = " + min(a, b, c));
        }
    }

    static int min(int a, int b, int c) {
        // TODO Auto-generated method stub
        // 方法一
        /*
         * int midNum = 0;
         * midNum = a < b ? a : b;
         * 
         * return midNum < c ? midNum : c;
         */

        // 方法二
        return min(min(a, b), c);
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
