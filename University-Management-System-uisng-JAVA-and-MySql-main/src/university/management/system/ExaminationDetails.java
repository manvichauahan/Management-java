
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class ExaminationDetails extends JFrame implements ActionListener{
    
    JTextField search;
    JButton Submit, cancel;
    JTable table;
    
    
    ExaminationDetails(){
        
        setSize(1000, 475);
        setLocation(300, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Check Result");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 35));
        add(heading);
        
        //
        search = new JTextField();
        search.setBounds(50 , 90 , 230 , 30);
        search.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(search);
        
        //submit buttons
        Submit = new JButton("Result");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("serif",Font.BOLD,18));   
        Submit.setBounds(300 , 90 , 120 , 30 );
        Submit.addActionListener(this);
        add(Submit);
        
        //cancel button
        cancel = new JButton("Back");
        cancel.setBounds(440, 90 , 120 , 30 );
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("serif",Font.BOLD,18)); 
        cancel.addActionListener(this);
        add(cancel);
        
        //Table Display
        table = new JTable();
        table.setFont(new Font("Tahoma",Font.PLAIN,16)); 
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 130, 1000, 475);
        add(jsp);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));   
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //Adding mouse Listener
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());
            }
            
        });
        
         
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== Submit){
            setVisible(false);
            new Marks(search.getText());
            
        }else{
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new ExaminationDetails();
    }
}
