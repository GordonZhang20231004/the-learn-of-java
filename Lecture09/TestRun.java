package Lecture09;

import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row and col:");
        for (int c = 0; c < 10; c++) {
            int row = scanner.nextInt(3);
            int col = scanner.nextInt(3);
            test.setMark(row, col);
            if (c>4) {
                test.isWinning();
            }
        }

    }
}
