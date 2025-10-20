package Lecture10;

import java.time.LocalDate;

public class JapaneseEraConverter {
    public static String toJapaneseEra(LocalDate date) {
        if (date.isBefore(LocalDate.of(1868, 9, 8))) {
            return "明治以前";
        } else if (date.isBefore(LocalDate.of(1912, 7, 30))) {
            return "明治" + (date.getYear() - 1868 + 1) + "年";
        } else if (date.isBefore(LocalDate.of(1926, 12, 25))) {
            return "大正" + (date.getYear() - 1912 + (date.getMonthValue() >= 7 && date.getDayOfMonth() >= 30 ? 1 : 0))
                    + "年";
        } else if (date.isBefore(LocalDate.of(1989, 1, 8))) {
            return "昭和" + (date.getYear() - 1926 + (date.getMonthValue() >= 12 && date.getDayOfMonth() >= 25 ? 1 : 0))
                    + "年";
        } else if (date.isBefore(LocalDate.of(2019, 5, 1))) {
            return "平成" + (date.getYear() - 1989 + (date.getMonthValue() >= 1 && date.getDayOfMonth() >= 8 ? 1 : 0))
                    + "年";
        } else {
            return "令和" + (date.getYear() - 2019 + 1) + "年";
        }
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1989, 1, 8); // 平成元年
        LocalDate date2 = LocalDate.of(1995, 3, 15); // 平成7年
        LocalDate date3 = LocalDate.of(2019, 5, 1); // 令和元年

        System.out.println(toJapaneseEra(date1)); // 平成1年
        System.out.println(toJapaneseEra(date2)); // 平成7年
        System.out.println(toJapaneseEra(date3)); // 令和1年
    }
}
