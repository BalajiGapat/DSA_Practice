package reverse_number;

public class ReverseNumber 
{
	
	public static int reverseNumber(int num) //num>0
	{
		int revNum=0;
		while(num>0)
		{
			revNum=revNum*10+num%10;
			num=num/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) 
	{
		int num=12345;
		System.out.println(reverseNumber(num));
		
	}
}
