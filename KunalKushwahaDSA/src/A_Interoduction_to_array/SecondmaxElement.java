package A_Interoduction_to_array;

import java.util.Arrays;

public class SecondmaxElement 
{
	public static int secondMax(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]!=arr[arr.length-1])
				return arr[i];
		}
		return -1;
		
	}

	
	public static void main(String[] args) 
	{
		int[] arr={1443,2,3,4,55555,89,89,89,89};
		System.out.println("second max element : "+secondMax(arr));
	}
}
