package com.portfolio.juan.bustos.service;

import com.portfolio.juan.bustos.model.emailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailService {

    @Value("${spring.mail.username}")
    private String Remitente;

    @Autowired
    private JavaMailSender javaMailSender;

    public void enviarEmail(emailModel email)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("jemiliobus@gmail.com");
        message.setText(email.getMensaje() +"\nEmail: "+email.getEmailDe());
        message.setSubject("Contacto por medio de portfolio Nombre: "+email.getNombreDe());

        javaMailSender.send(message);
    }
}
