import java.math.BigInteger;

public class Problem027
{
	public static void main(String[] args)
	{
		int max = 0, A = 0, B = 0;
		
		for(int a = 1-1000; a < 1000; a++)
		{
			for(int b = 1-1000; b < 1000; b++)
			{
				int n = 0;
				
				while(n*(n+a)+b >= 2 && (new BigInteger(String.valueOf(n*(n+a)+b))).isProbablePrime(1))
				{
					n++;
				}
				
				if(n > max)
				{
					max = n;
					A = a;
					B = b;
				}
			}
		}
		
		System.out.println(A*B);
	}
}