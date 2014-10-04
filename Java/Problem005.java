public class Problem005 {
    public static void main(String[] args) {
        boolean found = false;
        int product = 2*3*5*7*11*13*17*19, min = product;

        while (!found) {
            found = true;

            for (int i = 4; i <= 20; i++) {
                if (min % i != 0) {
                    found = false;
                    min += product;
                    break;
                }
            }
        }

        System.out.println(min);
    }
}