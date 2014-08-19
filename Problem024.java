import java.util.ArrayList;

public class Problem024
{
	public static void main(String[] args)
	{
		System.out.println(perm("0123456789").get(1000000-1));
	}
	
	public static ArrayList<String> perm(String s)
	{
		ArrayList<String> p = new ArrayList<String>();
		
		if(s.length() == 1)
		{
			p.add(s);
			return p;
		}
		
		for(int i = 0, count = 0; i < s.length() && count < 1000000; i++)
		{
			ArrayList<String> app = perm(s.replace(s.charAt(i)+"", ""));
			
			for(String a : app)
			{
				p.add(s.charAt(i) + a);
				count++;
			}
		}
		
		return p;
	}
}