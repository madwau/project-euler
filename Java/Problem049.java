import java.util.List;

public class Problem049 {
    public static void main(String[] args) {
        List<String> list = Helper.convertToString(Helper.getPrimesBelow(10000));
        list.retainAll(Helper.combinations("0123456789", 4));
        List<Integer> l = Helper.convertToInteger(list);
        
        for(Integer i : l) {
            for(Integer j : l) {
                for(Integer k : l) {
                    if(i > j && j > k && i-j == j-k && Helper.isPermutation(i, j, k) && k != 1487) {
                        System.out.println(k + "" + j + "" + i);
                    }
                }
            }
        }
    }
}