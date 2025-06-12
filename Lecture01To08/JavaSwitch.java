package Lecture01To08;

public class JavaSwitch {
    public static void main(String[] args) {

        char c = 'm';
        switch (c) {
            case 'a':
                System.out.println("abc");
            case 'b':
            case 'c':
                System.out.println("pqr");
                break;
            default:
                System.out.println("xyz");
        }
    }
}
