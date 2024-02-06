package linearSearch;

public class LinerSearch {
	public static int linerSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 16, 32, 48, 64, 80, 96, 112, 128, 144, 160 };
		System.out.println("Element founded at index: "+linerSearch(arr, 80));
	}
}
