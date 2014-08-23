import java.util.ArrayList;
import java.util.List;

public class Problem010 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        for (int n = 3; n < 2000000; n += 2) {
            boolean prime = true;

            for (int i : primes) {
                if (i * i > n)
                    break;

                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                primes.add(n);
        }

        long sum = 0;

        for (int i : primes)
            sum += i;

        System.out.println(sum);
    }
}