package app.mycmd.HireHelper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }  
    
    /*
    @GetMapping(value = {"/" , "index", "index.html", "home", "main"})
    public String redirectHome(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("SessionToken") != null) {
            return "index.html";
        }
        return "login.html";
    } */
    
}

//to write auth.