package sv.edu.catolica.safesales.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.ProductoEntity;
import sv.edu.catolica.safesales.repository.ProductoRepository;
import sv.edu.catolica.safesales.service.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoImpl implements ProductoService {

    @Autowired
    private ProductoRepository ProductoRepository;

    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return ProductoRepository.save(producto);
    }
    @Override
    public Optional<ProductoEntity> get(Integer id) {
        return ProductoRepository.findById(id);
    }
    @Override
    public void update(ProductoEntity producto) {
        ProductoRepository.save(producto);

    }
    @Override
    public void delete(Integer id) {
        ProductoRepository.deleteById(id);
    }
    @Override
    public List<ProductoEntity> findAll() {
        return ProductoRepository.findAll();
    }
}
