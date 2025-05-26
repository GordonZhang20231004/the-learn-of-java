public class CharOperationTest {
    public static void main(String[] args) {
        char c1 = 'a';// 97
        char c2 = 'e';
        char c3 = 'z';// 122
        // A:65 Z:90
        char lower = 'a'; // 97
        char upper = (char) (lower - 32); // 97 - 32 = 65 → 'A'
        System.out.println("upper: " + upper);
        System.out.println("c1:" + c1 + "  c2:" + c2 + "  c3:" + c3);

        // 「文字」(char)の引き算
        System.out.println("c1はアルファベット順で「a」から数えて何番目？：" + (c1 - 'a'));
        System.out.println("c2はアルファベット順で「a」から数えて何番目？：" + (c2 - 'a'));
        System.out.println("c3はアルファベット順で「a」から数えて何番目？：" + (c3 - 'a'));

        // 「文字」(char)の大小比較
        System.out.println("c1<=c2は：" + (c1 <= c2));
        System.out.println("c2<=c3は：" + (c2 <= c3));
        System.out.println("c3<=c1は：" + (c3 <= c1));

        // charからintへの変換，charとintの足し算，intからcharへの変換，
        System.out.println("charからintへの変換：" + (int) c1);
        System.out.println("charとintの足し算：" + (c1 + 4));
        System.out.println("intからcharへの変換：" + (char) (c1 + 4));
    }
}
