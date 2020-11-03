package br.com.livrariabichopreguica.bichopreguica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BichoPreguica {

    @GetMapping(value = "home")
    public ModelAndView getHome(){
        ModelAndView index = new ModelAndView("home");
        return index;
    }
    
}
