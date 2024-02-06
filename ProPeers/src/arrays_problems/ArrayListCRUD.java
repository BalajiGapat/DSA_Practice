package arrays_problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCRUD 
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		System.out.println(list);
		
//		for(int i : list)
//			System.out.println(i);
		
//		list.forEach(i->System.out.println(i));
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			// list.remove(i); // dose not work properly
//		}
		
		// list.forEach(i->list.remove(i)); // java.util.ConcurrentModificationException
		
		// this is the correct way
//		Iterator<Integer> itr=list.iterator();
//		while(itr.hasNext())
//		{
//			itr.next();
//			itr.remove();
//		}
		
		// updating list elements
		for(int i=0;i<list.size();i++)
		{
			list.set(i, list.get(i)+5);
		}
		list.forEach(i->System.out.println(i));
		
		System.out.println("list size: "+list.size());
		
		
	}
}
