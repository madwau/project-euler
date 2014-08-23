public class Problem014 {
    public static void main(String[] args) {
        int num = 0, max = 0;

        for (int n = 1; n < 1000000; n++) {
            int length = 1;
            
            for(long t = n; t != 1; length++) {
                t = (t%2 == 0) ? t/2 : 3*t+1;
            }

            if (length > max) {
                max = length;
                num = n;
            }
        }

        System.out.println(num);
    }
}