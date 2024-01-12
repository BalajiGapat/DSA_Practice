package check_for_prime_number;

public  class CheckForPrimeNumber 
{
	public static boolean isPrime(int num)
	{
		if(num==0 || num==1)
			return false;
		
		for(int i=2;i<(int)Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int num=137;
		System.out.println(isPrime(num));
		
	}
}
