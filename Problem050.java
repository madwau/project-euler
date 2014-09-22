import java.util.List;

public class Problem050 {
    public static void main(String[] args) {
        List<Integer> list = Helper.getPrimesBelow(10000);
        
        int max = 0, value = 0;
        
        for(int i = 0, sum = 0; i < 10; i++, sum = 0) {
            for(int j = i; (sum += list.get(j)) < 1000000; j++) {
                if(j > max && Helper.isPrime(sum)) {
                    max = j;
                    value = sum;
                }
            }
        }
        
        System.out.println(value);
    }
}