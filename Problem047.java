public class Problem047 {
    public static void main(String[] args) {
        for(int i = 0, count = 0, factors = 0; ; i++, factors = 0) {
            int num = i;
            
            for(int p : Helper.getPrimesBelow(1000)) {
                if(num % p == 0) {
                    num /= p;
                    factors++;
                }
            }
            
            if((count = (factors == 4) ? count+1 : 0) == 4) {
                System.out.println(i-3);
                break;
            }   
        }
    }
}