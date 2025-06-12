package Lecture01To08;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
         * 閏年を判定するboolean型のメソッド isLeapYear() を作成しなさい（LeapYear.javaで作成しなさい）。
         * なお、isLeapYear()はint型の引数の値が閏年であればtrue、そうでなければfalseを返すものとする。
         * 
         * 閏年は、
         * １ ４００で割り切れたら閏年
         * ２ １００で割り切れたら閏年ではない
         * ３ ４で割り切れたら閏年
         * ４ それ以外は閏年ではない
         * として計算をすること。
         */
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        outPrint(isLeapYear(year), year); // true

    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static void outPrint(boolean ifOrNotLeapYear, int year) {

        if (ifOrNotLeapYear) {
            System.out.println(year + "が閏年です");
        } else {
            System.out.println(year + "が閏年ではない");
        }
    }
}
