package B_binary_search;

public class ReturnFloorNumber 
{
	public static int returnFloor(int[] arr, int target)
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
		
		return arr[last];
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {12,24,36,48,60,72,84,96};
		System.out.println(returnFloor(arr, 97));
	}
}
