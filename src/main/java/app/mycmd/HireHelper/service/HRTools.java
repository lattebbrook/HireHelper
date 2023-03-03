package app.mycmd.HireHelper.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HRTools {
    
    @RequestMapping("/test") @ResponseBody
    public int show(){
        return 555;
    }
}