package oneDimensionArray;

public class MaxElements 
{
	public static int maxElement(int[] arr)
	{
		int maxInd=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[maxInd])
				maxInd=i;
		}
		
		
		return maxInd;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {117,13,26,39,130,52,65,91};
		System.out.println("max element is at index: "+maxElement(arr));
	}
}
