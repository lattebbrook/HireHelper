package app.mycmd.HireHelper.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HRTools {
    @RequestMapping("/test")
    int show(){
        return 555;
    }
}