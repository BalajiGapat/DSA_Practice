package factorial_of_number;

public class Factorial 
{
	public static int factorial(int num)
	{
		int ans=1;
		while(num>0)
		{
			ans=ans*num;
			num--;
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		int num=5;
		System.out.println(factorial(num));
		
	}
}
