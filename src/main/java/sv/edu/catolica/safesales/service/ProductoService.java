package sv.edu.catolica.safesales.service;

import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.ProductoEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductoService {

    public ProductoEntity save( ProductoEntity producto);
    public Optional<ProductoEntity> get(Integer id);
    public void update(ProductoEntity producto);
    public void delete(Integer id);
    public List<ProductoEntity> findAll();
}
