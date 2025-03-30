package sv.edu.catolica.safesales.service;

import sv.edu.catolica.safesales.entities.ProductoEntity;

import java.util.List;

public interface IProducto {

    List<ProductoEntity> findAll();

    ProductoEntity save (ProductoEntity productos);
}
