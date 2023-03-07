package app.mycmd.HireHelper.controller;

import org.springframework.stereotype.Controller;

@Controller
public record AuthController(String keyapi) { 
    
    public String getAPI(){
        return "";
    } 

}
