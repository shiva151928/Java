// lamda functions or arrow functions.


interface IMath
{
	int calc(int x,int y);
}


class Math implements IMath
{
	public int calc(int x,int y)
	{
		return x+y;
	}
}


class program
{
	public static void main(String args[])
	{
		IMath m=new Math();


		IMath m2=new IMath(){
			public int calc(int x,int y)
			{
				return x-y;
			}
		};


		IMath m3=(a,b)->a*b;

		System.out.println(m.calc(100,200));
		System.out.println(m2.calc(400,200));
		System.out.println(m3.calc(400,200));


	}
}
