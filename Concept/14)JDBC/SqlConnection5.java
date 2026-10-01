import java.io.FileInputStream;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;

class SqlConnection5 extends JFrame  implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton btn,btn1,btn2;
	JFileChooser jfc;
	Connection con=null;
	byte data[]=null;
	PreparedStatement pstmt;
	DefaultTableModel dtm;
	JScrollPane jsp=null;

	
	public SqlConnection5()
	{
		try{
			con=DriverManager.getConnection("jdbc:sqlserver://SKY\\SQLEXPRESS;databaseName=issjavadb;encrypt=true;integratedSecurity=true;trustServerCertificate=true");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

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

		btn2=new JButton("Display");
		btn2.setBounds(100,500,100,30);
		btn2.addActionListener((e)->{
		try{
			pstmt=con.prepareStatement("select * from studenttbl");
			ResultSet rs=pstmt.executeQuery();

			dtm=new DefaultTableModel();
			dtm.addColumn("ID");
			dtm.addColumn("Name");
			dtm.addColumn("Fee");
			dtm.addColumn("Image");
	
			JTable table = new JTable(dtm);
			table.setRowHeight(80);
	
			jsp=new JScrollPane(table);	
			jsp.setBounds(200,200,400,300);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double fee=rs.getDouble(3);	
				data=rs.getBytes(4);
				ImageIcon icon = null;
				JLabel imageLabel=null;
				JScrollPane scrollPane=null;
				if(data != null)
				{
    					icon = new ImageIcon(data);
					imageLabel= new JLabel(icon);
					scrollPane = new JScrollPane(imageLabel);
				}

    				dtm.addRow(new Object[]{id, name, fee, scrollPane});
			}
			add(jsp);
		}catch(Exception ex)
		{
			ex.printStackTrace();	
		}
		});

		add(tf1);
		add(tf2);
		add(tf3);
		add(btn);
		
		add(btn2);
		
		btn1 = new JButton("Open");
        	btn1.setBounds(100, 70, 100, 30);

        	jfc = new JFileChooser();
		jfc.setMultiSelectionEnabled(true);
        	btn1.addActionListener((e) -> {
            		int state = jfc.showOpenDialog(this);

            		if(state == JFileChooser.APPROVE_OPTION) {
			try{
      				File f= jfc.getSelectedFile();
				FileInputStream in = new FileInputStream(f.getPath());
				int content;
				int i=0;
				data=new byte[3245676];
				while ((content = in.read()) != -1) {
					data[i]=(byte)content;
					i++;
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
   			}
        	});

		add(btn1);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		try{
			int id=Integer.parseInt(tf1.getText());
			String name=tf2.getText();
			double fee=Double.parseDouble(tf3.getText());
			
			//String sql="insert into studenttbl values("+id+",'"+name+"',"+fee+")";
			//System.out.println(sql);

			//stmt.execute(sql);
			pstmt=con.prepareStatement("insert into studenttbl values(?,?,?,?)");
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setDouble(3,fee);
			pstmt.setBytes(4,data);
			
			pstmt.executeUpdate();

			JOptionPane.showMessageDialog(null,id+","+name+","+fee);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}	
	public static void main(String args[])
	{
		SqlConnection5 sql=new SqlConnection5();
	}	
}

/*
	Drawbacks of a statement object.

	1. Sql Injection
	2. Cant insert special characters or binary data (large).
	3. every time the statement will be parsed , compiled and then executed in the db , which makes execution slow.

*/



