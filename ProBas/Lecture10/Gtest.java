package ProBas.Lecture10;

public class Gtest {
    public static void main(String[] args) {
        // 可変
        /*
         * 原因
         * ✅ int[] は参照型（オブジェクト型）
         * 
         * 一方、int[]（配列）は Java においては「参照型（オブジェクト）」です。
         * • int[] という変数には、配列データそのものではなく、配列が保存されている場所（メモリアドレス）への参照が入ります。
         * • そのため、外部からその参照を使って配列の中身を変更することが可能です。
         */
        int[] numcou = new int[1];
        numcou[0] = 100;

        G g = new G(numcou);
        int[] getNum = g.getA();
        System.out.println(getNum[0]);

        getNum[0] = 200;
        System.out.println(g.getA()[0]);
        // 不可変
        /*
         * 原因
         * Java における int は「プリミティブ型（基本データ型）」と呼ばれます。
         * • int は 値そのもの を直接保持します。
         * • 例えば、int a = 5; とすれば、a という変数の中に「5」という数値が直接入っています。
         * • 他の変数に代入してもコピーされるため、元の値は変わりません。
         */
        int numberBB = 222;
        G gb = new G(numberBB);
        System.out.println(gb.getB());

        int numberB = gb.getB();
        numberB = 333;
        System.out.println(gb.getB());

    }
}
