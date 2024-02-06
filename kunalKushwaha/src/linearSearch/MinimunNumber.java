package linearSearch;

public class MinimunNumber {
	public static int minNumber(int[] arr) {
		int ind=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]<arr[ind])
				ind=i;
		return ind;
	}
	public static void main(String[] args) {
		int[] arr= {18,36,54,72,90,108,126,13,144,162,180};
		System.out.println("min element is at index: "+minNumber(arr));
	}
}
