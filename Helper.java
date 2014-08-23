import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }
    
    public static boolean isPalindrome(int i) {
        return isPalindrome(String.valueOf(i));
    }
    
    public static int getPrime(int n) {
        if(n <= 1) return 2;
        
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        int count = 1, candidate = 3;

        while (count < n) {
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

        return candidate-2;
    }
}