package Lecture10;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 今日の日付を取得
        Calendar today = Calendar.getInstance();
        /*
         * int todayYear = today.get(Calendar.YEAR);
         * int todayMonth = today.get(Calendar.MONTH) + 1; // 0-based
         * int todayDay = today.get(Calendar.DAY_OF_MONTH);
         */
        Scanner sc = new Scanner(System.in);

        /*
         * int todayYear = sc.nextInt();
         * int todayMonth = sc.nextInt();
         * int todayDay = sc.nextInt();
         */
        int todayYear = 2025;
        int todayMonth = 6;
        int todayDay = 26;

        TestMyBirthday todayBirth = new TestMyBirthday(todayYear, todayMonth * 100 + todayDay);
        System.out.println("【今日の日付】");
        System.out.println(todayBirth.toString());

        // 自分の誕生日を入力

        System.out.println("\n【あなたの誕生日を入力してください】");
        System.out.print("年（西暦）: ");
        int inputYear = scanner.nextInt();
        System.out.print("月: ");
        int inputMonth = scanner.nextInt();
        System.out.print("日: ");
        int inputDay = scanner.nextInt();

        TestMyBirthday myBirth = new TestMyBirthday(inputYear, inputMonth * 100 +
                inputDay);
        System.out.println("→ " + myBirth.toString());

    }
}
