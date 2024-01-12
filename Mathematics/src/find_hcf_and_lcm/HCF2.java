package find_hcf_and_lcm;

public class HCF2 
{
	public static int hcf(int num1, int num2)
	{
		while(num1!=num2)
		{
			if(num1<num2)
				num2=num2-num1;
			else
				num1=num1-num2;
		}
		return num1; //OR num2;
	}
	
	public static void main(String[] args) 
	{
		int num1=18;
		int num2=72;
		System.out.println(hcf(num1, num2));
	}
}
