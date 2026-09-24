import javax.swing.*;
import java.awt.event.*;

class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,"Helloooo");
	}
}

class JFrameDemo
{
	public static void main(String args[])
	{
	
		JFrame		frm=new JFrame();

		ButtonListener 	btnListener=new ButtonListener();

		frm.setLayout(null);
		JButton		btn;
		btn=new JButton("Ok");
		btn.setBounds(150,200,100,30);
		btn.addActionListener(btnListener);

		frm.add(btn);	
		frm.setSize(500,500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frm.setVisible(true);		
	}
}