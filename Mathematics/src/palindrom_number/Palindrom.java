package palindrom_number;

public class Palindrom 
{
	public static boolean isPalindrom(int num) //num>0
	{
		int revNum=0;
		int temp=num; //121
		while(num>0)
		{
			revNum=revNum*10+num%10; //
			num=num/10;
		}
		
		if(temp==revNum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		int num=1234321;
		System.out.println(isPalindrom(num));
	}
}
