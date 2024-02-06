package find_special_character;

public class SpecialCaracter 
{
	public static void main(String[] args) 
	{
		String str="Balaji @#$%^Gapat*(*&^ Dharashiv";
		int counter=0;
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i)))
			{
				counter++;
			}
			else
				str2+=str.charAt(i);
				
		}
		
		if(counter==0)
			System.out.println("There is no special character in given string");
		else
			System.out.println("No of special Character: "+counter);
		System.out.println("str2: "+str2);
		
		
		
		
		String s1="ABCD";
		String s2="BCDA";
		
		String s3=s1+s1;
		if(s3.contains(s2))
			System.out.println("Yes Contain......");
		else
			System.out.println("not Contain......");
		
		
	}
}
