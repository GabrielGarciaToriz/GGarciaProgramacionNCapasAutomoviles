package com.digis01.GGarciaProgramacionNCapasAutomoviles.Controller;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO.AutomovilDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class AutomovilController {
 
    
    @GetMapping
    public String index(){
        return "index";
    }
}
