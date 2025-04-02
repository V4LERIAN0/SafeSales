package sv.edu.catolica.safesales.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.TiendaEntity;
import sv.edu.catolica.safesales.repository.TiendaRepository;
import sv.edu.catolica.safesales.service.TiendaService;

import java.util.List;

@Service
public class TiendaImpl implements TiendaService {

    @Autowired
    private TiendaRepository TiendaRepository;

    @Override
    public List<TiendaEntity> findAll() {
        return TiendaRepository.findAll();
    }

    @Override
    public TiendaEntity save(TiendaEntity tiendas) {
        return TiendaRepository.save(tiendas);
    }
}
