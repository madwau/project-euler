public class Problem003 {
    public static void main(String[] args) {
        long num = 600851475143L, result = num;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                num /= (result = i);
            }
        }

        System.out.println(result);
    }
}