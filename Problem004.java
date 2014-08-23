public class Problem004 {
    public static void main(String[] args) {
        int max = 0;

        for (int a = 100, b = 100; a < 1000; b++, b = (b == 1000) ? ++a : b) {
            max = Helper.isPalindrome(a*b) ? Math.max(a*b, max) : max;
        }

        System.out.println(max);
    }
}