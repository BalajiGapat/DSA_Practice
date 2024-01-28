package count_distict_elemets_in_array;

public class CountDistirctElement 
{
	public static int countDistintElements(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++) // 10,20,30,40,20,30
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])	
				{
					flag=false;
					break;
				}
			}
			if(flag)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,3,2,1,15};
		System.out.println(countDistintElements(arr));
	}
}
