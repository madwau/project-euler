import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem033
{
	public static void main(String[] args)
	{
		int nom = 1, denom = 1;
		
		for(int d = 10; d < 100; d++)
		{
			for(int n = 10; n < d; n++)
			{
				if(d%10 != 0 && n%10 == (d-d%10)/10)
				{
					BigDecimal a = new BigDecimal(n);
					a = a.divide(new BigDecimal(d), 10, RoundingMode.DOWN);
					
					BigDecimal b = new BigDecimal(((n-n%10)/10));
					b = b.divide(new BigDecimal(d%10), 10, RoundingMode.DOWN);
					
					if(a.equals(b))
					{
						nom *= (n-n%10)/10;
						denom *= d%10;
					}
				}
			}
		}
		
		System.out.println(denom/nom);
	}
}