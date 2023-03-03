package app.mycmd.HireHelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HireHelperApp {
    
    public static boolean status = false;
    
    public static void main(String[] args){
        try{ SpringApplication.run(HireHelperApp.class, args); status = true; } catch(Exception e) { status = false; }
    }
    
    
}