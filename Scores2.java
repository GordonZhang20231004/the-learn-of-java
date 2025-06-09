import java.util.Random;

public class Scores2 {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static int min(int x, int y) {
        return x < y ? x : y;
    }

    static double avg(int x, int y) {
        return (x + y) / 2.0;
    }

    static char rank(int x, int y) {
        double average = avg(x, y);
        if (average < 60)
            return 'D';
        else if (average < 70)
            return 'C';
        else if (average < 80)
            return 'B';
        else if (average < 90)
            return 'A';
        else
            return 'S';
    }

    static int subAbsolute(int x, int y) {
        return x > y ? x - y : y - x;
    }

    static void gradeProcessing(int[][] data) {
        int n = data.length;
        char[] grades = new char[n];
        Random rand = new Random();

        // 1. ランダムの成績 0中間試験 １期末試験
        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(101);
            data[i][1] = rand.nextInt(101);
            grades[i] = rank(data[i][0], data[i][1]);
        }

        System.out.print("全学生の中間試験と期末試験の差の絶対値: ");
        int midAllScore = 0;
        int finalAllScore = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            midAllScore += data[i][0];
            finalAllScore += data[i][1];
            diff = subAbsolute(midAllScore, finalAllScore);

        }
        System.out.println("全学生の中間試験と期末試験の差の絶対値" + diff);

    }

    // main方法
    public static void main(String[] args) {
        int[][] scores = new int[80][2];
        gradeProcessing(scores);

    }

}