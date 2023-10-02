package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paytm extends JFrame implements ActionListener{
   JButton back ;
    paytm(){
        setBounds(500,200,800,600);
        
        JEditorPane pane=new JEditorPane();
        pane.setEditable(false);
        try{
            pane.setPage("https://paytm.com/rent-payment");
        }
        catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could Not Load, Error 404 </html>");
            
        }
        
        back=new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        JScrollPane sp=new JScrollPane(pane);
        getContentPane().add(sp);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new payment();
    }
    
    public static void main(String[] args) {
        new paytm();
    }
}
