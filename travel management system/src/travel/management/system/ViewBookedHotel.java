
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewBookedHotel(String username){
        
        setBounds(400,200,1000,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text=new JLabel("View Booked Hotel Details");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage=new JLabel("Hotel Name");
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
        
        JLabel lbldays=new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        add(lbldays);
        
        JLabel labledays=new JLabel();
        labledays.setBounds(220,170,150,25);
        add(labledays);
        
        JLabel lblac=new JLabel("Ac/Non-Ac");
        lblac.setBounds(30,210,150,25);
        add(lblac);
        
        JLabel lableac=new JLabel();
        lableac.setBounds(220,210,150,25);
        add(lableac);
        
        JLabel lblfood=new JLabel("Food Included?");
        lblfood.setBounds(30,250,150,25);
        add(lblfood);
        
        JLabel lablefood=new JLabel();
        lablefood.setBounds(220,250,150,25);
        add(lablefood);
        
        
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,290,150,25);
        add(lblid);
        
        JLabel lableid=new JLabel();
        lableid.setBounds(220,290,150,25);
        add(lableid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,330,150,25);
        add(lblnumber);
        
        JLabel lablenumber=new JLabel();
        lablenumber.setBounds(220,330,150,25);
        add(lablenumber);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        JLabel lablephone=new JLabel();
        lablephone.setBounds(220,370,150,25);
        add(lablephone);
        
        JLabel lblprice=new JLabel("Total Cost");
        lblprice.setBounds(30,410,150,25);
        add(lblprice);
        
        JLabel lableprice=new JLabel();
        lableprice.setBounds(220,410,150,25);
        add(lableprice);
        
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,460,100,25);
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
            String query="select * from book_hotel where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                
                labelusername.setText(rs.getString("username"));
                lableid.setText(rs.getString("number"));
                lablenumber.setText(rs.getString("phone"));
                lablepackage.setText(rs.getString("name"));
                lableprice.setText(rs.getString("id"));
                lablephone.setText(rs.getString("price"));
                lablepersons.setText(rs.getString("person"));
                lableac.setText(rs.getString("ac"));
                lablefood.setText(rs.getString("food"));
                labledays.setText(rs.getString("days"));
                
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
        new ViewBookedHotel("don");
    }
}

