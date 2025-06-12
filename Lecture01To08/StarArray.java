package Lecture01To08;

public class StarArray {
    public static void main(String[] args) {
        char[][] stars = new char[6][6];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                stars[i][j] = (j <= i) ? '★' : '☆';
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
    }
}
