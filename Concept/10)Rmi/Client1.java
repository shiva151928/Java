import java.rmi.*;
import java.rmi.server.*;

class Client1
{
	public static void main(String args[])
	{
		try{
			System.out.print("enter your name");
			String str=System.console().readLine();

	 		Ichat chat=(Ichat)Naming.lookup("rmi://localhost:1099/chat");
			chatClient cc= new chatClient();
			chat.connect(str,cc);
			while(true)
			{
				System.out.print("enter another Client Name");
				String un=System.console().readLine();
				System.out.print("enter msg to send");
				String msg=System.console().readLine();
				chat.send(un,msg);
				if(msg.equals("exit"))
				{
					break;
				}
			}
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}