package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.proyectoModel;
import com.portfolio.juan.bustos.repository.proyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Juanbe
 */
@Service
public class proyectoService implements IProyectoService{

    @Autowired
    public proyectoRepository proyeRepo;
    
    
    @Override
    public List<proyectoModel> verProyecto() {
        
        return proyeRepo.findAll();
    }
    
    @Override
    public void agregarProyecto(proyectoModel proyecto) {
        
        proyeRepo.save(proyecto);
    }

    @Override
    public void modificarProyecto(Long id, proyectoModel proyecto) {
        
        proyectoModel proyeMod = proyeRepo.findById(id).orElse(null);
        
        if(proyecto.getName()!=null)
        {
            proyeMod.setName(proyecto.getName());
        }
        if(proyecto.getDescripcion()!=null)
        {
            proyeMod.setDescripcion(proyecto.getDescripcion());
        }
        if(proyecto.getLink()!=null)
        {
            proyeMod.setLink(proyecto.getLink());
        }
        if(proyecto.getLinkImagen()!=null)
        {
            proyeMod.setLinkImagen(proyecto.getLinkImagen());
        }
        if(proyecto.getFecha()!=null)
        {
            proyeMod.setFecha(proyecto.getFecha());
        }

        proyeRepo.save(proyeMod);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }
    
}
