class program
{
	public static void main(String arg[])
	{
		int a[][];
		int r,c;
		r=Integer.parseInt(System.console().readLine());
		c=Integer.parseInt(System.console().readLine());
		a=new int[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=Integer.parseInt(System.console().readLine());
			}
		}
		
		for(int i=0;i<cb.length;i++)
		{
			for(int j=0;j<cb[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
		}
	}
}
