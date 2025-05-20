import java.util.Random;

public class Day2025052002 {
    public static void main(String[] args) {

        int[] numberArray = new int[4];
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(3) + 1;
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        // 拡張for
        for (int nu : numberArray) {
            System.out.print("====" + nu + " ");
        } // ====3 ====2 ====1 ====1 %

    }
}
