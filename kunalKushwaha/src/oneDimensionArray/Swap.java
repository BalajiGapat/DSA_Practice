package oneDimensionArray;

import java.util.Arrays;

public class Swap {

	public static void swap(int[] arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 24, 36, 48 };
		swap(arr, 0, 3);
		System.out.println(Arrays.toString(arr));

	}

}
