package insert_at_position;

import java.util.Arrays;

public class InsertAtposition
{
	public static void insert(int[] arr, int pos, int value, int cap, int size)
	{
		if(size==cap)
			return ;
		int ind=pos-1;
		for(int i=cap-1;i>=ind;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[ind]=value;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {11,22,33,44,55,0,0,0,0};
		System.out.println("before insert: "+Arrays.toString(arr));
		int cap=arr.length;
		int size=5; 
		insert(arr, 5, 999, cap, size);
		System.out.println("after insert: "+Arrays.toString(arr));
		
		
		
	}
}
