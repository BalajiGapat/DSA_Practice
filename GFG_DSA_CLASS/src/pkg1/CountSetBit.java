package pkg1;

public class CountSetBit 
{
	public static int countSetBit(int num)
	{
		String s="";
		int count=0;
		while(num>0)
		{
			s=s+num%2;
			num=num/2;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
				count++;
		}
		
		return count;
		
		/*
		 * StringBuffer sb=new StringBuffer(s); s=sb.reverse().toString(); int
		 * n=Integer.parseInt(s);
		 */
	}
	
	
	public static void main(String[] args)
	{
		int num=15;
		System.out.println("set bit are: "+countSetBit(num));
	}
}
