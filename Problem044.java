import java.util.List;

public class Problem044 {
    public static void main(String[] args) {
        List<Long> pen = Helper.pentagonalNumbers(2500);
        
        long min = Long.MAX_VALUE;
        
        for(long i : pen) {
            for(long j : pen) {
                if(j < i && i-j < min && pen.contains(i+j) && pen.contains(i-j)) {
                    min = i-j;
                }
            }
        }
        
        System.out.println(min);
    }
}