package service;


import app.mycmd.HireHelper.service.HRTools;

public class HRToolsTest {
    
    public void test001(){
        HRTools hr = new HRTools();
        int result = hr.show();
        assert result == 555;
    }
}