package selection_sort;

import java.util.Arrays;

public class SelectionSort 
{
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1+i;j<arr.length;j++)
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
		int[] arr= {21, 11, 43, 16, 18, 14};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
