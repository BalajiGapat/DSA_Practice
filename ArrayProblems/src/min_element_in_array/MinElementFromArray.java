package min_element_in_array;

public class MinElementFromArray 
{

//	public static int minElement1(int[] arr)
//	{
//		Arrays.sort(arr);
//		return arr[0];
//	}
	
	public static int minElement(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {99,44,66,77,22,33,2211};
		System.out.println(minElement(arr));
	}
}
