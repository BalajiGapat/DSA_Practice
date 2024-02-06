package maths_problem;

import java.util.ArrayList;
import java.util.List;

public class CheckForPrime {
	
	public static List<Integer> allPrimes(int num)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
				list.add(i);
		}
		return list;
	}
	
	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int num=49;
		// System.out.println("is prime: "+isPrime(num));
		System.out.println(allPrimes(num).toString());
	}
}
