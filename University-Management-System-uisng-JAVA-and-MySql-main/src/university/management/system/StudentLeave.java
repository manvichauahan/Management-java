
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;

public class StudentLeave extends JFrame implements ActionListener {
    
    Choice crollno,ctime;
    JDateChooser dcdate;
    JButton submit,cancal;
    
    
    StudentLeave(){
        setSize(500,500);
        setLocation(600,100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel Heading = new JLabel("Apply Leave (Student)");
        Heading.setBounds(20,30,500,20);
        Heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(Heading);
        
        ///Search by rollno.
        JLabel lblrollno = new JLabel("Search by Roll Number");
        lblrollno.setBounds(60,100,200,20);
        lblrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblrollno);
        
        crollno = new Choice();
        crollno.setBounds(60, 130, 200, 20);
        add(crollno);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Date
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60,180,200,20);
        lbldate.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbldate);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(60 ,210,200,25);
        add(dcdate);
        
        ///Time Duration
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60,260,200,20);
        lbltime.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbltime);
        
        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);
        
        //buttons
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("serif",Font.BOLD,18));   
        submit.setBounds(60 , 350 , 100 , 25 );
        submit.addActionListener(this);
        add(submit);
        
        cancal = new JButton("Cancal");
        cancal.setBounds(200, 350 , 100 , 25 );
        cancal.setBackground(Color.BLACK);
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("serif",Font.BOLD,18)); 
        cancal.addActionListener(this);
        add(cancal);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == submit){
            String rollno = crollno.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration = ctime.getSelectedItem();
            
            String query = "insert into studentleave values('"+rollno+"','"+date+"','"+duration+"')";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Leave Confirmed");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else {
            setVisible(false);
            
        }
        
    }
    public static void main(String[] args){
        
        new StudentLeave();
    }
    
}
