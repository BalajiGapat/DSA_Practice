package maths_problem;

public class Fibonacii {
	public static int fibo(int num)
	{
		if(num<=1)
			return num;
		return fibo(num-2)+fibo(num-1);
	}
	
	public static void fiboo(int num)
	{
		int num1=1;
		int num2=1;
		int i=1;
		while(i<=num)
		{
			System.out.println(num1);
			int temp=num1;
			num1=num2;
			num2=num2+temp;
			i++;
		}
	}
	
	public static void main(String[] args) {
		int num=7;
		//System.out.println(fibo(num)); // 1,1,2,3,5,8,13...
		
		// for printing all series
//		int i=1;
//		while(i<=num)
//		{
//			System.out.println(fibo(i));;
//			i++;
//		}
		
		fiboo(num);
	}
}
