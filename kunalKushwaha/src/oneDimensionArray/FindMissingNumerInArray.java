package oneDimensionArray;

public class FindMissingNumerInArray 
{
	public static int missingNumber(int[] arr)
	{
		int n=arr[arr.length-1];
		int expSum=n*(n+1)/2;
		int actSum=0;
		for(int num:arr)
			actSum=actSum+num;
		return expSum-actSum;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,10,11};
		System.out.println("missing No: "+missingNumber(arr));
		
	}
}
