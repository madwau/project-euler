public class Problem030 {
    public static void main(String[] args) {
        int total = 0;

        for (Integer i = 2; i < 1000000; i++) {
            String num = i.toString();

            int sum = 0;

            for (int j = 0; j < num.length(); j++) {
                sum += Math.pow(Integer.parseInt(num.substring(j, j + 1)), 5);
            }

            if (i == sum)
                total += sum;
        }

        System.out.println(total);
    }
}