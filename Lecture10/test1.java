package Lecture10;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 2025;
        int m = 6;
        int d = 26;
        MyBirthday mb = new MyBirthday(y, m, d);
        System.out.println(mb.toString());
    }
}
