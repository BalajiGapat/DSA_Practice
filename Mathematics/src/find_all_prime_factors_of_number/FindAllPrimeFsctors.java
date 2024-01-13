package find_all_prime_factors_of_number;

import java.util.ArrayList;
import java.util.List;

public class FindAllPrimeFsctors 
{
	public static boolean isPrime(int num)
	{
		if(num==0 || num==1)
			return false;
		for(int i=2;i<=(int)Math.sqrt(num);i++)
			if(num%i==0)
				return false;
			
		return true;
	}
	
	public static void primeFactors(int num)
	{
		List<Integer> list=new ArrayList<>();
		
		for(int i=2;i<=num;i++) //i=2, 3......41
		{
			if(isPrime(i))
			{
				while(num%i==0) // 164 82,41 // 41, 1
				{
					list.add(i);
					num=num/i;
				}
			}
		}// time complexity=O(n*log(n))
		
		System.out.println(list);
	}
	
	public static void main(String[] args) 
	{
		int num=164;
		primeFactors(num);
	}
}
