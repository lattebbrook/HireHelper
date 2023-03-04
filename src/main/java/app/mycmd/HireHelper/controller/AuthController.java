package app.mycmd.HireHelper.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    
    public String login(HttpServletRequest request, @RequestParam String keyapi) {
        
        return "access-denied.html";
    }
            
    
}
