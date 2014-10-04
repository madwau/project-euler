import java.math.BigInteger;

public class Problem048 {
    public static void main(String[] args) {
        BigInteger b = BigInteger.ZERO;
        
        for(BigInteger i = BigInteger.ONE; i.intValue() <= 1000; i = i.add(BigInteger.ONE)) {
            b = b.add(i.pow(i.intValue()));
        }
        
        String s = b.toString();
        
        System.out.println(s.substring(s.length()-10, s.length()));
    }
}