public class Problem034 {
    public static void main(String[] args) {
        int total = 0;

        for (Integer i = 3; i < 100000; i++) {
            int sum = 0;

            for (int j = 0; j < i.toString().length(); j++) {
                sum += fac(Integer.parseInt(i.toString().substring(j, j + 1)));
            }

            if (i == sum)
                total += i;
        }

        System.out.println(total);
    }

    public static int fac(int n) {
        if (n == 0)
            return 1;
        else
            return n * fac(n - 1);
    }
}