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
class Integer1 extends parent
{
	int value;
	public Integer1(int val)
	{
		value=val;
	}
	public void print()
	{
		System.out.print(value);
	}
}
class String1 extends parent
{
	String str;
	public String1(String val)
	{
		str=val;
	}
	public void print()
	{
		System.out.print(str);
	}
}
class Double1 extends parent
{
	Double dr;
	public Double1(Double val)
	{
		dr=val;
	}
	public void print()
	{
		System.out.print(dr);
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
		List l=new List(5);
		l.add(s);
		l.add(p);
    	l.add(new Integer1(100));
    	l.add(new String1("ravi"));
    	l.add(new Double1(30.000));
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
