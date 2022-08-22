package com.portfolio.juan.bustos.repository;

import com.portfolio.juan.bustos.model.perfilModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface perfilRepository extends JpaRepository<perfilModel, Long>{
}
