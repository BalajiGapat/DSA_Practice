package root_of_quadratic_equation;

public class RootOfQuadraticEquation 
{
	public static void roots(int a, int b, int c)
	{
		double disc=b*b-4*a*c;
		
		double root1=(-b-Math.sqrt(disc))/(2*a);
		double root2=(-b+Math.sqrt(disc))/(2*a);
		
		System.out.println("root1: "+(int)root1+"\nroot2: "+(int)root2);
	}
	
	public static void main(String[] args) 
	{
		roots(1, -2, 1);
		roots(3, -7, 4);
	}
}
