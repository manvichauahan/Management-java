package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class About extends JFrame {
    
    
    About(){
        
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Adding Heading
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70,20,500,130);
        heading.setFont(new Font("Tohoma",Font.BOLD,30));
        add(heading);
        
        //Adding 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg  "));
        Image i2 = i1.getImage().getScaledInstance(350 , 200 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400, 0, 300, 200);
        add(l1);
        
        //Adding Developer name
        JLabel name = new JLabel("Developed By: Avishkar Auti");
        name.setBounds(70,220,550,40);
        name.setFont(new Font("Tohoma",Font.BOLD,30));
        add(name);
        
        //Adding rollno
        JLabel prnno = new JLabel("PRN NO : 20210812035 ");
        prnno.setBounds(70,280,550,40);
        prnno.setFont(new Font("Tohoma",Font.PLAIN,30));
        add(prnno);
        
        //Adding contact 
        JLabel contact = new JLabel("Follow me on Linkedln : avishkar.auti ");
        contact.setBounds(70,340,550,40);
        contact.setFont(new Font("Tohoma",Font.PLAIN,20));
        add(contact);
        
        
        
        setVisible(true);
        
        
    }
    
    
    public static void main(String[] args){
        
        new About();
    }
    
}
