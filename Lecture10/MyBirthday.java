package Lecture10;

public class MyBirthday {
    /*
     * 誕生日（生年月日）を表わすクラス（MyBirthday）を作成しなさい．
     * ただし，メンバとして，生年月日（int型）それぞれを表わす変数をもつ（生年は西暦(2016など）とする）．
     * 
     * 1. 次のコンストラクタを持つ ・ 年（西暦）と月日を引数にもつ
     * 2. メソッドtoWareki()は，和暦（平成28など）に変換された年を文字列で返す
     * 
     * ※和暦の年号と西暦の年月日は次の通りとする．
     * 明治：1868年9月8日〜1912年7月29日
     * 大正：1912年7月30〜1926年12月24日
     * 昭和：1926年12月25日〜1989年1月7日
     * 平成：1989年1月8日〜2019年4月30日
     * 令和：2019年5月1日〜
     *
     * 3. メソッドgetDayOfWeek()は，生年月日に対応する曜日を文字列で返す
     * ※
     * 曜日の算出にはツェラーの公式を利用する（https://ja.wikipedia.org/wiki/%E3%83%84%E3%82%A7%E3%83%A9
     * %E3%83%BC%E3%81%AE%E5%85%AC%E5%BC%8F）
     * 
     * 4. メソッドtoString()は，メンバ変数が保持する値に応じて，下記のような文字列を返す．
     * 2016（平成28）年6月28日（火）
     * 
     * また，上記のクラスの動作確認用として，MyBirthdayTest.javaを作成しなさい．
     * ※キーボートから今日の日付，および自分生年月日を読み込んで，和暦変換や曜日取得ができるか確認する
     */

    private int y;
    private int m;
    private int d;

    String[] weeks = { "土", "日", "月", "火", "水", "木", "金" };

    public MyBirthday(int year, int month, int days) {
        y = year;
        m = month;
        d = days;
    }

    public String toWareki() {

        if (y >= 2019 && m >= 5) {// 令和：2019年5月1日〜
            return "令和" + (y - 2018);
        } else if ((y == 1989 && m >= 1 && d >= 8) || (y > 1989)) {// 平成：1989年1月8日〜2019年4月30日
            return "平成" + (y - 1988);
        } else if ((y == 1926 && m >= 12 && d >= 25) || (y > 1926)) {// 昭和：1926年12月25日〜1989年1月7日
            return "昭和" + (y - 1925);
        } else if ((y == 1912 && m >= 7 && d >= 30) || (y > 1912)) {// 大正：1912年7月30〜1926年12月24日
            return "大正" + (y - 1911);
        } else if ((y == 1868 && m >= 9 && d >= 8) || (y > 1868)) {// 明治：1868年9月8日〜1912年7月29日
            return "明治" + (y - 1867);
        }
        return "input error";

    }

    public String getDayOfWeek() {
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int h = (d + 26 * (m + 1) / 10 + y % 100 + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;
        return weeks[h];
    }

    public String toString() {
        return y + "(" + toWareki() + ")年" + m + "月" + d + "日" + "（" + getDayOfWeek() + "）";
    }

}
