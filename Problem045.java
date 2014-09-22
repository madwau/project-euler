import java.util.List;

public class Problem045 {
    public static void main(String[] args) {
        int limit = 80000;
        
        List<Long> t = Helper.triangleNumbers(limit);
        t.retainAll(Helper.pentagonalNumbers(limit));
        t.retainAll(Helper.hexagonalNumbers(limit));
        
        System.out.println(Helper.last(t));
    }
}