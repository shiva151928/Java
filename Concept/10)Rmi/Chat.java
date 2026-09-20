import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

interface Ichat extends Remote
{
	void connect(String username,IchatClient cc) throws RemoteException;
	void send(String username,String msg) throws RemoteException;
}
public class Chat implements Ichat
{
	Hashtable<String,IchatClient> ht=new Hashtable();
	public void connect(String username,IchatClient cc) throws RemoteException
	{
		System.out.print("connect");
		ht.put(username,cc);
	}
	public void send(String username,String msg) throws RemoteException
	{
		System.out.print("send");
		ht.get(username).delivery(msg);
	}
}