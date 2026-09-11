class Stack
{
	private int arr[];
	private int i;
	public Stack(int val)
	{
		arr=new int[val];
		i=0;
	}
	public void push(int value)
	{
		arr[i]=value;
		i++;
	}
	public int pop()
	{
		i--;
		return arr[i];
	}
	public boolean isempty()
	{
		return arr[0]==0;
	}
}
class program
{
	public static void main(String arg[])
	{
		Stack s=new Stack(5);
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);
		while(!(s.isempty()))
		{
			System.out.print(s.pop());
		}
	}
}
		
