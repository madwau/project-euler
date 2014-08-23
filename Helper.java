import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }
    
    public static boolean isPalindrome(int i) {
        return isPalindrome(String.valueOf(i));
    }
    
    public static int getPrime(int pos) {
        if(pos <= 1) return 2;
        
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        int count = 1, n = 3;

        while (count < pos) {
            boolean prime = true;

            for (int i : primes) {
                if (i*i > n) break;
                
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes.add(n);
                count++;
            }

            n += 2;
        }

        return n-2;
    }
    
    public static List<Integer> getPrimesBelow(int limit) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        for (int n = 3; n < limit; n += 2) {
            boolean prime = true;

            for (int i : primes) {
                if (i*i > n) break;

                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) primes.add(n);
        }
        
        return primes;
    }
    
    public static long sum(List<Integer> l) {
        long sum = 0;
        for (long i : l) sum += i;
        return sum;
    }
    
    public static long binominal(int n, int k) {
        long bin = 1;

        for (int j = 0; j < k; j++) {
            bin *= n - j;
            bin /= j + 1;
        }

        return bin;
    }
    
    public static long sumOfDigits(BigInteger b) {
        long sum = 0;
        
        String num = String.valueOf(b);
        
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.substring(i, i+1));
        }
        
        return sum;
    }
    
    public static BigInteger factorial(int n) {
        BigInteger num = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            num = num.multiply(new BigInteger(i + ""));
        }
        
        return num;
    }
    
    public static List<String> getItems(String s) {
        List<String> items = new ArrayList<String>();
        
        Scanner in = null;
        
        try { in = new Scanner(new FileReader(s)).useDelimiter(","); }
        catch (FileNotFoundException e) {}
        
        while (in.hasNext()) items.add(in.next());
        
        return items;
    }
    
    public static List<String> permutations(String s, int limit) {
        List<String> p = new ArrayList<String>();

        if (s.length() == 1) {
            p.add(s);
            return p;
        }

        for (int i = 0, count = 0; i < s.length() && count < limit; i++) {
            List<String> app = permutations(s.replace(s.charAt(i) + "", ""), limit);

            for (String a : app) {
                p.add(s.charAt(i) + a);
                count++;
            }
        }

        return p;
    }
}