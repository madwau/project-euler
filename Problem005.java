public class Problem005
{
	public static void main(String[] args)
	{
		boolean found = false;
		int min = 20;
		
		while(!found)
		{
			found = true;
			
			for(int i = 2; i <= 20; i++)
			{
				if(min % i != 0)
				{
					found = false;
					min++;
					break;
				}
			}
		}
		
		System.out.println(min);
	}
}