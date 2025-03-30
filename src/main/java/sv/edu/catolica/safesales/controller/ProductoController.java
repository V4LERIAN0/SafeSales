package sv.edu.catolica.safesales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.safesales.entities.ProductoEntity;
import sv.edu.catolica.safesales.repository.ProductoRepository;
import sv.edu.catolica.safesales.service.IProducto;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductoController {

    @Autowired
    IProducto iProducto;

    @Transactional(readOnly = true)
    @GetMapping("/producto")
    public List<ProductoEntity> listarProductos(){
        return iProducto.findAll();
    }

    @PostMapping("/producto")
    public ProductoEntity saveProducto(@RequestBody ProductoEntity productos){
        return iProducto.save(productos);
    }
}
