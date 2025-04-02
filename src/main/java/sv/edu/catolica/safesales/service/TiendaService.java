package sv.edu.catolica.safesales.service;

import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.TiendaEntity;

import java.util.List;

@Service
public interface TiendaService {

    List<TiendaEntity> findAll();

    TiendaEntity save(TiendaEntity tiendas);
}
