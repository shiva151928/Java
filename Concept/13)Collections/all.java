interface Iterable
{
	Iterator iterator();
}
interface Iterator
{
	boolean hasNext();
	int 	next();
	Iterator iterator();
}
class Stack implements Iterator
{
	private int arr[];
	private int i;
	private int j;

	public Stack(int val)
	{
		arr=new int[val];
		i=0;
		
	}
	public void push(int value)
	{
		arr[i]=value;
		i++;
		j=i;
	}
	public int next()
	{
		i--;
		return arr[i];
	}
	public boolean hasNext()
	{
		return i==0;
	}
	public Iterator iterator()
	{
		i=j;
		return this;
	}
}
class queue implements Iterator
{
	private int arr[];
	private int i;
	private int j;
	public queue(int val)
	{
		arr=new int[val];
		i=0;
		j=0;
	}
	public void enqueue(int val)
	{
		arr[i]=val;
		i++;
	}
	public int next()
	{
		return arr[j++];
	}
	public boolean hasNext()
	{
		return i==j;
	}
	public Iterator iterator()
	{
		j=0;
		return this;
	}
}
class Linked implements Iterator
{
	private int data;
	Linked next;
	
	Linked head;
	Linked first;
	public void add(int val)
	{
		Linked newNode = new Linked();
		newNode.data = val;
        	newNode.next = null;
        	if (head == null) 
		{
            		head = newNode;
			first=head;
            		return;
        	}
		Linked temp=head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next = newNode;
	}
	public int next()
	{
    		int val = first.data;
        	first = first.next;
        	return val;
	}
	public boolean hasNext()
	{
		return first==null;
	}
	public Iterator iterator()
	{
		first=head;
		return this.iterator();
	}
}
class program
{
	public static void main(String arg[])
	{
		Stack s=new Stack(5);
		queue q=new queue(5);
		Linked l=new Linked();
		Iterator itr;
		
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);
		
		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		itr=s;
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr.iterator();
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr=q;
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr.iterator();
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr=l;
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr.iterator();
		while(!(itr.hasNext()))
		{
			System.out.print(itr.next());
		}
		itr=l.iterator();
		System.out.print(itr);
		for(int num : itr)
		{
			System.out.print(num);
		}
	}
}