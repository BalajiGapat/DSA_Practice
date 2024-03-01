package B_binary_search;

public class FindSmallestLetterGreaterThanTarget
{
	public static char smallestLetterGreaterThanTarget(char[] arr, char target)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(target<arr[mid])
				last=mid-1;
			else
				first=mid+1;		
		}
		return arr[first%arr.length];
	}
	
	
	public static void main(String[] args) 
	{
		char[] arr= {'C', 'E', 'G', 'I', 'K', 'M'};
		System.out.println(smallestLetterGreaterThanTarget(arr, 'P'));
	}
}
