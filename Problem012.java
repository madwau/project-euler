public class Problem012 {
    public static void main(String[] args) {
        for (int i = 3, triangle = 3, count = 0;; triangle += i++, count = 0) {
            for (int j = 1; j * j <= triangle; j++) {
                if (triangle % j == 0)
                    count += 2;
            }

            if (count > 500) {
                System.out.println(triangle);
                break;
            }
        }
    }
}