package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.educacionModel;
import java.util.List;

/**
 *
 * @author Juanbe
 */
public interface IEducacionService {
    
    public List<educacionModel> verEducaciones();
    
    public void modificarEducacion(long id, educacionModel educacion);
    
    public void eliminarEducacion(Long id);
    
    public void agregarEducacion(educacionModel educacion);
}
