public class Problem024 {
    public static void main(String[] args) {
        final int n = 1000000;
        System.out.println(Helper.permutations("0123456789", n).get(n-1));
    }
}