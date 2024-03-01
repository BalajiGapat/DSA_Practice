package sorting_algorithm;

import java.util.Arrays;

public class SelectionSort 
{
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {6,7,4,3,9,8,1,3,2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
