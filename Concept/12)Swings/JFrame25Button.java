import javax.swing.*;
import java.awt.event.*;

class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		JOptionPane.showMessageDialog(null,str);
	}
}
class B25
{
	public static void main(String args[])
	{
		JFrame frm=new JFrame();
		
		frm.setVisible(true);
		frm.setSize(500,500);
		ButtonListener btnlistener=new ButtonListener();
		int k=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("coming");
				JButton btn=new JButton(k++ + "");
				btn.addActionListener(btnlistener);
				btn.setBounds(100*j,100*i,100,30);
				frm.add(btn);
			}
		}
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
