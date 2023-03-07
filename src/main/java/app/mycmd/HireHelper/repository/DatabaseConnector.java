package app.mycmd.HireHelper.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {
    
    //will change to spring boot jdbc.
    String url = "jdbc:mysql://127.0.0.1/+#+#+#";
    
    public boolean isConnect(){
        try{
            Connection cn = DriverManager.getConnection(url); 
        }catch(SQLException se) { 
            
        }
        return false;
    }
}