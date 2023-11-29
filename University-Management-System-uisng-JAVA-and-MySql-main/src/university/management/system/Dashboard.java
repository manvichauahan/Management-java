package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    JMenuBar mb;
    JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18;
    
    Dashboard(){
        
        //Information
        mb = new JMenuBar();
        m1 = new JMenu("New Information");
        m1.setForeground(Color.RED);
        mb.add(m1);
        
        i1 = new JMenuItem("New Faculty Information");
        i1.setBackground(Color.WHITE); 
        i1.addActionListener(this);
        m1.add(i1);
        setJMenuBar(mb);
        
        i2 = new JMenuItem("New Student Information");
        i2.setBackground(Color.WHITE); 
        i2.addActionListener(this);
        m1.add(i2);
        setJMenuBar(mb);
        
        //Details
        m2 = new JMenu("View Details");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        
        i3 = new JMenuItem("View Faculty details");
        i3.setBackground(Color.WHITE); 
        i3.addActionListener(this);
        m2.add(i3);
        setJMenuBar(mb);
        
        i4 = new JMenuItem("View Student details");
        i4.setBackground(Color.WHITE); 
        i4.addActionListener(this);
        m2.add(i4);
        setJMenuBar(mb);
        
        //Leave
        m3 = new JMenu("Apply Leave");
        m3.setForeground(Color.RED);
        mb.add(m3);
        
        i5 = new JMenuItem("Faculty Leave");
        i5.setBackground(Color.WHITE); 
        i5.addActionListener(this);
        m3.add(i5);
        setJMenuBar(mb);
        
        i6 = new JMenuItem("Student Leave");
        i6.setBackground(Color.WHITE); 
        i6.addActionListener(this);
        m3.add(i6);
        setJMenuBar(mb);
        
        //Leave Details
        m4 = new JMenu("Leave Details");
        m4.setForeground(Color.BLUE);
        mb.add(m4);
        
        i7 = new JMenuItem("Faculty Leave Details");
        i7.setBackground(Color.WHITE); 
        i7.addActionListener(this);
        m4.add(i7);
        setJMenuBar(mb);
        
        i8 = new JMenuItem("Student Leave Details");
        i8.setBackground(Color.WHITE); 
        i8.addActionListener(this);
        m4.add(i8);
        setJMenuBar(mb);
        
        //Exams Details
        m5 = new JMenu("Examination ");
        m5.setForeground(Color.RED);
        mb.add(m5);
        
        i9 = new JMenuItem("Examination result");
        i9.setBackground(Color.WHITE); 
        i9.addActionListener(this);
        m5.add(i9);
        setJMenuBar(mb);
        
        i10 = new JMenuItem("Enter marks");
        i10.setBackground(Color.WHITE);
        i10.addActionListener(this);
        m5.add(i10);
        setJMenuBar(mb);
        
        //Update information
        m6 = new JMenu("Update Info");
        m6.setForeground(Color.BLUE);
        mb.add(m6);
        
        i11 = new JMenuItem("Update Faculty info");
        i11.setBackground(Color.WHITE); 
        i11.addActionListener(this);
        m6.add(i11);
        setJMenuBar(mb);
        
        i12 = new JMenuItem("Update Student info");
        i12.setBackground(Color.WHITE); 
        i12.addActionListener(this);
        m6.add(i12);
        setJMenuBar(mb);
        
        //Fee information
        m7 = new JMenu("Fee Details");
        m7.setForeground(Color.RED);
        mb.add(m7);
        
        i13 = new JMenuItem("Fee Structure");
        i13.setBackground(Color.WHITE); 
        i13.addActionListener(this);
        m7.add(i13);
        setJMenuBar(mb);
        
        i14 = new JMenuItem("Student Fee Form");
        i14.setBackground(Color.WHITE); 
        i14.addActionListener(this);
        m7.add(i14);
        setJMenuBar(mb);
        
        //Utility
        m8 = new JMenu("Utility");
        m8.setForeground(Color.BLUE);
        mb.add(m8);
        
        i15 = new JMenuItem("Notepad");
        i15.setBackground(Color.WHITE); 
        i15.addActionListener(this);
        m8.add(i15);
        setJMenuBar(mb);
        
        i16 = new JMenuItem("Calculator");
        i16.setBackground(Color.WHITE); 
        i16.addActionListener(this);
        m8.add(i16);
        setJMenuBar(mb);
        
        //about
        m10 = new JMenu("About");
        m10.setForeground(Color.RED);
        mb.add(m10);
        
        i18 = new JMenuItem("About");
        i18.setBackground(Color.WHITE); 
        i18.addActionListener(this);
        m10.add(i18);
        setJMenuBar(mb);
        
        //Exit
        m9 = new JMenu("Exit");
        m9.setForeground(Color.BLUE);
        mb.add(m9);
        
        i17 = new JMenuItem("Exit");
        i17.setBackground(Color.WHITE); 
        i17.addActionListener(this);
        m9.add(i17);
        setJMenuBar(mb);
                
        setSize(1920,1080);
        getContentPane ().setBackground (Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/DYPIU.jpg   "));
        Image i2 = i1.getImage().getScaledInstance(1950 , 1000 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);
        add(l1);
        
        setVisible(true);
                
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if( msg.equals("Exit")){
            setVisible(false);
            
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
            
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
            
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }else if(msg.endsWith("New Student Information")){
            new AddStudent();
        }else if(msg.equals("View Faculty details")){
            new TeacherDetails();
        }else if(msg.endsWith("View Student details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new StudentLeave();
        }else if(msg.endsWith("Student Leave")){
            new TeacherLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }else if(msg.endsWith("Student Leave Details")){
            new StudentLeaveDetails();
        }else if(msg.endsWith("Update Faculty info")){
            new UpdateTeacher();
        }else if(msg.endsWith("Update Student info")){
            new UpdateStudent();
        }else if(msg.endsWith("Enter marks")){
            new EnterMarks();
        }else if(msg.endsWith("Examination result")){
            new ExaminationDetails();
        }else if(msg.endsWith("Fee Structure")){
            new FeeStructure();
        }else if(msg.endsWith("About")){
            new About();
        }
    
    
    
    }
    
    
    public static void main(String[] args){
        new Dashboard();
    }
}
