package bubble_sort;

import java.util.Arrays;

public class BubbleSort 
{
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {19,12, 17,14,16,11};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
