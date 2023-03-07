package app.mycmd.HireHelper.controller;

import app.mycmd.HireHelper.repository.DatabaseConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController { 
    
    DatabaseConnector dbc = new DatabaseConnector();
    
    private String key;
    
    public String getKey(){
        try{
            Connection cn = DriverManager.getConnection(dbc.getStringURL());
            String query = "select * from apikey";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String find = rs.getString("key");
                this.key = find;
            }
        } catch(SQLException se) {
            System.err.println(se);
        }
        return this.key;
    } 

}
