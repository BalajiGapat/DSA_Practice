package trailing_zeros_in_factorial;

public class SumByRecursion 
{
	public static int sum(int num)
	{
		if(num==1)
			return 1;
		return num+sum(num-1);
	}
	
	public static void main(String[] args) 
	{
		int num=10;
		System.out.println("sum of 1st "+num+" Number: "+sum(num));
	}
}
