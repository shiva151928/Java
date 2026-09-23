import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame
{
	JList list1,list2;

	JScrollPane scrollpane1,scrollpane2;
	JTextField tf;
	JButton btn1,btn2,btn3,btn4,btn5;
	DefaultListModel dlm1,dlm2;

	public MyFrame()
	{
		setSize(800,800);
		setVisible(true);

		dlm1=new DefaultListModel();
		list1=new JList(dlm1);
		
		dlm2=new DefaultListModel();
		list2=new JList(dlm2);
		
		
		scrollpane1=new JScrollPane(list1);
		scrollpane1.setBounds(50,50,200,300);

		scrollpane2=new JScrollPane(list2);
		scrollpane2.setBounds(500,50,200,300);


		tf=new JTextField();
		tf.setBounds(350,350,100,30);

		btn1=new JButton(">");
		btn1.setBounds(350,50,100,30);

		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dlm2.addElement(list1.getSelectedValue());
				dlm1.removeElement(list1.getSelectedValue());
			}
		});
		btn2=new JButton("<");
		btn2.setBounds(350,100,100,30);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dlm1.addElement(list2.getSelectedValue());
				dlm2.removeElement(list2.getSelectedValue());
			}
		});
		btn3=new JButton(">>>");
		btn3.setBounds(350,150,100,30);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Object obj[]=dlm1.toArray();
				for(int i=0;i<obj.length;i++)
				{
					dlm2.addElement(obj[i].toString());
					dlm1.removeElement(obj[i].toString());
				}
			}
		});
		btn4=new JButton("<<<");
		btn4.setBounds(350,200,100,30);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Object obj[]=dlm2.toArray();
				for(int i=0;i<obj.length;i++)
				{
					dlm1.addElement(obj[i].toString());
					dlm2.removeElement(obj[i].toString());
				}
			}
		});
		btn5=new JButton("Add");
		btn5.setBounds(350,400,100,30);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				dlm1.addElement(tf.getText());
			}
		});
		
		add(scrollpane1);
		add(scrollpane2);
		add(tf);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String args[])
	{
		MyFrame frm=new MyFrame();
	}
}