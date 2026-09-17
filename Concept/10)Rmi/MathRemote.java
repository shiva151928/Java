import java.rmi.*;
import java.rmi.server.*;

interface IMathRemote extends Remote
{
	public int sum(int x,int y) throws RemoteException;
}

public class MathRemote implements IMathRemote
{
	
	public int sum(int x,int y) throws RemoteException
	{
		System.out.println("sum invoked");
		return x+y;
	}
}
