package Lecture01To08;

import java.util.Random;

public class TestOverloading2 {
    public static void main(String[] args) {
        /*
         * TestOverloading2.javaを作成する。
         * 2変数を扱うことができるmax(int x1, int x2)、
         * および３変数を扱うことができるmax(int x1, int x2, int x3)を作成してから
         * 
         * ４変数をあつかうことのできるmax(int x1, int x2, int x3, int x4)を作成しなさい。
         * なお、このmaxでは3変数を扱うmax(int x1, int x2, int x3)を呼び出すものとし、
         * このmaxでは2変数を扱うmax(int x1, int x2)を呼び出すものとする。
         */

        Random random = new Random();
        int number0 = random.nextInt(10);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(10);
        System.out.println("number0-3:{" + number0 + "," + number1 + "," + number2 + "," + number3 + "}");
        System.out.println("四つの数字の中で最大値の数字は: " + max(number0, number1, number2, number3));

    }

    static int max(int x1, int x2) {
        return x1 > x2 ? x1 : x2;
    }

    static int max(int x1, int x2, int x3) {
        return max(max(x1, x2), x3);
    }

    static int max(int x1, int x2, int x3, int x4) {
        return max(max(x1, x2, x3), x4);
    }
}
