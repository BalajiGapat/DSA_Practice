package A_Interoduction_to_array;

import java.util.Arrays;

public class LinearSearchInTwoDArray 
{
	public static int[] linearSearch(int[][] arr, int key)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
				if (arr[i][j] == key)
				{
					return new int[] { i, j };
				}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) 
	{
		int[][] arr = { { 3, 6, 9 }, { 12, 15, 18, 19, 20, }, { 21, 24, 27 } };
		System.out.println("founded at index: " + Arrays.toString(linearSearch(arr, 20)));
	}	
	
	
	
}
