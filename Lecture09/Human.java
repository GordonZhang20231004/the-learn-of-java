package Lecture09;

import java.util.Random;

class MKA {

    public static void main(String[] args) {
        Human human = new Human();
        human.height = 1.75;
        human.weight = 75;

        Random random = new Random();
        int n = random.nextInt();
        System.out.println(n);
    }
}

// Humanクラスの設計
// 独立のファイルとして用意することが良い； ファイル名は、クラス名.java
// Human.java
Human.java

class Human {
    // 属性の定義（メンバ変数 フィールド）
    double height;
    double weight;

    void eat() {
        // 中心の処理を定義
    };

    void talk() {
    };

}
