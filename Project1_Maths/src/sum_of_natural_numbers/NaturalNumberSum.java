package sum_of_natural_numbers;

public class NaturalNumberSum 
{
	public static void main(String[] args) 
	{
		int n=6;
		System.out.println("1+2+..."+n+"="+( n*(n+1)/2 ));
		System.out.println("1+3+..."+n+"="+n*n );
		System.out.println("2+4+6+...="+n+"="+n*(n+1) );
		
		System.out.println("1^2 + 2^2 + 3^2 + ...="+n+"="+( 2*n*(n+1)*(2*n+1)/6 ));
		System.out.println("1^3 + 2^3 + 3^3 + ...="+n+"="+(n*(n+1)/2) * (n*(n+1)/2) );
		
	}
}
