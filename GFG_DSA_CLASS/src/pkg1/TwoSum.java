package pkg1;

public class TwoSum 
{
	
//	public static boolean twoSum(int[] arr, int target)
//	{
//		int left=0;
//		int right=arr.length-1;
//		
//		while(left<right)
//		{
//			if(arr[left]+arr[right]==target)
//				return true;
//			else if(arr[left]+arr[right]<target)
//				left++;
//			else if(arr[left]+arr[right]>target)
//				right--;
//		}
//		
//		return false;
//	}
	
	
	public static boolean twoSum(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
					return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6};
		System.out.println(twoSum(arr, 12));
	}
}
