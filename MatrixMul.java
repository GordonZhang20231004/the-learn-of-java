import java.util.Random;
import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        int m = scanner.nextInt(); // A行
        int n = scanner.nextInt(); // A列
        int p = scanner.nextInt(); // B行
        int q = scanner.nextInt(); // B列

        if (n != p) {
            System.out.println("エラ〜");
            return;
        }

      
        int[][] A = new int[m][n];
        int[][] B = new int[p][q];
        int[][] ans = new int[m][q];

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand.nextInt(10); // 0-9
            }
        }

   
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = rand.nextInt(10);
            }
        }

   
        System.out.println("Matrix A:");
        printMatrix(A);

  
        System.out.println("Matrix B:");
        printMatrix(B);

        // 计算A * B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 输出结果
        System.out.println("A x B =");
        printMatrix(ans);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
