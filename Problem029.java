import java.math.BigInteger;
import java.util.HashSet;

public class Problem029
{
	public static void main(String[] args)
	{
		HashSet<BigInteger> set = new HashSet<BigInteger>();
		
		for(int a = 2; a <= 100; a++)
		{
			BigInteger A = new BigInteger(String.valueOf(a));
			
			for(int b = 2; b <= 100; b++)
			{
				set.add(A.pow(b));
			}
		}
		
		System.out.println(set.size());
	}
}