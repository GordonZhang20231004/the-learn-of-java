package Lecture01To08;

public class TicTacToe2Test {
    public static void main(String[] args) {
        /*
         * 第4回で作成した三目並べで、char型配列dataを引数として勝敗の判定を行うメソッド isWinning(char[][] d)を作成し、
         * 勝敗のメッセージを表示して
         * プログラムが終了するように改良したプログラムTicTacToe2.javaを作成しなさい。
         * なお、このメソッドは縦・横・斜めのいずれか三目が同じ記号（OかX）で揃っていればtrueを、そうでなければfalseを返すものとする。
         */

        char board[][] = {
                { 'O', 'O', 'O' },
                { 'X', 'O', 'X' },
                { 'O', 'X', 'O' } };

        System.out.println(isWinning(board));

    }

    static boolean isWinning(char[][] d) {

        for (int i = 0; i < 3; i++) {
            if (d[i][0] != ' ' && d[i][0] == d[i][1] && d[i][1] == d[i][2]) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (d[0][j] != ' ' && d[0][j] == d[1][j] && d[1][j] == d[2][j]) {
                return true;
            }
        }

        if (d[0][0] != ' ' && d[0][0] == d[1][1] && d[1][1] == d[2][2]) {
            return true;
        }
        if (d[0][2] != ' ' && d[0][2] == d[1][1] && d[1][1] == d[2][0]) {
            return true;
        }

        return false;
    }
}
