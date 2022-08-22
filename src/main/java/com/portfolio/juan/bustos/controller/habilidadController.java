package com.portfolio.juan.bustos.controller;

import com.portfolio.juan.bustos.model.habilidadModel;
import com.portfolio.juan.bustos.service.habilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juanbe
 */
@RestController
public class habilidadController {
    
    @Autowired
    private habilidadService habiServ;
    
    @RequestMapping(value="habilidad")
    public List<habilidadModel> verHabilidades()
    {
        return habiServ.verHabilidades();
    }
    
    @PostMapping("/habilidad")
    public void agregarHabilidad(@RequestBody habilidadModel habilidad)
    {
        habiServ.agregarHabilidad(habilidad);
    }
    
    @PutMapping("/habilidad/{id}")
    public void modificarHabilidad(@PathVariable long id,@RequestBody habilidadModel habilidad)
    {
        habiServ.modificarHabilidad(id, habilidad);
    }
    
    @DeleteMapping("/habilidad/{id}")
    public void eliminarHabilidad(@PathVariable long id)
    {
        habiServ.eliminarHabilidad(id);
    }
    
}
