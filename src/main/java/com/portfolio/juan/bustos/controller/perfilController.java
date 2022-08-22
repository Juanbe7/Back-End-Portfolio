package com.portfolio.juan.bustos.controller;

import com.portfolio.juan.bustos.model.perfilModel;
import com.portfolio.juan.bustos.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class perfilController {
    
    @Autowired
    private IPerfilService perfilServ;
    
    
    @RequestMapping(value="perfil")
    public perfilModel verPerfil()
    {
      return perfilServ.verPerfil();      
    }
    
    @PostMapping("/perfil") 
    public void modificarPerfil(@RequestBody perfilModel perf)
    {
      //  System.out.println(perf.getNombre() + perf.getDescripcion());
        perfilServ.ModificarPerfil(perf);
    }

    @PutMapping("/perfil")
    public void agregarPerfil(@RequestBody perfilModel perf)
    {
        perfilServ.agregarPerfil(perf);
    }

    
}
