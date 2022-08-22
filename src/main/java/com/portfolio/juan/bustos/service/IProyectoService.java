package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.proyectoModel;
import java.util.List;

/**
 *
 * @author Juanbe
 */
public interface IProyectoService {
    
    public List<proyectoModel> verProyecto();
    
    public void modificarProyecto(Long id, proyectoModel proyecto);
    
    public void eliminarProyecto(Long id);
    
    public void agregarProyecto(proyectoModel proyecto);
}
