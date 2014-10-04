public class Problem006 {
    public static void main(String[] args) {
        int n = 100;
        int sum_of_squares = n * (n + 1) * (2*n + 1) / 6;
        int square_of_sum = n * (n + 1) * n * (n + 1) / 4;

        System.out.println(square_of_sum - sum_of_squares);
    }
}