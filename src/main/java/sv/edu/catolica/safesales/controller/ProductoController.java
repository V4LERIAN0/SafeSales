package sv.edu.catolica.safesales.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.entities.ProductoEntity;
import sv.edu.catolica.safesales.entities.UsuarioEntity;
import sv.edu.catolica.safesales.service.ProductoService;

@Controller // Cambio de RestController a Controller porque ya no necesitamos que nos envie puro texto
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService ProductoService;

   @GetMapping("/show")
    public String productoshow(Model model){
       model.addAttribute("productos", ProductoService.findAll());
        return "productos/show";
    }

    @GetMapping("/list")
    public String productoList(){
       return "productos/list";
    }

    @GetMapping("/create")
    public String productocreate(){
       return "productos/create";
    }

    @PostMapping("/save")
    public String saveproducto(ProductoEntity producto){

        UsuarioEntity u = new UsuarioEntity(1, "", "", "", "", "", "", "");
        //Este solo es una instancia de prueba, para poder guardar productos ya que tenemos una relacion y daria error guardar un producto sin la relacion
        producto.setUsuario(u);

       ProductoService.save(producto);
       return "redirect:/productos/create";
    }

    @GetMapping("/edit")
    public String productoEdit(@RequestParam int id){
       return "productos/edit";
    }
}

