package Lecture10;

public class Bunsu {
    private int bunshi, bunbo;

    public Bunsu() {
        bunshi = 0;
        bunbo = 1;
    }

    public Bunsu(int n) {
        bunshi = n;
        bunbo = 1;
    }

    public Bunsu(int m, int n) {
        bunshi = m;
        bunbo = n;
    }

    public String toString() {
        return new String(bunshi + "/" + bunbo);
    }
}
