package sv.edu.catolica.safesales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.safesales.entities.UsuarioEntity;
import sv.edu.catolica.safesales.repository.UsuarioRepository;
import sv.edu.catolica.safesales.service.IUsuario;

import java.util.List;

@Service
public class UsuarioImpl implements IUsuario {
    @Autowired
    private UsuarioRepository UsuarioRepository;

    @Override
    public List<UsuarioEntity> findAll() {
        return UsuarioRepository.findAll();
    }

    @Override
    public UsuarioEntity save(UsuarioEntity usuarios) {
        return UsuarioRepository.save(usuarios);
    }
}
