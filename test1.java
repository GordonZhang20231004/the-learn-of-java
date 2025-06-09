import java.util.Arrays;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        int[][] scores = new int[3][2];
        Random rand = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i][0] = rand.nextInt(101);
            scores[i][1] = rand.nextInt(101);

        }
        System.out.println(Arrays.deepToString(scores));
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                int scor = scores[i][j];
                System.out.println(scor);
                // System.out.print(scores[i][j] + " ");
            }
            System.out.println(); // 换行
        }

    }
}
