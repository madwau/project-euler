public class Problem036 {
    public static void main(String[] args) {
        int sum = 0;

        for (Integer i = 0; i < 1000000; i++) {
            if (palindrome(i.toString()) && palindrome(Integer.toBinaryString(i))) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}