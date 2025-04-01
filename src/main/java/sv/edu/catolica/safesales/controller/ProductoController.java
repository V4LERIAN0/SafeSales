package sv.edu.catolica.safesales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.entities.ProductoEntity;
import sv.edu.catolica.safesales.repository.ProductoRepository;
import sv.edu.catolica.safesales.service.IProducto;

import java.util.List;

@Controller // Cambio de RestController a Controller porque ya no necesitamos que nos envie puro texto
@RequestMapping("/productos")
public class ProductoController {

   @GetMapping("")
    public String productoHome(){
        return "productos/show";
    }

}



//
//
//
//    @Autowired
//    IProducto iProducto;


//    @Transactional(readOnly = true) Eliminado porque ya no queremos que devuelva solamente texto
//    @GetMapping("/producto")
//    public List<ProductoEntity> listarProductos(){
//        return iProducto.findAll();
//    }
//
//    @PostMapping("/producto")
//    public ProductoEntity saveProducto(@RequestBody ProductoEntity productos){
//        return iProducto.save(productos);
//    }
//}
