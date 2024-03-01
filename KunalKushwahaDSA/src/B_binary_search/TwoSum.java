package B_binary_search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum 
{
	public static int[] twoSum(int[] arr, int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
					return new int[] {i, j};
			}
		}
		
		return null;
	}
	
	public static int[] twoSum2(int[] arr, int target)
	{
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		
		for(int i=0;i<map.size();i++)
		{
			int compKey=target-map.get(arr[i]);
			// if(map.containsKey(compKey) && i!=map.ge)
		}
		
		return null;
	}
	
	
	
	
	public static void main(String[] args)
	{
		int[] arr= {65,78,91,13,26,39,52,104};
		System.out.println(Arrays.toString(twoSum(arr, 130)));
	}
}
