package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.perfilModel;
import java.util.List;

/**
 *
 * @author Juanbe
 */
public interface IPerfilService {
    
    public perfilModel verPerfil();
    
    public void ModificarPerfil(perfilModel perfil);

    public void agregarPerfil(perfilModel perfil);

}
