package searching_algorithm;

public class BinarySearch 
{
	public static int binarySearch(int[] arr, int target)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(target==arr[mid])
				return mid;
			else if(target<arr[mid])
				last=mid-1; // first=mid+1 >> for desc sort array
			else // else if(target>arr[mid])
				first=mid+1; // last=mid-1 >> for desc sort array
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println("target present at: "+binarySearch(arr, 9));
	}
}
