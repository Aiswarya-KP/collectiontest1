package collectiontest1;

import java.util.*;

public class ArrayCollectionTest 
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
		list.remove(1);
		list.remove(2);
		System.out.println("after removing two elements");
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
			
		
		
	}
	}


