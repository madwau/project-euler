public class Problem014 {
    public static void main(String[] args) {
        int num = 0;
        int max = 0;

        for (int n = 1; n < 1000000; n++) {
            long t = n;
            int length = 1;

            while (t != 1) {
                if (t % 2 == 0)
                    t = t / 2;
                else
                    t = 3 * t + 1;
                length++;
            }

            if (length > max) {
                max = length;
                num = n;
            }
        }

        System.out.println(num);
    }
}