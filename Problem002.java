public class Problem002 {
    public static void main(String[] args) {
        int sum = 0;

        for (int f = 1, g = 2; g <= 4000000; g += f, f = g-f) {
            sum += (g % 2 == 0) ? g : 0;
        }

        System.out.println(sum);
    }
}