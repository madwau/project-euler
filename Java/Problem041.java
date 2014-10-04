public class Problem041 {
    public static void main(String[] args) {
        String max = "";
        
        for(String s : Helper.permutations("1234567")) {
            if(Helper.isPrime(s)) max = s;
        }
        
        System.out.println(max);
    }
}