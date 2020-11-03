package br.com.livrariabichopreguica.bichopreguica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BichoPreguicaContatos {
    @GetMapping(value = "contato")
    public ModelAndView getHome(){
        ModelAndView index = new ModelAndView("contato");
        return index;
    }
}
