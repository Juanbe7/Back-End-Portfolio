package com.portfolio.juan.bustos.controller;

import com.portfolio.juan.bustos.model.emailModel;
import com.portfolio.juan.bustos.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class emailSenderController {

    @Autowired
    emailService emailServ;

    @PostMapping("/enviarmail")
    public void enviarEmail(@RequestBody emailModel email)
    {
        emailServ.enviarEmail(email);
    }
}
