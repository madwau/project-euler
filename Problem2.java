public class Problem2
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int f = 1, g = 2; g <= 4000000; g += f, f = g-f)
		{
			if(g % 2 == 0) sum += g;
		}
		
		System.out.println(sum);
	}
}