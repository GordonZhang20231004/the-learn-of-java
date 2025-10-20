package Lecture09;

public class Test {
    /*
     * ３X３の2次元配列のゲーム盤をメンバとして持つ、クラスTicTacToeを作成しなさい。
     * なお、このクラスは次のメソッドを有するものとする。また、メンバーには２次元配列以外のものも含めてもよい。
     * 
     * 
     * 現在の状況が先行入力待ちであるときメソッドisFirst()はtrueを返し、後攻の入力待ちであるときはfalseを返す。
     * メソッドsetMark(行, 列)は、その時のターンに対応した記号（○か×）を2次元配列の指定した場所に代入する。
     * メソッドisEmpty(行,列)は、2次元配列の指定した場所に記号がまだ入力されていないときtrueを返し、それ以外はfalseを返す。
     * メソッドshow()でゲーム盤を表示する。
     * メソッドisWinning()は、縦・横・斜めのいずれかで記号が全て揃った時にtrueを返し、それ以外はfalseを返す。
     */
    private char[][] gameBoard;
    private boolean initialState;

    public Test() {
        gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }

    }

    // isFirst()
    public boolean isFirst() {
        return initialState;
    }

    // setMark
    public void setMark(int row,int col){
        if (isEmpty(row, col)) {
            gameBoard[row][col];
        }

    }

    // isEmpty
    public boolean isEmpty(int row, int col) {
        if (gameBoard[row][col] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    // show()
    public void show() {
        for (int i = 0; i < 3; i++) {
            System.out.println(gameBoard[i][0] + " | " + gameBoard[i][1] + " | " + gameBoard[i][2]);
            if (i < 2) {
                System.out.println("-------------");
            }
        }
    }

    // isWinning()
    public boolean isWinning() {

        // 横and縦
        for (int i = 3; i < 3; i++) {
            if (gameBoard[i][0] != ' ' && gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2]) {
                return true;
            }
            if (gameBoard[0][i] != ' ' && gameBoard[0][i] == gameBoard[1][i] && gameBoard[1][i] == gameBoard[2][i]) {
                return true;
            }

        }

        // 対角線
        if (gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
            return true;
        }
        if (gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][0]) {
            return true;
        }

        return false;
    }
}
