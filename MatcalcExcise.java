import java.util.Scanner;

public class MatcalcExcise {
    static void printOut(int[][] data) {
        for (int[] rows : data) {
            for (int row : rows) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    // 転置
    static int[][] transMat(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] transPosed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transPosed[j][i] = data[i][j];
            }
        }
        return transPosed;
    }

    // 掛け算
    static int[][] multMat(int[][] mat1, int[][] mat2) {
        int raws1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        int[][] result = new int[raws1][cols2];
        for (int i = 0; i < raws1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A 2*3
        int[][] a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.println("Aの" + i + "行目");
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        // B 3*2
        int[][] b = new int[3][2];
        for (int m = 0; m < 3; m++) {
            System.out.println("Bの" + m + "行目");
            for (int n = 0; n < 2; n++) {
                b[m][n] = scanner.nextInt();
            }
        }
        System.out.println("行列A: ");
        printOut(a);
        System.out.println("行列B: ");
        printOut(b);

        System.out.println("Aの転置AT: ");
        printOut(transMat(a));
        System.out.println("Bの転置BT: ");
        printOut(transMat(b));
        System.out.println("掛け算AxB:");
        printOut(multMat(a, b));
        System.out.println("掛け算(AxB)後の行列の転置(AxB)T: ");
        printOut(transMat(multMat(a, b)));
        System.out.println("BTとATの掛け算BTxAT: ");
        printOut(multMat(transMat(b), transMat(a)));

    }
}
