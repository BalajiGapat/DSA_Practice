package A_Interoduction_to_array;

import java.util.HashSet;
import java.util.Set;

public class countDistinctElementFromArray 
{
	public static int countElement(int[] arr)
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		return set.size();
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {11, 22, 99, 55, 44, 33, 22, 99, 22, 44};
		System.out.println("disticnt element from array: "+countElement(arr));
	}
}
