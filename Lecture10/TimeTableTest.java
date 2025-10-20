package Lecture10;

public class TimeTableTest {
    public static void main(String[] args) {
        TimeTable tt = new TimeTable(2025001, "GordonZhang");

        tt.regist(0, 0, "Math"); // 月曜-1限
        tt.regist(1, 2, "English"); // 火曜-3限
        tt.regist(2, 1, "Physics"); // 水曜-2限
        tt.regist(3, 3, "Programming"); // 木曜-4限
        tt.regist(4, 4, "PE"); // 金曜-5限

        tt.show();
    }
}
