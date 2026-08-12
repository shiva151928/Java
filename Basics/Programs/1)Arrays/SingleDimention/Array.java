class program 
{
	public static void main(String arg[])
	{
		int a[];
		int n;
		n=Integer.parseInt(System.console().readLine());
		a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(System.console().readLine());
		}
		for(int i=0;i<a.length;i++)
		{
				System.out.print(a[i]);
			
		}
	}
}
