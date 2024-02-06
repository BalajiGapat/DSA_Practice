package arrays_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayList
{
	public static List<Integer> rotate(List<Integer> list, int k)
	{
		int n=0;
		while(n<k)
		{
			int first=list.get(0);
			for(int i=1;i<list.size();i++)
			{
				list.set(i-1, list.get(i));
			}
			list.set(list.size()-1, first);
			n++;
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10); // new ArrayList<>();
		rotate(list, 4);
		System.out.println(list);
	}
}
