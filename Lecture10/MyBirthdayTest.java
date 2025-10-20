package Lecture10;

import java.util.Scanner;

public class MyBirthdayTest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("今日の日付を入力してください");

        System.out.print("年（西暦）: ");
        int year = sc.nextInt();
        System.out.print("月: ");
        int month = sc.nextInt();
        System.out.print("日: ");
        int day = sc.nextInt();
        System.out.println(new MyBirthday(year, month, day).toString());

        System.out.println("自分生年月日を入力してください");
        System.out.print("年（西暦）: ");
        int birthdayYear = sc.nextInt();
        System.out.print("月: ");
        int birthdayMonth = sc.nextInt();
        System.out.print("日: ");
        int birthdayDay = sc.nextInt();

        System.out.println(new MyBirthday(birthdayYear, birthdayMonth, birthdayDay).toString());

    }
}
