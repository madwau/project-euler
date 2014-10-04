import java.util.ArrayList;
import java.util.HashSet;

public class Problem023 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> sums = new HashSet<Integer>();

        for (int n = 1; n <= 28123; n++) {
            int sum = 0;

            for (int i = 1; i*2 <= n; i++) {
                sum += (n % i == 0) ? i : 0;
            }

            if (sum > n) {
                list.add(n);
                for (int l : list) sums.add(l + n);
            }
        }

        int total = 0;

        for (int n = 1; n <= 28123; n++) {
            total += sums.contains(n) ? 0 : n;
        }

        System.out.println(total);
    }
}