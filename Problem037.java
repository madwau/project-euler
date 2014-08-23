import java.math.BigInteger;

public class Problem037 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;

        for (Integer i = 11; i < 1000000; i += 2) {
            BigInteger b = new BigInteger(i.toString());

            if (b.isProbablePrime(20)) {
                boolean truncatable = true;

                for (int j = 1 - b.toString().length(); j < b.toString().length(); j++) {
                    if (j != 0 && !cut(b, j).isProbablePrime(20)) {
                        truncatable = false;
                        break;
                    }
                }

                if (truncatable)
                    sum = sum.add(b);
            }
        }

        System.out.println(sum);
    }

    public static BigInteger cut(BigInteger b, int n) {
        String tmp = b.toString();

        if (n > 0)
            return new BigInteger(tmp.substring(0, tmp.length() - n));

        return new BigInteger(tmp.substring(-n));
    }
}