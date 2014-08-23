import java.math.BigInteger;

public class Problem016 {
    public static void main(String[] args) {
        int sum = 0;

        String num = String.valueOf((new BigInteger("2")).pow(1000));

        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}