package count_digits;

public class SumOfDigit 
{
	public static int sumOfDIgits(int num) // num>0
	{
		int sum=0;
		int count=0;
		
		while(num>0) 
		{
			sum=sum+num%10;
			count++;
			num=num/10;
		}
		return sum;
		//return count;
	}
	
	
	public static void main(String[] args) 
	{
		int num=1234; 
		System.out.println(sumOfDIgits(num));
	}
}
