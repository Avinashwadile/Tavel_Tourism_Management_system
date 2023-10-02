
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewPackage extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewPackage(String username){
        
        setBounds(420,200,900,450);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text=new JLabel("View Package Details");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage=new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel lablepackage=new JLabel();
        lablepackage.setBounds(220,90,150,25);
        add(lablepackage);
        
        JLabel lblpersons=new JLabel("Total Persons");
        lblpersons.setBounds(30,130,150,25);
        add(lblpersons);
        
        JLabel lablepersons=new JLabel();
        lablepersons.setBounds(220,130,150,25);
        add(lablepersons);
        
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,170,150,25);
        add(lblid);
        
        JLabel lableid=new JLabel();
        lableid.setBounds(220,170,150,25);
        add(lableid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,210,150,25);
        add(lblnumber);
        
        JLabel lablenumber=new JLabel();
        lablenumber.setBounds(220,210,150,25);
        add(lablenumber);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(30,250,150,25);
        add(lblphone);
        
        JLabel lablephone=new JLabel();
        lablephone.setBounds(220,250,150,25);
        add(lablephone);
        
        JLabel lblprice=new JLabel("Price");
        lblprice.setBounds(30,290,150,25);
        add(lblprice);
        
        JLabel lableprice=new JLabel();
        lableprice.setBounds(220,290,150,25);
        add(lableprice);
        
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(450,20,500,400);
        add(icon);
        
        
        try{
            Conn conn=new Conn();
            String query="select * from bookpackage where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lableid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("Number"));
                lablepackage.setText(rs.getString("Package"));
                lableprice.setText(rs.getString("Price"));
                lablephone.setText(rs.getString("phone"));
                lablepersons.setText(rs.getString("Persons"));
                
            }
        }
        catch(Exception e){
            
        }
        
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new ViewPackage("");
    }
}
