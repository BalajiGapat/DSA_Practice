package find_hcf_and_lcm;

public class HCF 
{
	public static void hcfAndLcm(int num1, int num2)
	{
		if(num1==0 || num2==0)
			System.out.println("hcf: "+Math.max(num1, num2)+" and Lcm: Not Posible");
		if(num1==num2)
			System.out.println("hcf: "+num1+" and Lcm: "+(num1*num2/num1));
		
		int hcf;
		if(num1<num2)
			hcf=num1;
		else
			hcf=num2;
		while(1<=hcf)
		{
			if(num1%hcf==0 && num2%hcf==0)
			{
				System.out.println("hcf: "+hcf+" and Lcm: "+(num1*num2/hcf));	
				break;
			}
			hcf--;
		}
	
		
	}//time complexity = O(log(min(n1, n2)))
	
	public static void main(String[] args) 
	{
		int num1=12;
		int num2=48;
		hcfAndLcm(num1, num2);
		
		
	}
}
