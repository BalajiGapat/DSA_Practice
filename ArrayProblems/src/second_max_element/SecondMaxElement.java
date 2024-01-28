package second_max_element;

public class SecondMaxElement 
{
	public static void secondMax(int[] arr)
	{
		int max1;
		int max2;
		if(arr[0]>arr[1])
		{
			max1=arr[0];
			max2=arr[1];
		}
		else
		{
			max1=arr[1];
			max2=arr[0];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]<max1)
			{
				max2=arr[i];
			}
		}
		System.out.println("max1: "+max1+" max2: "+max2);
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {11,43,556,88,556,66,88,456};
		secondMax(arr);
	}
}
