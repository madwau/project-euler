public class Problem9
{
	public static void main(String[] args)
	{
		for(int a = 1; a < 1000; a++)
		{
			for(int b = a+1; b < 1000; b++)
			{
				int c = (int) Math.sqrt(a*a+b*b);
				
				if(c*c == a*a+b*b && a+b+c == 1000)
				{
						System.out.println(a*b*c);
						return;
				}
			}
		}
	}
}