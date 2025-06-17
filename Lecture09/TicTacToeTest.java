package Lecture09;

import java.util.Scanner;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToe tic = new TicTacToe();

        tic.show();
        System.out.println("先行者（O）入力待っています！");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            tic.setMark(row, col);
            tic.show();
            if (i >= 5) {

                if (tic.isWinning()) {
                    if (i % 2 == 0) {
                        System.out.println("<X>" + "has already won");
                        return;
                    } else {
                        System.out.println("<O>" + "has already won");
                        return;
                    }

                }

            }

        }

    }
}
