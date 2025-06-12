package Lecture01To08;

import java.util.Scanner;

public class TicTacToe2 {
    public static void printBoard(char[][] data) {
        int i, j;
        i = j = 0;

        /* 通常のfor文で書いた方が綺麗だけれど、拡張for文の動作確認のために */
        for (char[] col : data) {
            for (char row : col) {
                System.out.print(row);
                if (j != col.length - 1) {
                    System.out.print('|');
                } else {
                    System.out.println();
                }
                j++;
            }
            i++;
            j = 0;
            if (i != col.length) {
                System.out.println("--+--+--");
            }
        }
    }

    public static void main(String[] args) {
        char board[][] = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };

        // ここにどんなものが入るかを考えよう！
        Scanner scanner = new Scanner(System.in);
        char firstPlayer = 'O';
        char secondPlayer = 'X';
        boolean status = true;// 先手：true 後手：false

        // 最大9回
        for (int turn = 0; turn < 9; turn++) {

            System.out.print("何行何列なのか？入力してください。まずは行を入力してください: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            // 規則を違反した状況:１）範囲外；２）駒がある
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("範囲外です!");
                turn--;
                continue;
            }
            if (board[row][col] != ' ') {
                System.out.println("位置にはすでに駒があります。別の位置を選んでください。");
                turn--;
                continue;
            }
            if (status) {
                board[row][col] = firstPlayer;
                status = false;
            } else {
                board[row][col] = secondPlayer;
                status = true;
            }

            // 実行して盤面を表示する
            printBoard(board);
        }

        System.out.println(isWinning(board));
    }

    static boolean isWinning(char[][] d) {

        for (int i = 0; i < 3; i++) {
            if (d[i][0] != ' ' && d[i][0] == d[i][1] && d[i][1] == d[i][2]) {
                System.out.print(d[0][0] + ": ");
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (d[0][j] != ' ' && d[0][j] == d[1][j] && d[1][j] == d[2][j]) {
                System.out.print(d[0][0] + ": ");
                return true;
            }
        }

        if (d[0][0] != ' ' && d[0][0] == d[1][1] && d[1][1] == d[2][2]) {
            System.out.print(d[0][0] + ": ");
            return true;
        }
        if (d[0][2] != ' ' && d[0][2] == d[1][1] && d[1][1] == d[2][0]) {
            System.out.print(d[0][2] + ": ");
            return true;
        }

        return false;
    }
}
