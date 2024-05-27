/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samples;
import java.sql.*;

/**
 *
 * @author Pangatlong Anak
 */
public class DBConnection {
        static final String dbURL = "jdbc:mysql://localhost:3306/user_acc";

        static final String hostUsername = "root";
        static final String hostPassword = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, hostUsername, hostPassword);
            return conn;
            
        }catch(Exception e){
            System.out.println("May error talaga");
            return null;
        }
    }
}
