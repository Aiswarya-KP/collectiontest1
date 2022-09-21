package collectiontest1;

import java.util.*;

public class ArrayTest 
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Pappaya");
		list.add("Orange");
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list.remove(2);
		System.out.println("after removing third element:" +list);
	}

}
