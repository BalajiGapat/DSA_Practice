package A_Interoduction_to_array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayintroduction 
{
	
public static void main(String[] args) {
		
		int[][] arr=new int[][] {
			{1,2,3}, 
			{4,5,6,7,8,9},
			{10,11,12}
		};
		
		for(int[] numArray: arr)
			System.out.println(Arrays.toString(numArray));
		
		System.out.println("===========*******************============");
		
		
		int[][] arr1=new int[3][4];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter elements of arr1["+i+"]: ");
			for(int j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int num:arr1[i])
				System.out.print(num+" ");
			System.out.println();
		}
		
	}
	
	
}
