package A_Interoduction_to_array;

import java.util.Arrays;
import java.util.Comparator;

public class FirstMaxElementFromArray 
{
	public static int MaxElement(int[] arr)
	{
		int maxInd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[maxInd])
				maxInd=i;
		}
		return maxInd;
	}
	
	public static int maxElement2(Integer[] arr) 
	{
        if (arr == null || arr.length == 0) 
        {
            throw new IllegalArgumentException("Input array is null or empty.");
        }

        Arrays.sort(arr, new Comparator<Integer>() 
        {
            @Override
            public int compare(Integer o1, Integer o2) 
            {
                // Sort in descending(Decreasing) order for eg. 99,88,77,66,55...
                return o2.compareTo(o1);
            }
        });

        // Return the maximum value (which is the first element after sorting)
        return arr[0];
    }
	
	
	public static void main(String[] args) 
	{
		int[] arr={1,24,3,4,56,6,7,86,9};
		System.out.println("Max element is present at index : "+MaxElement(arr));
		
		Integer[] arr2={1,24,3,4,56,6,7,86,9};
		System.out.println("Max element is: "+maxElement2(arr2));
	}
}
