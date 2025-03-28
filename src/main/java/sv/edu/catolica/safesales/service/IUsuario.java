package sv.edu.catolica.safesales.service;

import sv.edu.catolica.safesales.entities.UsuarioEntity;

import java.util.List;

public interface IUsuario {

    List<UsuarioEntity> findAll();

    UsuarioEntity save(UsuarioEntity usuarios);
}
