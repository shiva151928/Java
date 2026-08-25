class program 
{
	public static void main(String arg[])
	{
		int a[];
		int n,search;
		n=Integer.parseInt(System.console().readLine());
		
		a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(System.console().readLine());
		}
		search=Integer.parseInt(System.console().readLine());
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.print(i);
				break;
			}
			else if(i==n-1)
			{
				System.out.print("notfount");
			}
		}
	}
}
