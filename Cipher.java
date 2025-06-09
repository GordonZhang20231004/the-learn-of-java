public class Cipher {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("文字列を入力して下さい！");
            return;
        }

        String input = args[0];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char shifted = (char) (c + 1);
            result.append(shifted);
        }

        System.out.println(result.toString());

    }
}
