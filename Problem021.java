import java.util.HashMap;

public class Problem021 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

        int total = 0;

        for (int n = 1; n < 10000; n++) {
            int sum = 0;

            for (int i = 1; i*2 <= n; i++) {
                    sum += (n % i == 0) ? i : 0;
            }

            if (cache.containsKey(sum) && cache.get(sum) == n) {
                total += sum + n;
            }

            cache.put(n, sum);
        }

        System.out.println(total);
    }
}