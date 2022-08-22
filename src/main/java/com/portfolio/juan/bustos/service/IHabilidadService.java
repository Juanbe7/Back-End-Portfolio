package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.habilidadModel;
import java.util.List;

/**
 *
 * @author Juanbe
 */
public interface IHabilidadService {
    
    public List<habilidadModel> verHabilidades();
    
    public void modificarHabilidad(long id, habilidadModel habilidad);
    
    public void eliminarHabilidad(Long id);
    
    public void agregarHabilidad(habilidadModel habilidad);
}
