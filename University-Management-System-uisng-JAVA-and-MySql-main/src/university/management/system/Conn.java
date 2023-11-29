
package university.management.system;
import java.sql.*;

public class Conn {
    Connection c ;
    Statement s;
    Conn(){
        try{
            //Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating the Connection String
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/unviversitymanagementsystem","root","avishkar30"); //If you are using different port then ues Localhost.
            //Creating the statement
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        
        }
        
    }
    
    public static void main(String[] args){
        new Conn();
    }
}
