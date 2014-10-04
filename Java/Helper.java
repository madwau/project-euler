import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Helper {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }
    
    public static boolean isPalindrome(int i) {
        return isPalindrome(String.valueOf(i));
    }
    
    public static boolean isPrime(String s) {
        return (new BigInteger(s)).isProbablePrime(1);
    }
    
    public static boolean isPrime(int n) {
        return isPrime(String.valueOf(n));
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
    
    public static List<String> getItems(String file) {
        List<String> items = new ArrayList<String>();
        
        Scanner in = null;
        
        try { in = new Scanner(new FileReader(file)).useDelimiter(","); }
        catch (FileNotFoundException e) {}
        
        while (in.hasNext()) {
            String s = in.next();
            items.add(s.substring(1, s.length()-1));
        }
        
        return items;
    }
    
    public static int sumOfLetters(String s) {
        int sum = 0;
        
        for(char c : s.toCharArray()) {
            sum += (int) c - 'A' + 1;
        }
        
        return sum;
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
    
    public static List<String> permutations(String s) {
        return permutations(s, Integer.MAX_VALUE);
    }
    
    public static List<String> combinations(String s, int length) {
        List<String> p = new ArrayList<String>();

        if (length == 0) {
            p.add("");
            return p;
        }

        for (int i = 0; i < s.length(); i++) {
            List<String> app = combinations(s, length-1);

            for (String a : app) {
                p.add(s.charAt(i) + a);
            }
        }

        return p;
    }
    
    public static boolean isPandigital(String s, int digit) {
        if(s.contains("0") || s.length() != digit) return false;

        for (Integer i = 1; i <= digit; i++) {
            if (!s.contains(i.toString())) return false;
        }

        return true;
    }
    
    public static boolean isPandigital(int n, int digit) {
        return isPandigital(String.valueOf(n), digit);
    }
    
    public static List<Long> triangleNumbers(int num) {
        List<Long> t = new ArrayList<Long>();
        
        for(long i = 1; i < num; i++) {
            t.add(i*(i+1)/2);
        }
        
        return t;
    }
    
    public static List<Long> pentagonalNumbers(int num) {
        List<Long> p = new ArrayList<Long>();
        
        for(long i = 1; i < num; i++) {
            p.add(i*(3*i-1)/2);
        }
        
        return p;
    }
    
    public static List<Long> hexagonalNumbers(int num) {
        List<Long> h = new ArrayList<Long>();
        
        for(long i = 1; i < num; i++) {
            h.add(i*(2*i-1));
        }
        
        return h;
    }
    
    public static <T> T last(List<T> list) {
        return list.get(list.size()-1);
    }
    
    public static List<Integer> convertToInteger(List<String> list) {
        List<Integer> l = new ArrayList<Integer>();
        for(String s : list) l.add(Integer.parseInt(s));
        return l;
    }
    
    public static List<String> convertToString(List<Integer> list) {
        List<String> l = new ArrayList<String>();
        for(Integer i : list) l.add(i.toString());
        return l;
    }
    
    public static boolean isPermutation(Integer a, Integer b, Integer c) {
        return sorted(a.toString()).equals(sorted(b.toString())) &&
               sorted(b.toString()).equals(sorted(c.toString()));
    }
    
    public static String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}