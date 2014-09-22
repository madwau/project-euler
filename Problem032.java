import java.util.HashSet;

public class Problem032 {
    public static void main(String[] args) {
        HashSet<Integer> products = new HashSet<Integer>();
        
        int sum = 0;

        for (Integer a = 1; a < 2000; a++) {
            for (Integer b = 1; b < a; b++) {
                Integer product = a*b;
                String identity = a.toString() + b.toString() + product.toString();

                if (!products.contains(product) && Helper.isPandigital(identity, 9)) {
                    sum += product;
                    products.add(product);
                }
            }
        }

        System.out.println(sum);
    }
}