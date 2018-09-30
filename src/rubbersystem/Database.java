/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbersystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

     public  static Connection connectDB(){
     String db_name="rubberdata";
     String user="root";
     String pass="";
     String hostName="localhost";
     String driverName="com.mysql.jdbc.Driver";
     try{
         Class.forName(driverName);
         String url="jdbc:mysql://"+hostName+"/"+db_name;
         Connection con=DriverManager.getConnection(url, user, pass);
        return con;
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
     return null;
    }
    
}
        
    
