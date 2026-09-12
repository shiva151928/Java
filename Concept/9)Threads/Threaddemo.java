class ThreadDemo
{
	public static void main(String args[])
	{
		Thread t=new Thread();

		System.out.println(t.getName());

		t.setName("main");

		System.out.println(t.getName());
	}
}
