package app.mycmd.HireHelper.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.RequestMapping;

public class DatabaseConnector {
    
    //will change to spring boot jdbc.
    private String url = "jdbc:mysql://127.0.0.1/hirehelper?user=hirehelper&password=13869";
    
    @RequestMapping("/check-db-status")
    public String ConnectionStatus(){
        try{
            Connection cn = DriverManager.getConnection(url); 
            return "Connection status = active";
        }catch(SQLException se) { 
            return "ERROR: There is an error connecting to the database.";
        }
    }
    
    public String getStringURL(){
        return this.url;
    }
}