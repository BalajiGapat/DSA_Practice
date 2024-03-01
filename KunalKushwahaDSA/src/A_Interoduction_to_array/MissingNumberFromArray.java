package A_Interoduction_to_array;

import java.util.Arrays;

public class MissingNumberFromArray 
{
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int expSum=n*(n+1)/2;
		int actSum=0; 
		actSum=Arrays.stream(arr).sum();
		
		return expSum-actSum;
	}
	
	public static int missingNumber2(int[] arr)
	{
		int n=arr.length+1;
		int ans=n*(n+1)/2;
		for(int i : arr)
			ans=ans-i;
		
		return ans;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {5,4,1,10,2,9,7,8,6};
		System.out.println("missing No: "+missingNumber2(arr));
		
	}
}