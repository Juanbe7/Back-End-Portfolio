package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.habilidadModel;
import com.portfolio.juan.bustos.repository.habilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juanbe
 */
@Service
public class habilidadService implements IHabilidadService{

    @Autowired
    private habilidadRepository habilidadRepo;
    
    @Override
    public List<habilidadModel> verHabilidades() {
        return habilidadRepo.findAll();
    }

    @Override
    public void modificarHabilidad(long id, habilidadModel habilidad) {
       habilidadModel habilidadMod = habilidadRepo.findById(id).orElse(null);
       
       if(habilidad.getName()!=null)
       {
           habilidadMod.setName(habilidad.getName());
       }
       if(habilidad.getPorcentaje()!=null)
       {
           habilidadMod.setPorcentaje(habilidad.getPorcentaje());
       }
       habilidadRepo.save(habilidadMod);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        
        habilidadRepo.deleteById(id);
    }

    @Override
    public void agregarHabilidad(habilidadModel habilidad) {
        habilidadRepo.save(habilidad);
    }
    
}
