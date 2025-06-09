// 閏年の判断すること
public class IsNotLeapYear {
    public static void main(String[] args) {
        // 方法１
        int ifYear = 2024;
        if (ifYear % 400 == 0 || ifYear % 100 != 0 && ifYear % 4 == 0) {
            System.out.println("leap year");
        }

        // 方法２
        if (ifYear % 4 != 0 || (ifYear % 400 != 0 && ifYear % 100 == 0)) {
            System.out.println(" Not leap year");
        } else {
            System.out.println(" leap year");
        }
    }
}
