package arrays_problems;

import java.util.Arrays;

public class SecondLargestNumber 
{
	public static int secondLargest(int arr[]) 
	{
		Arrays.sort(arr);
		int size = arr.length;
		for (int i = size - 2; i >= 0; i--) 
		{
			if (arr[i] != arr[size - 1])
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[] = { -12, 13, 12, 14, 15, -4, 10, 23, 54, 58 };
		System.out.println("Second Largest: " + secondLargest(arr));
	}
}
