package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookPackage extends JFrame implements ActionListener{

  Choice cpackage;
  JTextField tfperson;
  JLabel labelusername,lblid,lablenumber,lablephone,lableprice,lableid;
  JButton checkprice,bookpackage,back;
  String username;
    
    BookPackage(String username){
        this.username=username;
        
        setBounds(350,200,1100,500);
        setLayout(null);
        
        JLabel text=new JLabel("BOOK PACKAGE");
        text.setBounds(200,10,200,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,70,100,20);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setBounds(250,70,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);
        
        JLabel lblpackage=new JLabel("SELECT PACKAGE");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,150,20);
        add(cpackage);
        
        
        JLabel lblperson=new JLabel("Total Persons");
        lblperson.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblperson.setBounds(40,150,150,25);
        add(lblperson);
        
        tfperson=new JTextField("1");
        tfperson.setBounds(250,150,150,20);
        add(tfperson);
        
        lblid=new JLabel("ID");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);
        
        lableid=new JLabel();
        lableid.setBounds(250,190,150,20);
        lableid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lableid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,20);
        add(lblnumber);
        
        lablenumber=new JLabel();
        lablenumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lablenumber.setBounds(250,230,150,20);
        add(lablenumber);
        
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,270,150,20);
        add(lblphone);
        
        lablephone=new JLabel();
        lablephone.setBounds(250,270,150,20);
        add(lablephone);
        
        
        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,310,150,20);
        add(lbltotal);
        
        lableprice=new JLabel();
        lableprice.setBounds(250,310,150,20);
        add(lableprice);
        
        
        
        try{
            Conn conn=new Conn();
            String query="select * from customer where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lableid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("Number"));
               // lablename.setText(rs.getString("name"));
                //lablegender.setText(rs.getString("gender"));
               // lablecountry.setText(rs.getString("country"));
               // lableaddress.setText(rs.getString("address"));
                lablephone.setText(rs.getString("phone"));
               // lableemail.setText(rs.getString("email"));
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        checkprice=new JButton("Check Price");
        checkprice.setBackground(Color.black);
        checkprice.setForeground(Color.white);
        checkprice.setBounds(60,380,120,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage=new JButton("Book Package");
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        bookpackage.setBounds(200,380,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(340,380,120,25);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
          
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==checkprice){
            String pack=cpackage.getSelectedItem();
           int cost = 0;
           
           if(pack.equals("Gold Package")){
               cost += 24000;
           }else if(pack.equals("Silver Package")){
               cost += 12000;
           }else{
               cost +=5000;
           }
             int persons=Integer.parseInt(tfperson.getText());
             cost=cost*persons;
             lableprice.setText("RS "+cost);
        }
        else if(ae.getSource()==bookpackage){
                
            try{
               Conn c=new Conn(); 
               c.s.executeUpdate("insert into bookpackage values ('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfperson.getText()+"','"+lableid.getText()+"','"+lablenumber.getText()+"','"+lablephone.getText()+"','"+lableprice.getText()+"')");
               JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
        
    }
    
    
        public static void main(String[] args) {
        new BookPackage("avinash");
    }
    
}
