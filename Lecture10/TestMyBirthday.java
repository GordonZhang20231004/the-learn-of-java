package Lecture10;

public class TestMyBirthday {

    private int year;
    private int month;
    private int day;

    public TestMyBirthday(int year, int monthDay) {
        this.year = year;
        this.month = monthDay / 100;
        this.day = monthDay % 100;
    }

    public String toWareki() {
        if (year > 2019 || (year == 2019 && month >= 5)) {
            return "令和" + (year - 2018);
        } else if (year >= 1989 && (year < 2019 || (year == 2019 && month < 5))) {
            return "平成" + (year - 1988);
        } else if (year >= 1926 && (year < 1989 || (year == 1989 && month < 1))) {
            return "昭和" + (year - 1925);
        } else if (year >= 1912 && (year < 1926 || (year == 1926 && month < 12))) {
            return "大正" + (year - 1911);
        } else if (year >= 1868) {
            return "明治" + (year - 1867);
        } else {
            return "対象外";
        }
    }

    public String getDayOfWeek() {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;
        int J = y / 100;
        int h = (day + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        System.out.println("============h:" + h);
        String[] week = { "土", "日", "月", "火", "水", "木", "金" };
        return week[h];
    }

    public String toString() {
        return year + "（" + toWareki() + "）年" + month + "月" + day + "日（" + getDayOfWeek() + "）";
    }

}
