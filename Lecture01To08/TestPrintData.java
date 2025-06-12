package Lecture01To08;

public class TestPrintData {
    public static void main(String[] args) {
        printData(3);
        printData(3.14);
        printData(3, 4);
    }

    static void printData(int i) {
        System.out.println("i = " + i);
    }

    static void printData(double d) {
        System.out.println("d = " + d);
    }

    static void printData(int i1, int i2) {
        System.out.println("i1 = " + i1 + ", i2 = " + i2);
    }

}
