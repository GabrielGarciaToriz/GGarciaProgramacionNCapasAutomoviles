package com.digis01.GGarciaProgramacionNCapasAutomoviles.Controller;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO.AgenciaDAOImplementation;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO.AutomovilDAOImplementation;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class AutomovilController {

    @Autowired
    private AutomovilDAOImplementation AutomovilDAOImplementation;
    @Autowired
    private AgenciaDAOImplementation AgenciaDAOImplementation;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("automoviles", AutomovilDAOImplementation.AutomovilGetAll().objects);
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("automovil", new Automovil());
        model.addAttribute("automovils", AutomovilDAOImplementation.AutomovilGetAll().objects);
        model.addAttribute("agencias", AgenciaDAOImplementation.AgenciaGetAll().objects);
        return "form";
    }
}
