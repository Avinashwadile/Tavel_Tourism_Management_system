
package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class signup extends JFrame implements ActionListener{
    JButton create,Back;
    JTextField t_uname,t_name,tfpassword,tfanswer;
    Choice security;
    
    
    signup(){
            setBounds(350,250,900,360);
            getContentPane().setBackground(Color.white);
            setLayout(null);
            
            JPanel p1=new JPanel();
            p1.setBackground(new Color(133,193,233));
            p1.setBounds(0,0,500,400);
            p1.setLayout(null);
            add(p1);
            
            JLabel uname=new JLabel("User Name");
            uname.setFont(new Font("Tahoma",Font.BOLD,14));
            uname.setBounds(50,20,125,25);
            p1.add(uname);
            
            t_uname=new JTextField();
            t_uname.setBounds(190,20,180,25);
            t_uname.setBorder(BorderFactory.createEmptyBorder());
            p1.add(t_uname);
            
            
            JLabel name=new JLabel("Name");
            name.setFont(new Font("Tahoma",Font.BOLD,14));
            name.setBounds(50,60,125,25);
            p1.add(name);
            
            t_name=new JTextField();
            t_name.setBounds(190,60,100,25);
            t_name.setBorder(BorderFactory.createEmptyBorder());
            p1.add(t_name);
            
            
            JLabel lblpassword=new JLabel("Password");
            lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
            lblpassword.setBounds(50,100,125,25);
            p1.add(lblpassword);
            
            tfpassword=new JTextField();
            tfpassword.setBounds(190,100,180,25);
            tfpassword.setBorder(BorderFactory.createEmptyBorder());
            p1.add(tfpassword);
            
            
            JLabel lblsequirity=new JLabel("Secuirity Question");
            lblsequirity.setFont(new Font("Tahoma",Font.BOLD,14));
            lblsequirity.setBounds(50,140,125,25);
            p1.add(lblsequirity);
            
            security=new Choice();
            security.add("Mother Toungh");
            security.add("Fav Movie");
            security.add("Birth Place");
            security.add("Fav Teacher");
            security.setBounds(190,140,180,25);
            p1.add(security);
            
            
            JLabel lblanswer=new JLabel("Answer");
            lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
            lblanswer.setBounds(50,180,125,25);
            p1.add(lblanswer);
            
            tfanswer=new JTextField();
            tfanswer.setBounds(190,180,180,25);
            tfanswer.setBorder(BorderFactory.createEmptyBorder());
            p1.add(tfanswer);
            
            create=new JButton("Create");
            create.setForeground(new Color(133,193,233));
            create.setBackground(Color.white);
            create.setFont(new Font("Tahoma",Font.BOLD,14));
            create.setBounds(80,250,100,30);
            create.addActionListener(this);
            p1.add(create);
            
            Back=new JButton("Back");
            Back.setForeground(new Color(133,193,233));
            Back.setBackground(Color.white);
            Back.setFont(new Font("Tahoma",Font.BOLD,14));
            Back.setBounds(250,250,100,30);
            Back.addActionListener(this);
            p1.add(Back);
            
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
            Image i2=i1.getImage().getScaledInstance(250,250 ,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(580,50,250,250);
            add(image);
              
            
            setVisible(true);
        }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==create){
         
            String username=t_uname.getText();
            String name=t_name.getText();
            String password=tfpassword.getText();
            String question=security.getSelectedItem();
            String answer=tfanswer.getText();
            
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()==Back){
            setVisible(false);
            new Login();
        }
        
    }
        
    public static void main(String[] args) {
        new signup();
    }
    
}
