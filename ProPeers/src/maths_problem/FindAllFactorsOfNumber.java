package maths_problem;

import java.util.ArrayList;
import java.util.List;

public class FindAllFactorsOfNumber {
	public static List<Integer> allFactors(int num)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				list.add(i);
			if(i!=num/i)
				list.add(num/i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		int num=64;
		System.out.println("fsctors of"+num+": "+allFactors(num));
	}
}
