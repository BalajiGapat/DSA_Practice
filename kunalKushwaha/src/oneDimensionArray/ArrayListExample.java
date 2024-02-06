package oneDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(24);
		list.add(36);
		list.add(48);
		
		// Integer java.util.List.remove(int index)
		System.out.println(list.remove(2)); 
		System.out.println(list.contains(Integer.valueOf(48)));
		
	}
}
