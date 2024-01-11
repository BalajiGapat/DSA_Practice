package fibonaci;

public class Fibonacci2 
{
	public static int fibo(int pos)
	{
		if(pos<=1)
			return pos;
		return fibo(pos-1)+fibo(pos-2); 
	}
	
	public static void main(String[] args) 
	{
		int pos=10;
		System.out.println(fibo(pos-1));
		
//		for(int i=0;i<pos;i++)
//		{
//			System.out.print(fibo(i)+" ");
//		}
		
	}
	
}
