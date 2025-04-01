package sv.edu.catolica.safesales.service;

import sv.edu.catolica.safesales.entities.TiendaEntity;

import java.util.List;

public interface TiendaService {

    List<TiendaEntity> findAll();

    TiendaEntity save(TiendaEntity tiendas);
}
