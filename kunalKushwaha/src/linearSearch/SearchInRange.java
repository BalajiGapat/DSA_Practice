package linearSearch;

public class SearchInRange {
	public static int linearSearch(int[] arr, int key, int start, int last) {
		for(int i=start;i<=last;i++) {
			if(arr[i]==key)
				return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {17,34,51,68,85,102,119,136,153,170};
		System.out.println("is founded: "+linearSearch(arr, 102, 6, 8));
	}
}
