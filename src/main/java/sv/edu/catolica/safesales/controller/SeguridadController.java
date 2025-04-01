package sv.edu.catolica.safesales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguridad")
 class SeguridadController {

    @GetMapping("/login")
    public String login(){

        return "seguridad/login";
    }

}
