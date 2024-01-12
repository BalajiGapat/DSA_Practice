package fibonaci;

public class Fibonacci 
{	
	public static void fibo(int pos)
	{

		int num1=1;
		int num2=1;
		int count=0;
		while(count<pos)
		{
			System.out.print(num1+" ");
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			count++;
		}
	}

	public static int ff(int pos) // pos=6
	{
		int num1=0;
		int num2=1;
		int count=0;
		int sum=0;
		while(count<pos)
		{
			System.out.print(num1+" ");
			sum=sum+num1;
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			count ++;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("\ntotal sum: "+ff(6));
	}
}
