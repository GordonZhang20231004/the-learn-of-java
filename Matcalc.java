import java.util.Scanner;

public class Matcalc {

    static int[][] transMat(int[][] mat) {
        int rows = mat.length;// 行
        int cols = mat[0].length;// 列
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }

    public static int[][] multMat(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    // 行列表示用メソッド
    public static void printOut(int[][] mat) {
        for (int[] rows : mat) {
            for (int val : rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 行列A
        int[][] A = new int[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.println("Aの " + i + "行目:");
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 行列B
        int[][] B = new int[3][2];
        for (int i = 0; i < 3; i++) {
            System.out.println("Bの " + i + "行目:");
            for (int j = 0; j < 2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Aの転置AT:");
        int[][] AT = transMat(A);
        printOut(AT);

        System.out.println("Bの転置BT:");
        int[][] BT = transMat(B);
        printOut(BT);

        System.out.println("掛け算AxB:");
        int[][] AB = multMat(A, B);
        printOut(AB);

        System.out.println("掛け算(AxB)後の行列の転置(AB)^T:");
        int[][] ABT = transMat(AB);
        printOut(ABT);

        System.out.println("BTとATの掛け算BT×AT:");
        int[][] BT_AT = multMat(BT, AT);
        printOut(BT_AT);

        scanner.close();

    }
}
