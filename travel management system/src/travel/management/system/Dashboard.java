
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
 JButton  back, addPersonDetails,ViewPersonDetails,UpdatePersonDetails,checkpackages,bookpackage,viewpackage,DeletePersonDetails,viewhotels,bookhotel,viewbookedhotel,destinations;
 JButton  payments,calculator,notepad,about;
    
    String username;   
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonDetails=new JButton("Add Personal Details");
        addPersonDetails.setBounds(0,0,300,50);
        addPersonDetails.setBackground(new Color(0,0,120));
        addPersonDetails.setForeground(Color.white);
        addPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonDetails.setMargin(new Insets(0,0,0,60));
        addPersonDetails.addActionListener(this);
        p2.add(addPersonDetails);
        
        UpdatePersonDetails=new JButton("Update Personal Details");
        UpdatePersonDetails.setBounds(0,50,300,50);
        UpdatePersonDetails.setBackground(new Color(0,0,120));
        UpdatePersonDetails.setForeground(Color.white);
        UpdatePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        UpdatePersonDetails.setMargin(new Insets(0,0,0,30));
        UpdatePersonDetails.addActionListener(this);
        p2.add(UpdatePersonDetails);
        
        ViewPersonDetails=new JButton("View Details");
        ViewPersonDetails.setBounds(0,100,300,50);
        ViewPersonDetails.setBackground(new Color(0,0,120));
        ViewPersonDetails.setForeground(Color.white);
        ViewPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        ViewPersonDetails.setMargin(new Insets(0,0,0,130));
        ViewPersonDetails.addActionListener(this);
        p2.add(ViewPersonDetails);
        
        DeletePersonDetails=new JButton("Delete Personal Details");
        DeletePersonDetails.setBounds(0,150,300,50);
        DeletePersonDetails.setBackground(new Color(0,0,120));
        DeletePersonDetails.setForeground(Color.white);
        DeletePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        DeletePersonDetails.setMargin(new Insets(0,0,0,40));
        DeletePersonDetails.addActionListener(this);
        p2.add(DeletePersonDetails);
        
        
        checkpackages=new JButton("Check Package");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,120));
        checkpackages.setForeground(Color.white);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,120));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage=new JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,120));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,120));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,120));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,130));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,120));
        viewbookedhotel.setForeground(Color.white);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        
        destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,120));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments=new JButton("Payment");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,120));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,120));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,120));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0,700,300,40);
        about.setBackground(new Color(0,0,120));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        back=new JButton("Exit");
        back.setBounds(0,740,300,40);
        back.setBackground(new Color(0,0,120));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.PLAIN,20));
        back.setMargin(new Insets(0,0,0,175));
        back.addActionListener(this);
        p2.add(back);
        
        
        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Railway",Font.PLAIN,55));
        image.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==ViewPersonDetails){
            new ViewCustomer(username);
            
        }else if(ae.getSource()==UpdatePersonDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkpackages){
            new CheckPackage();
        }else if(ae.getSource()==bookpackage){
            new BookPackage(username);
        }else if(ae.getSource()==back){
            JOptionPane.showConfirmDialog(null,"Select any one" );
            setVisible(false);
        }else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()==destinations){
            new Destination();
        }else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()==viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payments){
            new payment(); 
        }else if(ae.getSource()==calculator){
            
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else if(ae.getSource()==notepad){
            
            try{
             Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                
            }
            
        }else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()==DeletePersonDetails){
               new DeletePersonDetails(username);
    }
        
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}
