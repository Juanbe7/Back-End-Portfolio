package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.educacionModel;
import com.portfolio.juan.bustos.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juanbe
 */
@Service
public class educacionService implements IEducacionService{

    @Autowired
    private educacionRepository eduRepo;
    
    @Override
    public List<educacionModel> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void modificarEducacion(long id, educacionModel educacion) {
        educacionModel eduMod = eduRepo.findById(id).orElse(null);
        if(educacion.getInstitucion()!=null)
        {
            eduMod.setInstitucion(educacion.getInstitucion());
        }
        if(educacion.getCarrera()!=null)
        {
            eduMod.setCarrera(educacion.getCarrera()); 
        }
        if(educacion.getEstado()!=null)
        {
            eduMod.setEstado(educacion.getEstado());
        }
        if(educacion.getLinkImagen()!=null)
        {          
            eduMod.setLinkImagen(educacion.getLinkImagen());  
        }
        if(educacion.getTiempodesde()!=null)
        {
            eduMod.setTiempodesde(educacion.getTiempodesde());
        }
        if(educacion.getTiempohasta()!=null)
        {
            eduMod.setTiempohasta(educacion.getTiempohasta());
        }   
        eduRepo.save(eduMod);
    }

    @Override
    public void eliminarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void agregarEducacion(educacionModel educacion) {
        eduRepo.save(educacion);
    }
    
}
