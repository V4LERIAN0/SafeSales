package sv.edu.catolica.safesales.service;

import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.UsuarioEntity;

import java.util.List;

@Service
public interface UsuarioService {

    List<UsuarioEntity> findAll();

    UsuarioEntity save(UsuarioEntity usuarios);
}
