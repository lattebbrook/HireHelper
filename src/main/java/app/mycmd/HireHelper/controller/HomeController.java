package app.mycmd.HireHelper.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/" , "index", "index.html", "home", "main"})
    public String redirectHome(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("SessionToken") != null) {
            return "index.html";
        }
        return "login.html";
    }
    
}

//to write auth.