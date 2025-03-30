package sv.edu.catolica.safesales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.ProductoEntity;
import sv.edu.catolica.safesales.repository.ProductoRepository;
import sv.edu.catolica.safesales.service.IProducto;

import java.util.List;

@Service
public class ProductoImpl implements IProducto {
    @Autowired
    private ProductoRepository ProductoRepository;

    @Override
    public List<ProductoEntity> findAll(){
        return ProductoRepository.findAll();
    }

    @Override
    public ProductoEntity save(ProductoEntity productos) {
        return ProductoRepository.save(productos);
    }
}
