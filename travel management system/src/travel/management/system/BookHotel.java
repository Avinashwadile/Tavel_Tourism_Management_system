package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookHotel extends JFrame implements ActionListener{

  Choice chotel,cac,cfood;
  JTextField tfperson,tfdays;
  JLabel labelusername,lblid,lablenumber,lablephone,lableprice,lableid;
  JButton checkprice,bookpackage,back;
  String username;
    
    BookHotel(String username){
        this.username=username;
        
        setBounds(350,200,1100,600);
        setLayout(null);
        
        JLabel text=new JLabel("BOOK HOTEL");
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
        
        JLabel lblpackage=new JLabel("SELECT HOTEL");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        chotel=new Choice();
        chotel.setBounds(250,110,150,20);
        add(chotel);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }
        catch(Exception e){
         e.printStackTrace();
        }
        
        JLabel lblperson=new JLabel("Total Persons");
        lblperson.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblperson.setBounds(40,150,150,25);
        add(lblperson);
        
        tfperson=new JTextField("1");
        tfperson.setBounds(250,150,150,20);
        add(tfperson);
        
        JLabel lbldays=new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
        
        tfdays=new JTextField("1");
        tfdays.setBounds(250,190,150,20);
        add(tfdays);
        
        JLabel lblac=new JLabel("AC/Non-AC");
        lblac.setBounds(40,230,150,20);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblac);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfood=new JLabel("Food includede");
        lblfood.setBounds(40,270,150,20);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        lblid=new JLabel("ID");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);
        
        lableid=new JLabel();
        lableid.setBounds(250,310,150,20);
        lableid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lableid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,350,150,20);
        add(lblnumber);
        
        lablenumber=new JLabel();
        lablenumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lablenumber.setBounds(250,350,150,20);
        add(lablenumber);
        
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,390,150,20);
        add(lblphone);
        
        lablephone=new JLabel();
        lablephone.setBounds(250,390,150,20);
        add(lablephone);
        
        
        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,430,150,20);
        add(lbltotal);
        
        lableprice=new JLabel();
        lableprice.setBounds(250,430,150,20);
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
        checkprice.setBounds(60,480,120,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage=new JButton("Book Hotel");
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        bookpackage.setBounds(200,480,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(340,480,120,25);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,400 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(550,50,600,300);
        add(image);
          
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==checkprice){
            try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel where name= '"+chotel.getSelectedItem()+"' ");
            while(rs.next()){
                int cost=Integer.parseInt(rs.getString("costperperson"));
                int food=Integer.parseInt(rs.getString("food"));
                int ac=Integer.parseInt(rs.getString("acroom"));
                
                int person=Integer.parseInt(tfperson.getText());
                int days=Integer.parseInt(tfdays.getText());
                
                String acselected=cac.getSelectedItem();
                String foodselected=cfood.getSelectedItem();
                   
                if(person+days>0){
                    int total=0;
                    total += acselected.equals("AC")?ac:0;
                    total += foodselected.equals("Yes")?food:0;
                    total += cost;
                    total =  total*person*days;
                    lableprice.setText("Rs:"+total);
                }else{
                    JOptionPane.showInternalMessageDialog(null,"Please Enter Valid Numbers");
                }
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        else if(ae.getSource()==bookpackage){
                
            try{
               Conn c=new Conn(); 
               c.s.executeUpdate("insert into book_hotel values ('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfperson.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+lableprice.getText()+"','"+lableid.getText()+"','"+lablenumber.getText()+"','"+lablephone.getText()+"')");
               JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
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
        new BookHotel("fgf");
            
        
    }
    
}
