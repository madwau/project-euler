import java.util.HashSet;

public class Problem032
{
	public static void main(String[] args)
	{
		HashSet<Integer> products = new HashSet<Integer>();
		int sum = 0;
		
		for(Integer a = 1; a < 2000; a++)
		{
			for(Integer b = 1; b < a; b++)
			{
				String identity = a.toString() + b.toString() + new Integer(a*b).toString();
				
				if(!identity.contains("0") && identity.length() == 9 && unique(identity) && !products.contains(a*b))
				{
					sum += a*b;
					products.add(a*b);
				}
			}
		}
		
		System.out.println(sum);
	}
	
	public static boolean unique(String s)
	{
		String tmp = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if(tmp.contains(s.substring(i, i+1))) return false;
			tmp += s.substring(i, i+1);
		}
		
		return true;
	}
}