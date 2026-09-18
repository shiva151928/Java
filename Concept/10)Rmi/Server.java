import java.rmi.*;
import java.rmi.server.*;

class Server
{
	public static void main(String args[])
	{
		try{
		
			MathRemote	mathRemote = new MathRemote();
		
			IMathRemote proxyObject =(IMathRemote)UnicastRemoteObject.exportObject(mathRemote,0);
			System.out.println(proxyObject.getClass().getName());
			Naming.rebind("math",proxyObject);

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
