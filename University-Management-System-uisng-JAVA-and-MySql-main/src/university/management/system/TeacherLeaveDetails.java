
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class TeacherLeaveDetails extends JFrame  implements ActionListener {
    
    Choice cEmp_Id;
    JTable table;
    JButton search,print,update,add,cancel;
    
    
    TeacherLeaveDetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ///Search by Emp_Id.
        JLabel heading = new JLabel("Search by Employee ID ");
        heading.setBounds(20,20,150,30);
        add(heading);
        
        cEmp_Id = new Choice();
        cEmp_Id.setBounds(180,25 ,150,30);
        add(cEmp_Id);
        
        try{
            //connecting to the database 
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                cEmp_Id.add(rs.getString("emp_id"));
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }
        
        ///Table 
        table = new JTable();
        try{
            //connecting to the database 
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacherleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            }catch(Exception e){
                e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        //Search button
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        //print button
        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
       
      
        
        //cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(220,70,80,20);
        cancel.addActionListener(this);
        add(cancel);
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == search){
            String query = "select * from teacherleave where empid = '"+cEmp_Id.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == print){
            
            try{
                table.print();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String[] args){
        
        new TeacherLeaveDetails();
        
        
    }
    
}
