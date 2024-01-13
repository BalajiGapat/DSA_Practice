package linear_search;

public class LinearSearch 
{
	public static boolean linearSearch(int[] arr, int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {99,66,55,33,88,22,66,77};
		System.out.println(linearSearch(arr, 88));
	}
}
 