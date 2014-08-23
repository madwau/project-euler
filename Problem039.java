public class Problem039 {
    public static void main(String[] args) {
        int value = 0, max = 0;

        for (int p = 1; p < 1000; p++) {
            int count = 0;

            for (int a = 1; a < p/3; a++) {
                int b = p * (p - 2*a) / (2*p - 2*a);
                if (a + b + Math.sqrt(a*a + b*b) == p) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                value = p;
            }
        }

        System.out.println(value);
    }
}