package searching_algorithm;

public class LinearSearch 
{
	public static int linearSearch(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
				return i;
		}		
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {5,6,1,2,3,4,7,8};
		System.out.println("target is at: "+linearSearch(arr, 6));
		
	}
}
