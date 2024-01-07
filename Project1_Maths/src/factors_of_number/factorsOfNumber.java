package factors_of_number;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class factorsOfNumber 
{
	public static List<Integer> factorsOfNum(int num)
	{
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=(int)Math.sqrt(num);i++) 
		{
			if(num%i==0)
			{
				list.add(i);
				
				if(i!=num/i) 
					list.add(num/i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) 
	{
		int num=49; // 48 ==>> (1, 48), (2, 24), (3, 16), (4, 12), (6, 8)
		List<Integer> list=factorsOfNum(num);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
