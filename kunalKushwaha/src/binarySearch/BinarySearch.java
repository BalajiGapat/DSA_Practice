package binarySearch;

public class BinarySearch 
{
	public static int binarySearch(int[] arr, int key)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				last=mid-1;
			else
				first=mid+1;	
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("element is at index: "+binarySearch(arr, 11));
	}
}
