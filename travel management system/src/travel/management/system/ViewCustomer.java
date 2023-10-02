
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewCustomer extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewCustomer(String username){
        
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JLabel lableid=new JLabel();
        lableid.setBounds(220,110,150,25);
        add(lableid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        JLabel lablenumber=new JLabel();
        lablenumber.setBounds(220,170,150,25);
        add(lablenumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JLabel lablename=new JLabel();
        lablename.setBounds(220,230,150,25);
        add(lablename);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JLabel lablegender=new JLabel();
        lablegender.setBounds(220,290,150,25);
        add(lablegender);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
        JLabel lablecountry=new JLabel();
        lablecountry.setBounds(690,50,150,25);
        add(lablecountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        add(lbladdress);
        
        JLabel lableaddress=new JLabel();
        lableaddress.setBounds(690,110,150,25);
        add(lableaddress);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        add(lblphone);
        
        JLabel lablephone=new JLabel();
        lablephone.setBounds(690,170,150,25);
        add(lablephone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        JLabel lableemail=new JLabel();
        lableemail.setBounds(690,230,150,25);
        add(lableemail);
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(20,400,600,200);
        add(icon);
        
        ImageIcon i5 =new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i6=i5.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i7=new ImageIcon(i6);
        JLabel image = new JLabel(i7);
        image.setBounds(600,400,600,200);
        add(image);
        
        
        try{
            Conn conn=new Conn();
            String query="select * from customer where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lableid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("Number"));
                lablename.setText(rs.getString("name"));
                lablegender.setText(rs.getString("gender"));
                lablecountry.setText(rs.getString("country"));
                lableaddress.setText(rs.getString("address"));
                lablephone.setText(rs.getString("phone"));
                lableemail.setText(rs.getString("email"));
                
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
        new ViewCustomer("");
    }
}
