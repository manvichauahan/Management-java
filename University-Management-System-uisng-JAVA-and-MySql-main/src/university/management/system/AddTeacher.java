
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tftp,tftaadhar,lblbranch; 
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch; 
    JButton submit,cancal;
    
    Random ran = new Random();
    Long first4 = Math.abs((ran.nextLong()%9000L)+1000L);
    
    AddTeacher(){
        
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310 , 30 , 500 , 30 );
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        /// Teacher Details
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50 , 150 , 100 , 30 );
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200 , 150 , 150 , 30);
        add(tfname);
        
        //Father's Details
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400 , 150 , 200 , 30 );
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600 , 150 , 150 , 30);
        add(tffname);
        
        //Employee Details
        JLabel lblempId = new JLabel("Employee Id");
        lblempId.setBounds(50 , 200 , 200 , 30 );
        lblempId.setFont(new Font("serif",Font.BOLD,20));
        add(lblempId);
        
        labelempId = new JLabel("2023"+first4);
        labelempId.setBounds(200 , 200 , 200 , 30 );
        labelempId.setFont(new Font("serif",Font.BOLD,20));
        add(labelempId);
        
        // DOB
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400 , 200 , 200 , 30 );
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        
        /// Address Details
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50 , 250 , 200 , 30 );
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200 , 250 , 150 , 30);
        add(tfaddress);
        
        //Phone Details
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400 , 250 , 200 , 30 );
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600 , 250 , 150 , 30);
        add(tfphone);
        
        /// E-mail Details
        JLabel lblemail = new JLabel("Email id ");
        lblemail.setBounds(50 , 300 , 300 , 30 );
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200 , 300 , 150 , 30);
        add(tfemail);
        
        //10th percentages Details
        JLabel lblx = new JLabel("Class X %");
        lblx.setBounds(400 , 300 , 200 , 30 );
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600 , 300 , 150 , 30);
        add(tfx);
        
        //12 or diploma percentages Details
        JLabel lbltp = new JLabel("12 or diploma %");
        lbltp.setBounds(50 , 350 , 200 , 30 );
        lbltp.setFont(new Font("serif",Font.BOLD,20));
        add(lbltp);
        
        tftp = new JTextField();
        tftp.setBounds(200 , 350 , 150 , 30);
        add(tftp);
        
        //Aadhar Details
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400 , 350 , 200 , 30 );
        lblaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lblaadhar);
        
        tftaadhar = new JTextField();
        tftaadhar.setBounds(600 , 350 , 150 , 30);
        add(tftaadhar);
        
        //Eduction/Qualification Details
        JLabel lblCourse = new JLabel("Qualification");
        lblCourse.setBounds(50 , 400 , 200 , 30 );
        lblCourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblCourse);
        
        String course[] ={"B.Tech","B.E","BCA","BBA","Bsc","Msc","MBA","MCom","BCom","BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        //Department Details
        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400 , 400 , 200 , 30 );
        lblbranch.setFont(new Font("serif",Font.BOLD,20));
        add(lblbranch);
        
        String branch[] ={"Computer Science","Data science","AI & ML","Cyber Security","Cloud Computing"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        //buttons
        submit = new JButton("Submit");
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("serif",Font.BOLD,18));   
        submit.setBounds(250 , 550 , 120 , 30 );
        submit.addActionListener(this);
        add(submit);
        
        cancal = new JButton("Cancal");
        cancal.setBounds(450, 550 , 120 , 30 );
        cancal.setBackground(Color.RED);
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("serif",Font.BOLD,18)); 
        cancal.addActionListener(this);
        add(cancal);
        
        setVisible(true);
        
        }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name = tfname.getText();
            String fname = tfname.getText();
            String rollno = labelempId.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String tp = tftp.getText();
            String aadhar = tftaadhar.getText();
            String course = (String) cbcourse.getSelectedItem(); //Tpyecasting into String 
            String branch = (String) cbbranch.getSelectedItem();
            
            try{
                
                String query = "insert into teacher values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+tp+"', '"+aadhar+"', '"+course+"', '"+branch+"')";
                
                //connection with datadase
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            
            }
            
        }else{
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new AddTeacher();
        
    }
    
}
