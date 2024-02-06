package maths_problem;

public class Factorial {
	public static int fact(int num) {
		
		if(num<0)
			return -1;
		int ans=1;
		for(int i=1;i<=num;i++) {
			ans=ans*i;
		}
		return ans;
	}
	
	public static int fact2(int num) {
		if(num==1)
			return 1;
		return fact2(num-1)*num;
	}
	
	public static void main(String[] args) {
		System.out.println(fact2(4));
	}
}
