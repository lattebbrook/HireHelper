package app.mycmd.HireHelper.controller;

import app.mycmd.HireHelper.repository.DatabaseConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController { 
    
    private String key;
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    DatabaseConnector config = context.getBean("config", DatabaseConnector.class);
    String connectionString = "jdbc:mysql://127.0.0.1/" + config.getdbname() + "?user=" + config.getUsername() + "&password=" + config.getPassword();
    
    @RequestMapping("/check-db-status")
    public boolean checkConnection() {
	try {
		Connection cn;
		cn = DriverManager.getConnection(connectionString);	
		cn.close();
		return true;
	} catch (Exception e) {
		System.err.println(e);
		return false;
            }
	}
   @GetMapping("/api/key")
    public String getKey(){
        
        try{
            Connection cn = DriverManager.getConnection(connectionString);
            String query = "select * from api;";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String find = rs.getString("apikey");
                this.key = find;
            }
        } catch(SQLException se) {
            System.err.println(se);
        }
        return this.key;
    } 

}
