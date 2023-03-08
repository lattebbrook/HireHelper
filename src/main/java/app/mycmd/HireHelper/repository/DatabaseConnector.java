package app.mycmd.HireHelper.repository;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseConnector {

    private String dbname;
    private String username;
    private String password;
    
    public void setdbname(String value){
        this.dbname = value;
    }
    
    public void setUsername(String value){
        this.username = value;
    }
    
    public void setPassword(String value){
        this.password = value;
    }

    public String getdbname(){
        return this.dbname;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    } 
    
}