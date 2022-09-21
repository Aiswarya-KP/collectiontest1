package collectiontest1;

import java.util.*;

public class Test 
{
	public static void main(String args[])
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
}}}
