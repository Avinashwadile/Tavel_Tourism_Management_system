
package travel.management.system;
import javax.swing.*;
import java.util.*;
import java.awt.*;


public class Destination extends JFrame implements Runnable{
    
    Thread t1;
   
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    
    public void run(){
        
        String[]text=new String[]{"Nihongo No Hoteru","John & Mohn Hotel","Happy in Resort","Madarin Oriental Hotel","Dubai public Resort","Tokyo plaza&motel","Famous Stayers","The Couples Hotel","Momentum resort & Hall","Happy to Stay Hotel"};
        
        try{
            for(int i=0;i<9;i++){
                label[i].setVisible(true);
                
                Thread.sleep(2500);
                label[i].setVisible(false);
                if(i==8){
                    label[i].setVisible(true);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    Destination(){
         setBounds(500,200,800,600);
        
         
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;  
        ImageIcon [] image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;  
        Image [] jimage=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
        ImageIcon ii1=null,ii2=null,ii3=null,ii4=null,ii5=null,ii6=null,ii7=null,ii8=null,ii9=null,ii10=null;  
        ImageIcon [] kimage=new ImageIcon[]{ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii10};
        
        
        for(int i=0;i<9;i++)
        {
            image[i]=new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
            jimage[i]=image[i].getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
            kimage[i]=new ImageIcon(jimage[i]);
            label[i]=new JLabel(kimage[i]);
            label[i].setBounds(0,0,800,600);
            add(label[i]);
        }
        
        t1=new Thread(this);
        t1.start();
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        new Destination();
    }
    
    
}
