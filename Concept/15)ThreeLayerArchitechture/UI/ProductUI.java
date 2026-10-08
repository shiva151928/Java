package org.example.UI;
import org.example.BLL.ProductBLL;
import org.example.models.Product;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Iterator;
import java.util.List;

public class ProductUI extends JFrame
{

    private JTextField pidtxt,pnametxt,pricetxt;
    private JButton savebtn,displaybtn,updatebtn,deletebtn,findbtn;
    private DefaultTableModel dtm;
    private JTable table=null;
    private JScrollPane jsp;

    ProductBLL productBLL;


    public ProductUI()
    {
        try {
            productBLL = new ProductBLL();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        setSize(500,500);

        pidtxt=new JTextField();
        pidtxt.setBounds(100,100,100,30);
        pnametxt=new JTextField();
        pnametxt.setBounds(100,150,100,30);
        pricetxt=new JTextField();
        pricetxt.setBounds(100,200,100,30);

        savebtn=new JButton("Save");
        savebtn.setBounds(100,250,100,30);
        savebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Product product=new Product();
                    product.setPid(Integer.parseInt(pidtxt.getText()));
                    product.setPname(pnametxt.getText());
                    product.setPrice(Double.parseDouble(pricetxt.getText()));
                    if(productBLL.save(product))
                    {
                        JOptionPane.showMessageDialog(null,"Product saved successfully");
                        pidtxt.setText("");
                        pnametxt.setText("");
                        pricetxt.setText("");
                    }
                } catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        displaybtn=new JButton("Display");
        displaybtn.setBounds(200,250,100,30);
        displaybtn.addActionListener(new ActionListener() {
            List<Product> al;
            public void actionPerformed(ActionEvent e) {
                try {

                    al=productBLL.getProducts();
                    Iterator<Product>  itr;
                    itr=al.iterator();
                    while(itr.hasNext())
                    {
                        Product p=itr.next();
                        dtm.addRow(new Object[]{p.getPid(), p.getPname(), p.getPrice()});
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        updatebtn=new JButton("Update");
        updatebtn.setBounds(300,250,100,30);
        updatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Product product=new Product();
                    product.setPid(Integer.parseInt(pidtxt.getText()));
                    product.setPname(pnametxt.getText());
                    product.setPrice(Double.parseDouble(pricetxt.getText()));
                    productBLL.update(product);
                } catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });

        deletebtn=new JButton("DELETE");
        deletebtn.setBounds(400,250,100,30);
        deletebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    productBLL.deleteProduct(Integer.parseInt(pidtxt.getText()));
                }catch (Exception ex)
                {
                    System.out.print(ex.getMessage());
                }
            }
        });

        findbtn=new JButton("Find By Id");
        findbtn.setBounds(400,350,100,30);
        findbtn.addActionListener(((e)->{

            Product p= productBLL.findById(Integer.parseInt(pidtxt.getText()));
            pnametxt.setText(p.getPname());
            pricetxt.setText(""+p.getPrice());

        }));


        dtm=new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        dtm.addColumn("Price");
        table=new JTable(dtm);
        jsp=new JScrollPane(table);

        jsp.setBounds(10,380,480,300);

        add(pidtxt);
        add(pnametxt);
        add(pricetxt);
        add(savebtn);
        add(jsp);
        add(displaybtn);
        add(updatebtn);
        add(deletebtn);
        add(findbtn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
