package Lecture10;

public class TimeTable {
    private int studentID;
    private String studentName;
    private Subject[][] schedule;

    public TimeTable(int k, String name) {
        this.studentID = k;
        this.studentName = name;
        this.schedule = new Subject[5][5]; // 月〜金 × 1〜5時限
    }

    public void regist(int w, int t, String s) {
        schedule[w][t] = new Subject(s);
    }

    public int countCredits() {
        int credits = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (schedule[i][j] != null) {
                    schedule[i][j].takeExam();
                    schedule[i][j].getRank();
                    if (schedule[i][j].isCreditEarned()) {
                        credits++;
                    }
                }
            }
        }
        return credits;
    }

    public void show() {
        System.out.println("学生番号: " + studentID);
        System.out.println("氏名: " + studentName);
        System.out.println("時間割:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "限目: ");
            for (int j = 0; j < 5; j++) {
                if (schedule[j][i] != null) {
                    System.out.print(schedule[j][i].toString() + "\t");
                } else {
                    System.out.print("[空]\t");
                }
            }
            System.out.println();
        }
        int totalCredits = countCredits();
        System.out.println("取得単位数: " + totalCredits);
    }
}
