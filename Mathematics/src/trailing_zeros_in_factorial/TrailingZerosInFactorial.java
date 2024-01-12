package trailing_zeros_in_factorial;

public class TrailingZerosInFactorial 
{
	public static int countZeros(int num)
	{
		int count=0;
		while(num%5==0) // OR while(num/5!=0)
		{
			count=count+num/5;
			num=num/5;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int num=20;
		System.out.println(countZeros(num));
	}
}
