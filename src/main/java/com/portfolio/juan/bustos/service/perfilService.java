package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.perfilModel;
import com.portfolio.juan.bustos.repository.perfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juanbe
 */
@Service
public class perfilService implements IPerfilService {
    
    @Autowired
    public perfilRepository perfilRepo;

    @Override
    public void ModificarPerfil(perfilModel perfil) {       
        long id = 1;
        perfilModel perfMod = perfilRepo.findById(id).orElse(null);
        if(perfil.getNombre()!=null  && perfil.getNombre()!="")
        {
            perfMod.setNombre(perfil.getNombre());
        }
        if(perfil.getDescripcion()!=null  && perfil.getDescripcion()!="")
        {
            perfMod.setDescripcion(perfil.getDescripcion());
        }
        if(perfil.getImagen()!=null && perfil.getImagen()!="")
        {
            perfMod.setImagen(perfil.getImagen());
        }
        perfilRepo.save(perfMod);
    }

    @Override
    public void agregarPerfil(perfilModel perfil) {
        perfilRepo.save(perfil);
    }

    @Override
    public perfilModel verPerfil() {
       long id = 1;
       return perfilRepo.findById(id).orElse(null);
    }
    
}
