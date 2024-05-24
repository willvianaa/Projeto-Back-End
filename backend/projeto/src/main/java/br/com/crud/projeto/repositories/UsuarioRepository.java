package br.com.crud.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.projeto.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
} 