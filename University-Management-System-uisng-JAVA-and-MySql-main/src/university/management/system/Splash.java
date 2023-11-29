
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;  //declaring thread class
    
    Splash(){
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/DYPIU.jpg"));
        JLabel image = new JLabel(il);
        add(image);
        t = new Thread(this);
        t.start();
        setLocation(250,100); //x and y axis
        setSize(1024,576); //width and height
        setVisible(true);
        
        try{
            Thread.sleep(8000);
            
        }catch(Exception c){}
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();    
        }catch(Exception e){
            
        }
        
    }
    public static void main(String[] args){
        new Splash();
        
    }
    
}
