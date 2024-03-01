package A_Interoduction_to_array;

import java.util.Arrays;

public class ReverseArray 
{
	public static void reverseArray(int[] arr) 
	{
		for (int i = 0; i < arr.length / 2; i++) 
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = new int[] { 17, 34, 51, 68, 85, 102 };
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
