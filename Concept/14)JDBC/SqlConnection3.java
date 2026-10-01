import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SqlConnection3 extends JFrame  implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton btn;


	public SqlConnection3()
	{
		setSize(400,400);
		setVisible(true);
		setLayout(null);

		tf1=new JTextField();
		tf1.setBounds(100,100,100,30);

		tf2=new JTextField();
		tf2.setBounds(100,200,100,30);
		
		tf3=new JTextField();
		tf3.setBounds(100,300,100,30);

		btn=new JButton("Send");
		btn.setBounds(100,400,100,30);
		btn.addActionListener(this);

		add(tf1);
		add(tf2);
		add(tf3);
		add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		stmt.execute("insert into studenttbl values("+tf1.getText()+",'"+tf2.getText()+"',"+tf3.getText()+")");
	}
	public static void main(String args[])
	{
		Connection con=null;
		try{
		
			con=DriverManager.getConnection("jdbc:sqlserver://SKY\\SQLEXPRESS;databaseName=issjavadb;encrypt=true;integratedSecurity=true;trustServerCertificate=true");
			System.out.println("connected successfully");
			Statement stmt;
			
			stmt=con.createStatement();
			SqlConnection3 sql=new SqlConnection3();

			ResultSet rs=stmt.executeQuery("select * from studenttbl");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getDouble(3));
			}
		}catch(Exception ex)
			{
				ex.printStackTrace();
			}finally{
				try{
					if(con!=null)
					{
						con.close();
					}
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
