package max_element_in_array;

import java.util.Arrays;

public class MaxElementFromArray 
{
//	public static int maxElement1(int[] arr)
//	{
//		Arrays.sort(arr);
//		return arr[arr.length-1];
//	}
	
	public static int maxElement(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {99,44,66,77,22,33,2211};
		System.out.println(maxElement(arr));
	}
}