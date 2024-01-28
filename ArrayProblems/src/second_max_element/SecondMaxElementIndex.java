package second_max_element;

public class SecondMaxElementIndex {

	public static int firstMaxIndex(int[] arr) {
		int maxInd = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[maxInd]) {
				maxInd=i;
			}
		}
		return maxInd;
	}

	public static int secondMax(int[] arr) 
	{
		int max1Ind=firstMaxIndex(arr);
		int max2Ind=-1;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[max1Ind]!=arr[max2Ind]) 
			{
				if(max2Ind==-1)
					max2Ind=i;
				else if(arr[i]>arr[max2Ind])
					max2Ind=i;
			}
		}
		return max2Ind;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 3, 4, 8, 5, 6, 7, 8 };
		
	}

}
