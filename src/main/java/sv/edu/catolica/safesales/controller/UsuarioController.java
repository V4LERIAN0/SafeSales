package sv.edu.catolica.safesales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.service.UsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    UsuarioService iUsuario;

//    @Transactional(readOnly = true)
//    @GetMapping("/usuario")
//    public List<UsuarioEntity> findAll() {
//        return iUsuario.findAll();
//    }
//
//    @PostMapping("/usuario")
//    public UsuarioEntity save(@RequestBody UsuarioEntity usuarios) {
//        return iUsuario.save(usuarios);
//    }

    /*@PostMapping("/upload-logo")
    public ResponseEntity<String> uploadLogo(@RequestParam("file") MultipartFile file) {
        // Guardar archivo en el servidor y devolver la ruta como String
    }*/

}
