package sv.edu.catolica.safesales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.service.TiendaService;

@Controller
@RequestMapping("/")
public class TiendaController {

    @Autowired
    TiendaService iTienda;

//    @Transactional(readOnly = true)
//    @GetMapping("/tienda")
//    public List<TiendaEntity> findAll() {
//        return iTienda.findAll();
//    }
//
//    @PostMapping("/tienda")
//    public TiendaEntity save(@RequestBody TiendaEntity productos) {
//        return iTienda.save(productos);
//    }

}
