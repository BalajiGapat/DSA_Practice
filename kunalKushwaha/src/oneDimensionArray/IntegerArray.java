package oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray 
{
	public static void main(String[] args)
	{
		int[] arr; // array declaration arr stored in stack i.e reference variable
		arr=new int[5]; // array initialization object are created on heap
		// System.out.println(Arrays.toString(arr));
		
		String[] cities=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<cities.length;i++)
		{
			System.out.println("enter city name: ");
			cities[i]=sc.next();
		}
		// printing array
		 System.out.println(Arrays.toString(cities));
		 Arrays.asList(cities).forEach(city->System.out.println(city));
		
		for( String c : cities )
			System.out.println(c);		
		
		
		
		
	}
}
