package com.portfolio.juan.bustos.repository;


import com.portfolio.juan.bustos.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface loginRepository extends JpaRepository<usuarioModel, Long>
{
     Optional<usuarioModel> findByEmail(String email);

}
