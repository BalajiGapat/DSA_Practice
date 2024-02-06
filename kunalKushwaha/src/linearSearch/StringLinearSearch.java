package linearSearch;

public class StringLinearSearch {
	public static boolean linearSearch(String str, char ch) {
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==ch)
			return true;
		}
		return false;
	}
	
	public static boolean linearSearch2(String str, char ch) {
		for(char chr : str.toCharArray())
			if(chr==ch)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		String str="BalajiGapatFromDharashiv";
		System.out.println("is founded: "+linearSearch2(str, 'g'));
	}
}
