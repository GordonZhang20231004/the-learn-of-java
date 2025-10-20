package Lecture10;

import java.util.Random;

public class Subject {
    private String name;
    private int score;
    private char grade;

    public Subject(String name) {
        this.name = name;
        this.score = 0;
        this.grade = 'F';
    }

    public void takeExam() {
        Random rand = new Random();
        this.score = rand.nextInt(51) + 50; // 50〜100の一様乱数
    }

    public void getRank() {
        if (score < 60)
            grade = 'D';
        else if (score < 70)
            grade = 'C';
        else if (score < 80)
            grade = 'B';
        else if (score < 90)
            grade = 'A';
        else
            grade = 'S';
    }

    public boolean isCreditEarned() {
        return grade != 'D';
    }

    public String toString() {
        return name + "(" + score + ", " + grade + ")";
    }
}
