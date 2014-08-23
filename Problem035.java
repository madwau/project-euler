import java.math.BigInteger;

public class Problem035 {
    public static void main(String[] args) {
        int count = 1;

        for (Integer i = 3; i < 1000000; i += 2) {
            BigInteger b = new BigInteger(i.toString());

            if (b.isProbablePrime(5)) {
                boolean circular = true;

                for (int j = 0; j < b.toString().length(); j++) {
                    if (!rotate(b, j).isProbablePrime(5)) {
                        circular = false;
                        break;
                    }
                }

                if (circular)
                    count++;
            }
        }

        System.out.println(count);
    }

    public static BigInteger rotate(BigInteger b, int n) {
        String tmp = b.toString();

        return new BigInteger(tmp.substring(tmp.length() - n, tmp.length()) + tmp.substring(0, tmp.length() - n));
    }
}