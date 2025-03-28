package sv.edu.catolica.safesales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.entities.UsuarioEntity;
import sv.edu.catolica.safesales.repository.UsuarioRepository;
import sv.edu.catolica.safesales.service.IUsuario;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    IUsuario iUsuario;

    @Transactional(readOnly = true)
    @GetMapping("/usuario")
    public List<UsuarioEntity> findAll() {
        return iUsuario.findAll();
    }

    @PostMapping("/usuario")
    public UsuarioEntity save(@RequestBody UsuarioEntity usuarios) {
        return iUsuario.save(usuarios);
    }
}
