
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
   JButton back; 
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        setBackground(Color.white);
        
        JLabel l1=new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahome",Font.PLAIN,20));
        add(l1);
        
        
        String s="About Project \n";
        
        
        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        add(area);
        
        back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
    
}
