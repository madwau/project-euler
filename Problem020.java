import java.math.BigInteger;

public class Problem020 {
    public static void main(String[] args) {
        BigInteger num = BigInteger.ONE;

        for (int i = 2; i <= 100; i++) {
            num = num.multiply(new BigInteger(i + ""));
        }

        String s = String.valueOf(num);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}