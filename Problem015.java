public class Problem015
{
	public static void main(String[] args)
	{
		System.out.println(bin(40, 20));
	}
	
	public static long bin(int n, int k) {
		long bin = 1;
		
	    for (int j = 0; j < k; j++)
	    {
	    	bin *= n-j;
	        bin /= j+1;
	    }
	    
	    return bin;
	}
}