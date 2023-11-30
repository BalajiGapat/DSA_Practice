package factors_of_number;

import java.util.ArrayList;
import java.util.List;

public class factorsOfNumber1 
{
	public static List<Integer> findAllDivisors(int num)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				list.add(i);
		}
		list.add(num);
		//System.out.print(list);
		return list;
		
	}
	
	
	public static void main(String[] args) 
	{
		int num=20;
		List<Integer> lst=findAllDivisors(num);
		System.out.println(lst);
		
	}
}
