import javax.swing.*;
import java.awt.event.*;

interface sending
{
    void call(String str);
}

class MyFrame1 extends JFrame implements ActionListener,sending
{
	JTextField tf;
	JButton btn;
	sending s=this;
	public MyFrame1()
	{
		setSize(500,500);
		setLayout(null);
		tf=new JTextField();
		tf.setBounds(100,100,100,30);
		
		btn=new JButton("ok");
		btn.setBounds(100,200,100,30);
		btn.addActionListener(this);
		
		add(tf);
		add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		MyFrame2 frm=new MyFrame2();
		frm.call(tf.getText(),s);
	}
	public void call(String str)
	{
		tf.setText(str);
	}
}
class program
{
	public static void main(String args[])
	{
		MyFrame1 frm;
		frm=new MyFrame1();
	}
}