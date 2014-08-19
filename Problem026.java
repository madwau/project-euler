import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem026
{
	public static void main(String[] args)
	{
		int max = 0, value = 0;
		
		for(Integer d = 2; d < 1000; d++)
		{
			BigDecimal f = BigDecimal.ONE;
			f = f.divide(new BigDecimal(d.toString()), 2100, RoundingMode.DOWN);
			
			String s = f.toString().substring(10);
			
			for(int length = 1; length < 1000; length++)
			{
				boolean flag = true;
				
				for(int i = 2; length*i <= s.length(); i++)
				{
					if(!s.substring(0, length).equals(s.substring(length*(i-1), length*i)))
					{
						flag = false;
						break;
					}
				}
				
				if(flag)
				{
					if(length > max)
					{
						max = length;
						value = d;
					}
					
					break;
				}
			}
		}
		
		System.out.println(value);
	}
}