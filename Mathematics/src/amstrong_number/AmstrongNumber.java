package amstrong_number;

public class AmstrongNumber 
{
	public static int amstrongNum(int num) //123
	{
		int count=0;
		int num2=num; //123
		while(num>0) //123  12 1
		{
			count++; //1 2 3
			num=num/10; //12 1 0
		}
		
		double ans=0;
		while(num2>0) //123
		{
			ans=ans+Math.pow(num2%10, count); // 64+27+8
			num2=num2/10;
		}
		return (int)ans;
		
	}
	public static void main(String[] args) 
	{
		int num=234;
		System.out.println(amstrongNum(num));
	}
}
