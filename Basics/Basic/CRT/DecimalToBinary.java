import java.util.*;
import java.util.Scanner.*;
class program
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int remainder=0;
		while(number>0)
		{
			remainder=number%2;
			number=number/2;
			System.out.print(remainder);
		}
		
	}
}
