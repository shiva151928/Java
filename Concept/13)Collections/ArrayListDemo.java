import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer>	al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(2,250);
		
		System.out.println(al.get(2));

		System.out.println(al.indexOf(300));

		al.remove(2);
		al.remove((Object)300);
		al.remove(Integer.valueOf(200));

		Iterator<Integer>	itr;

		itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
}