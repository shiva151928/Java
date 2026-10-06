/*

	k,v------> key it applies a formula----> index-----> value will be stored.

	key-->formula--->index---->from that index it will give value.
*/


import java.util.*;

class HashtableDemo
{
	public static void main(String args[])
	{
		Hashtable<String,Integer>	ht;

		ht=new Hashtable<String,Integer>();
		
		ht.put("one",1);
		ht.put("three",3);
		ht.put("five",5);
		
		System.out.println(ht.get("five"));

		Enumeration<String>	keys=ht.keys();
		while(keys.hasMoreElements())
		{
			System.out.println(keys.nextElement());		
		}

		Collection<Integer>	c=ht.values();
		Iterator<Integer>	itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
