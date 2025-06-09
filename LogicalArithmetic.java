public class LogicalArithmetic {
    public static void main(String[] args) {
        int x = 365;
        boolean b7 = x / 120 > 3;
        boolean b8 = x / 10 % 10 >= 4;
        boolean b9 = x >= 365 || x > 365;
        boolean b10 = (b7 || (!b7 && b8));// ？？

        System.out.println("b7:" + b7 + " b8:" + b8 + " b9:" + b9 + " b10:" + b10);

    }
}
