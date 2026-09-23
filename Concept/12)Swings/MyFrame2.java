import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame implements ActionListener
{
	JTextField tf;
	JButton btn;
	sending data;
	public MyFrame2(String str,sending f)
	{
		setSize(500,500);
		setLayout(null);

		tf=new JTextField();
		tf.setBounds(100,100,100,30);

		data=f;
		tf.setText(str);

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
		data.call(tf.getText());
	}
}