package com.portfolio.juan.bustos.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class emailModel {

    private String nombreDe;
    private String mensaje;
    private String emailDe;

    public emailModel(String nombreDe, String mensaje, String emailDe) {
        this.nombreDe = nombreDe;
        this.mensaje = mensaje;
        this.emailDe = emailDe;
    }

    public emailModel() {
    }
}
