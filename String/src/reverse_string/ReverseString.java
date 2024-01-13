package reverse_string;

import java.util.Scanner;

public class ReverseString 
{
	public static String reverseStr(String str)
	{
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr+=str.charAt(i);
		}
		return newStr;
		
		//StringBuffer sb=new StringBuffer(str);
		//sb.reverse();
		//return sb.toString();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter String str: ");
		String str=sc.nextLine();
		System.out.println("Original String: "+str);
		
		String revStr=reverseStr(str);
		System.out.println("reverse String: "+revStr);
	}
}
