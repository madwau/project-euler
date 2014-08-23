import java.util.ArrayList;
import java.util.List;

public class Problem007 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        int count = 1;
        int candidate = 3;

        while (count < 10001) {
            boolean prime = true;

            for (int i : primes) {
                if (candidate % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes.add(candidate);
                count++;
            }

            candidate += 2;
        }

        System.out.println(candidate - 2);
    }
}