import java.util.*;
import java.util.Scanner.*;
	
class Con
{
	public static void main(String args[])
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			count++;
			n=n/10;
		}
		System.out.print(count);
	}

}
