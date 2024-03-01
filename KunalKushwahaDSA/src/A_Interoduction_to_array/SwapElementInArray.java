package A_Interoduction_to_array;

import java.util.Arrays;

public class SwapElementInArray 
{
	public static void swap(int[] arr, int ind1, int ind2)
	{
		int temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9};
		swap(arr, 2, 5);
		System.out.println(Arrays.toString(arr));
	}
}
