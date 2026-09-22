import java.util.*;
import java.util.Scanner.*;
	
class program
{
	public static void main(String args[])
	{
		int input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		int digits=0,rev=0;
		if(input==0)
			rev=0;
		while(input>0)
		{
			digits=input%10;
			input=input/10;
			rev=digits+(rev*10);
		}
		System.out.print(rev);
	}
}
