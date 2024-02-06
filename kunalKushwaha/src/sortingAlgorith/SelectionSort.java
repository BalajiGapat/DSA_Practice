package sortingAlgorith;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int[] arr)
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
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {12,36,24,60,48,84,72,108,96,120};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
