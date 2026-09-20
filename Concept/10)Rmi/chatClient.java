import java.rmi.*;
import java.rmi.server.*;

interface IchatClient extends Remote
{
	void delivery(String msg) throws RemoteException;
}
public class chatClient extends UnicastRemoteObject implements IchatClient
{
	public chatClient() throws RemoteException
	{
		super();
	}
	public void delivery(String msg) throws RemoteException
	{
		System.out.print(msg);
	}
}