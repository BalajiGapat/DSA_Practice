package fibonaci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci 
{	
	public static void fibo(int pos)
	{

		int num1=0;
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
	public static void main(String[] args) 
	{
		fibo(6);
	}
}
