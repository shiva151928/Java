class Product extends parent
{
	private int pid;
	private String pname;
	private double price;
	public void read()
	{
		pid=Integer.parseInt(System.console().readLine());
		pname=System.console().readLine();
		price=Double.parseDouble(System.console().readLine());
	}
	public void print()
	{
		System.out.print(pid+pname+price);
	}
}
class Student extends parent
{
	private int sid;
	private String name;
	private double fee;
	public void read()
	{
		sid=Integer.parseInt(System.console().readLine());
		name=System.console().readLine();
		fee=Double.parseDouble(System.console().readLine());
	}
	public void print()
	{
		System.out.print(sid+name+fee);
	}
}
class parent
{
	public void read()
	{}
	public void print()
	{}
}
class program
{
	public static void main(String args[])
	{
		Student s=new Student();
		Product p=new Product();
		s.read();
		p.read();
		List l=new List(3);
		l.add(s);
		l.add(p);
		l.print();
	}
}
class List
{
	private parent p[];
	private int i;
	public List(int val)
	{
		p=new parent[val];
		i=0;
	}
	public void add(parent pa)
	{
		p[i]=pa;
		i++;	
	}
	public void print()
	{
		for(int j=0;j<i;j++)
			{
				p[j].print();
			}
	}
}

