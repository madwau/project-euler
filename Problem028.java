public class Problem028 {
    public static void main(String[] args) {
        int num = 1, sum = num;

        for (int i = 2; i < 1001; i += 2) {
            for (int j = 1; j <= 4; j++) {
                sum += (num += i);
            }
        }

        System.out.println(sum);
    }
}