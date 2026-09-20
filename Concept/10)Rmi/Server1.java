import java.rmi.*;
import java.rmi.server.*;

class Server1
{
	public static void main(String args[])
	{
		try{
		
			Chat chat=new Chat();
			
			Ichat proxyObject =(Ichat)UnicastRemoteObject.exportObject(chat,0);
			System.out.println(proxyObject.getClass().getName());
			Naming.rebind("chat",proxyObject);

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}