public class Problem043 {
    public static void main(String[] args) {
        long sum = 0;
        
        for(String s : Helper.permutations("0123456789")) {
            boolean property = true;
            
            for(int i = 1; i < 8; i++) {
                if(Long.valueOf(s.substring(i, i+3)) % Helper.getPrime(i) != 0) {
                    property = false;
                    break;
                }
            }
            
            if(property) sum += Long.valueOf(s);
        }
        
        System.out.println(sum);
    }
}