import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

class MyFrame extends JFrame
{
    JFileChooser jfc;
    JLabel lbl, imglbl;  
    JScrollPane jsp;
    JButton btn;  
    public MyFrame()
    {
        setTitle("Image Viewer");
        setSize(500, 500);
        setLayout(null);

        lbl = new JLabel("INNOVATIVE SOFTWARE SOLUTIONS");
        lbl.setBounds(100, 20, 300, 30);

        btn = new JButton("Open");
        btn.setBounds(100, 70, 100, 30);

        jfc = new JFileChooser();
	jfc.setMultiSelectionEnabled(true);
        btn.addActionListener((e) -> {
            int state = jfc.showOpenDialog(this);

            if(state == JFileChooser.APPROVE_OPTION)
            {
                File images[] = jfc.getSelectedFiles();

                for(int i=0;i<images.length;i++)
		{
			String path = images[i].getPath();
			System.out.println(path);
			imglbl = new JLabel(new ImageIcon(images[i].getPath()));
        		jsp = new JScrollPane(imglbl);
        		jsp.setBounds(50 + (i * 150), 120, 140, 300);
			add(jsp);
		}
            }
        });

        add(lbl);
        add(btn);
   
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new MyFrame();
    }
}