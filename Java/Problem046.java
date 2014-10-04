public class Problem046 {
    public static void main(String[] args) {
        for(int i = 9; ; i += 2)
        {
            if(!Helper.isPrime(i)) {
                boolean exist = false;
                
                for(int j : Helper.getPrimesBelow(i)) {
                    for(int k = 1; j + 2*k*k <= i; k++) {
                        if(j + 2*k*k == i) {
                            exist = true;
                            break;
                        }
                    }
                }
                
                if(!exist) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}