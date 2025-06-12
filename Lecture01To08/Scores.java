package Lecture01To08;

import java.util.Random;

public class Scores {
    public static void main(String[] args) {

        int[][] scores = new int[80][2]; // 80个学生，中间与期末各一列
        gradeProcessing(scores);
    }

    // 最大値
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    // 最小値
    static int min(int x, int y) {
        return x < y ? x : y;
    }

    // 平均値
    static double avg(int x, int y) {
        return (x + y) / 2.0;
    }

    // 絶対値
    static int subAbsolute(int x, int y) {
        return x > y ? x - y : y - x;
    }

    // 学生の評価
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

    // 中央揃え
    static String center(String text, int width) {
        int padding = width - text.length();
        if (padding <= 0)
            return text;
        int padStart = padding / 2;
        int padEnd = padding - padStart;
        return spaces(padStart) + text + spaces(padEnd);
    }

    public static String spaces(int n) {
        String s = "";
        for (int i = 0; i < n; i++)
            s += " ";
        return s;
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
        // 2. 中間試験の成績の最も悪いもの
        int minMid = data[0][0];
        for (int i = 1; i < n; i++) {
            minMid = min(minMid, data[i][0]);
        }
        System.out.println("中間試験の成績の最も悪いもの:" + minMid);

        // 3. 期末に最も良い成績
        int maxFinal = data[0][1];
        for (int i = 1; i < n; i++) {
            maxFinal = max(maxFinal, data[i][1]);
        }
        System.out.println("期末試験の成績の最も良いもの:" + maxFinal);

        System.out.println("各学生の成績・評価の情報は以下です：");
        String[] headers = { "[学生番号]", "[中間試験の成績]", "[期末試験の成績]", "[評価]" };
        int colWidth = 10;
        // 4.表を出力すること
        for (String header : headers) {
            System.out.print(center(header, colWidth));
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(center(String.valueOf(i + 1), colWidth)); // 学生番号
            System.out.print(center(String.valueOf(data[i][0]), 13)); // 中間
            System.out.print(center(String.valueOf(data[i][1]), 14)); // 期末
            System.out.print(center(String.valueOf(grades[i]), 18)); // 評価
            System.out.println();
        }

        // 5. 絶対値を表示すること
        System.out.print("全学生の中間試験と期末試験の差の絶対値: ");
        int midAllScore = 0;
        int finalAllScore = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            midAllScore += data[i][0];
            finalAllScore += data[i][1];
            diff = subAbsolute(midAllScore, finalAllScore);
        }
        System.out.println(diff);
    }

}
