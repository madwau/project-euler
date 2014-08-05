public class Problem4
{
	public static void main(String[] args)
	{
		int max = 0;
		
		for(int a = 100, b = 100; a < 1000; b++)
		{
			String product = String.valueOf(a*b);
			
			if(product.equals(new StringBuffer(product).reverse().toString()))
			{
				if(a*b > max) max = a*b;
			}
			
			if(b == 999) b = a++;
		}
		
		System.out.println(max);
	}
}