public class Problem040 {
    public static void main(String[] args) {
        int product = 1;

        String num = "";

        for (int i = 1; num.length() < 1000000; i++) {
            num += String.valueOf(i);
        }

        for (int i = 1; i <= 1000000; i *= 10) {
            product *= Integer.parseInt(num.substring(i - 1, i));
        }

        System.out.println(product);
    }
}