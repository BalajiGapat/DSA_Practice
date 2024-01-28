package max_element_in_array;

public class MaxElementIndex {

	public static int maxElementIndex(int[] arr) {
		int maxIn = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIn]) {
				maxIn = i;
			}
		}
		return maxIn;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 88, 44, 55, 66, 77, 88 };
		System.out.println("max element is at index: " + maxElementIndex(arr));

	}
}
