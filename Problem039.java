public class Problem039
{
	public static void main(String[] args)
	{
		int value = 0, max = 0;
		
		for(int p = 1; p < 1000; p++)
		{
			int count = 0;
			
			for(int a = 1; a < 400; a++)
			{
				for(int b = 1; b <= a; b++)
				{
					if(isSquare(a*a+b*b) && a + b + (int) Math.sqrt(a*a+b*b) == p)
					{
						count++;
					}
				}
			}
			
			if(count > max)
			{
				max = count;
				value = p;
			}
		}
		
		System.out.println(value);
	}
	
	public static boolean isSquare(long n)
	{
	  int tmp = (int)(Math.sqrt(n) + 0.5);
	  return tmp*tmp == n;
	}
}