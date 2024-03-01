package A_Interoduction_to_array;

public class SecondMaxElementIndex 
{
	public static int firstMaxElementIndex(int[] arr)
	{
		int maxInd=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[maxInd])
				maxInd=i;
		}
		return maxInd;
	}
	
	public static int secondMaxElementIndex(int[] arr)
	{
		int maxInd1=firstMaxElementIndex(arr);
		int maxInd2=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[maxInd1]!=arr[i])
			{
				if(maxInd2==-1)
					maxInd2=0;
				if(arr[i]>arr[maxInd2])
					maxInd2=i;
			}
		}
		return maxInd2;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {12,244,36,48,60,742,84,96,108,1220};
		System.out.println(secondMaxElementIndex(arr));
	}
}
