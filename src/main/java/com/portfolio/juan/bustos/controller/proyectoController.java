package com.portfolio.juan.bustos.controller;

import com.portfolio.juan.bustos.model.proyectoModel;
import com.portfolio.juan.bustos.service.proyectoService;
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

@RestController
public class proyectoController {
    
    @Autowired
    public proyectoService proyeServ;
    
    @RequestMapping(value="proyecto")
    public List<proyectoModel> verProyectos()
    {
        return proyeServ.verProyecto();
    }
    
    @PostMapping("/proyecto")
    public void agregarProyecto(@RequestBody proyectoModel proyecto)
    {
        proyeServ.agregarProyecto(proyecto);
    }
    
    @PutMapping("/proyecto/{id}")
    public void modificarProyecto(@PathVariable long id,@RequestBody proyectoModel proyecto)
    {
        proyeServ.modificarProyecto(id, proyecto);
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void eliminarProyecto(@PathVariable long id)
    {
        proyeServ.eliminarProyecto(id);
    }
}
