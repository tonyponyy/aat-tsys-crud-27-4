package com.crud264.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud264.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}