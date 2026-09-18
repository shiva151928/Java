import java.rmi.*;

class Client
{
	public static void main(String args[])
	{
		try{
	 		IMathRemote mathRemote=(IMathRemote)Naming.lookup("rmi://localhost:1099/math");
			System.out.println(mathRemote.sum(100,200));
		
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
