
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE); ///white color  are added to the content pane layer of the container.
        setLayout(null);
        
        l1 = new JLabel("Username");
        l1.setBounds(40 , 20 , 100 , 30 ); // x and y axis ,width and height
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40 , 70 , 100 , 30 );
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150 , 20 , 150 , 30);
        add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(150 , 70 , 150 , 30);
        add(t2);
        
        b1 = new JButton("Login");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("serif",Font.BOLD,18));   
        b1.setBounds(40 , 150 , 120 , 30 );
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Sigup");
        b2.setBounds(180 , 150 , 120 , 30 );
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("serif",Font.BOLD,18)); 
        b2.addActionListener(this);
        add(b2);
        
       // b3 = new JButton("Cancle");
        //b3.setBounds(190 , 150 , 120 , 30 );
        //b3.setBackground(Color.RED);
        //b3.setForeground(Color.WHITE);
        //b3.setFont(new Font("serif",Font.BOLD,18)); 
        //b2.addActionListener(this);
        //add(b2);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/loginicon.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(350,0,200,200);
        add(image);
        
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            String password = t2.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            //Eexecute the MySql query
            try{
                Conn c = new Conn();
                ResultSet rs =   c.s.executeQuery(query); //For DDL query 
                
                if(rs.next()){
                    setVisible(false);
                    new Dashboard();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                    setVisible(false);
                    }
                c.s.close(); // connection will close
            }catch(Exception e){
                e.printStackTrace();
            
            }
            
        }else if(ae.getSource()==b2){
            setVisible(false); 
            new NewLogin();
            
        }
    }
    
    
    
    
    
    public static void main(String[] args){
        new Login(); 
    }
    
}
