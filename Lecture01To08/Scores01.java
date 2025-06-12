package Lecture01To08;

import java.util.Random;

public class Scores01 {
    public static void main(String[] args) {
        final int studentNumer = 80;
        double[][] scores = new double[studentNumer][2];
        char[] grades = new char[studentNumer];

        Random rand = new Random();

        for (int i = 0; i < studentNumer; i++) {
            scores[i][0] = Math.round(rand.nextDouble() * 1000) / 10.0; // 中间考试
            scores[i][1] = Math.round(rand.nextDouble() * 1000) / 10.0; // 期末考试
        }

        // 最低的中间成绩and最高的期末成绩
        double minMidterm = 100.0;
        for (int i = 0; i < studentNumer; i++) {
            if (scores[i][0] < minMidterm) {
                minMidterm = scores[i][0];
            }
        }

        double maxFinal = 0.0;
        for (int i = 0; i < studentNumer; i++) {
            if (scores[i][1] > maxFinal) {
                maxFinal = scores[i][1];
            }
        }

        // 评价
        for (int i = 0; i < studentNumer; i++) {
            double average = (scores[i][0] + scores[i][1]) / 2.0;
            if (average < 60) {
                grades[i] = 'D';
            } else if (average < 70) {
                grades[i] = 'C';
            } else if (average < 80) {
                grades[i] = 'B';
            } else if (average < 90) {
                grades[i] = 'A';
            } else {
                grades[i] = 'S';
            }
        }

        for (int i = 0; i < studentNumer; i++) {
            System.out.printf("%2d  %5.1f  %5.1f  %c\n", i, scores[i][0], scores[i][1], grades[i]);
        }

        System.out.printf("\n最低中间成绩: %.1f\n", minMidterm);
        System.out.printf("最高期末成绩: %.1f\n", maxFinal);

    }
}
