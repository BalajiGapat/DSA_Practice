package power_of_number;

public class PowerOfNumber 
{
	public static int powerOfNumber(int num, int pow)
	{
		int ans=1;
		for(int i=1;i<=pow;i++)
		{
			ans=ans*num;
		}
		
		//OR
		int res=1;
		while(pow>0)
		{
			res=res*num;
			pow--;
		}
		
		//return ans;
		return res;
		
		
	}
	
	public static void main(String[] args) 
	{
		int num=5;
		System.out.println(powerOfNumber(num, 4));
		
	}
}
