class MyThread extends Thread
{
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		try{
			for(int j=5;j>=0;j--)
			{
				System.out.println(Thread.currentThread().getName() +j);
				Thread.sleep(600);
			}
		}catch(Exception ex)
		{
			System.out.print(ex);
		}
	}
}
class Demo
{
	public static void main(String args[]) throws Exception
	{
		MyThread mt=new MyThread("MyThread - 1");
		mt.start();

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()  + "" +i);
			Thread.sleep(300);
		}
	}
}
