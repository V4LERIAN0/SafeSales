package sv.edu.catolica.safesales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @GetMapping("")
    public String mostrarCarrito() {
        return "carrito/carrito";
    }
}
