//runnable interface


class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class program
{
	
	public static void main(String args[])
	{

		Thread 	t1=new Thread(new MyThread());
		Thread 	t2=new Thread(new MyThread());

		Runnable runnable=()->{
			for(int i=5;i>0;i--)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};

		Thread  t3=new Thread(runnable);

		t1.start();
		t2.start();
		t3.start();

	}

}
