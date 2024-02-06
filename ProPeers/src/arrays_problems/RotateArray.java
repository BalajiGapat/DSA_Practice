package arrays_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray 
{
	
	// Good approach
	public static void rotate(int[] arr, int k)
	{
		int n=0; // i=0,1,2    k=3
		while(n<k)
		{
			int first=arr[0];
			for(int i=1;i<arr.length;i++) // i=1,2,3,4
			{
				arr[i-1]=arr[i]; 
			}
			arr[arr.length-1]=first;
			n++;
		}
	}
	
	public static void rotateArray(int[] arr, int k)
	{
		
		int tempArr[]=new int[k]; // k=3-1=2
		for(int i=0;i<tempArr.length;i++)
		{
			tempArr[i]=arr[i]; 
		}
		
		int count=0; // 0,1,2,3,4,5,6
		for(int i=k;i<arr.length;i++) // i=3,4,5,6,7,8,9
		{
			arr[count++]=arr[i];
		}
		int i=0;
		while(i<tempArr.length) // i=0,1,2
		{
			arr[count++]=tempArr[i++]; // count=7,8,9, #10
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		rotate(arr, 8);
		System.out.println(Arrays.toString(arr));
	}
}
