public class Problem009 {
    public static void main(String[] args) {
        for (int a = 1; a < 500; a++) {
            double b = 1000*(a-500)/(a-1000.0);
            
            if(b == (int) b) {
                System.out.println((int) (a*b*Math.sqrt(a*a+b*b)));
                break;
            }
        }
    }
}