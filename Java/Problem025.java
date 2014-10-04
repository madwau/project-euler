import java.math.BigInteger;

public class Problem025 {
    public static void main(String[] args) {
        int count = 2;

        BigInteger f = BigInteger.ONE, g = f;

        while (String.valueOf(g).length() < 1000) {
            g = g.add(f);
            f = g.subtract(f);
            count++;
        }

        System.out.println(count);
    }
}