class MyThread extends Thread
{
	public void run()
	{
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(500);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

class program
{
	public static void main(String args[]) throws Exception
	{
		MyThread	mt1=new MyThread();
		MyThread 	mt2=new MyThread();

		mt1.start();
		mt2.start();

		mt1.join();
		mt2.join();


		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(100);
		}

		System.out.println("Done");
	}
}
