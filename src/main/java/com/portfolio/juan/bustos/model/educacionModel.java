package com.portfolio.juan.bustos.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Juanbe
 */
@Getter @Setter
@Entity
public class educacionModel {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long  id;
    private String institucion;
    private String linkImagen;
    private String carrera;
    private String estado;
    private String tiempodesde;
    private String tiempohasta;

    public educacionModel(long id, String institucion, String linkImagen, String carrera, String estado, String tiempodesde, String tiempohasta) {
        this.id = id;
        this.institucion = institucion;
        this.linkImagen = linkImagen;
        this.carrera = carrera;
        this.estado = estado;
        this.tiempodesde = tiempodesde;
        this.tiempohasta = tiempohasta;
    }

    public educacionModel() {
    }
     
}
