package B_binary_search;

public class ReturnCeilingNumber
{
	public static int returnCeling(int[] arr, int target)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(target==arr[mid])
				return arr[mid];
			else if(target<arr[mid])
				last=mid-1;
			else
				first=mid+1;
		}
		
		return arr[first];
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,3,5,7,9,11,13,15,17,19};
		System.out.println(returnCeling(arr, 18));
	}
}
