package com.portfolio.juan.bustos.repository;

import com.portfolio.juan.bustos.model.habilidadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juanbe
 */
@Repository
public interface habilidadRepository extends JpaRepository<habilidadModel, Long> {
    
}
