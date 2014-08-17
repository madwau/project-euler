import java.math.BigInteger;

public class Problem003
{
	public static void main(String[] args)
	{
		BigInteger number = new BigInteger("600851475143");
		BigInteger result = number;
		
		for(BigInteger i = new BigInteger("2"); number.max(i).equals(number); i = i.add(BigInteger.ONE))
		{
			while(number.mod(i) == BigInteger.ZERO)
			{
				number = number.divide(result = i);
			}
		}
		
		System.out.println(result);
	}
}