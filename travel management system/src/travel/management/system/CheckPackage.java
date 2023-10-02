package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{

    CheckPackage(){
        setBounds(450,200,900,600);
        
        
        String[] package1={"Gold Package",                                      //0      
                           "5 Days 5 Nights",                                      //1                                      
                           "Airport Assistance",                                      //2
                           "Daily Buffet","Full Day 3 island tour",                   //3
                           "Professional English Speaking Guide",                      //4
                           "BOOK PACKAGE",                                             //5
                           "Summer Speacial",                                           //6
                           "Speacial Welcome",                                          //7
                           "Speacial Parties",                                          //8
                           "Rs. 24,000/",
                           "package1.jpg"};                                       //11
        
        
        String[] package2={"Silver Package",                                                //0
                           "3 Days 2 Nights",                                               //1
                           "Toll Free and Entrance Free Tickets",                              //2
                           "Meet and Greet at Airport",                                      //3
                           "Night Safari",                                                   //4
                           "Cruise with Dinner",                                                //5
                           "Less Stress",                                                       //6
                           "Additional service",                                                //7
                           "Winter Speacial",       //8
                           "BOOK NOW",              //9
                           "Rs. 12,000/",           //10
                           "package2.jpg"};
                           //"package2.jpg"};       //11
        
        
        String[] package3={"Bronze Package",        //0
                            "2 Days 1 Nights",      //1
                            "Free Foods",           //2
                            "Full day tour",        //3
                            "Horse Riding",         //4
                            "BBQ Dinner",           //5
                            "AC Services",          //6
                            "BOOK NOW",             //7
                            "Weekend Speacial",     //8
                            "Additional service charge",    //9
                            "Rs. 5000/",                    //10
                            "package3.jpg"};
                            
        
        JTabbedPane tab=new JTabbedPane();
        
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1);
        
        
        JPanel p2=createPackage(package2);
        tab.addTab("Package 2",null,p2);
        
        JPanel p3=createPackage(package3);
        tab.addTab("Package 3", null,p3);
        
        
        add(tab);
        setVisible(true);
    }
    
    public JPanel createPackage(String [] pack){
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,10,300,30);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);
        
        
        JLabel l3=new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);
                
        JLabel l5=new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(30,310,300,30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(30,360,300,30);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[8]);
        l9.setBounds(60,430,300,30);
        l9.setForeground(Color.black);
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[9]);
        l10.setBounds(80,480,300,30);
        l10.setForeground(Color.magenta);
        l10.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l10);
        
        JLabel lprice=new JLabel(pack[10]);
        lprice.setBounds(500,480,300,30);
        lprice.setForeground(Color.cyan);
        lprice.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(lprice);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel limage=new JLabel(i3);
        limage.setBounds(350,20,500,300);
        p1.add(limage);
        
        return p1;
        
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
    
}
