package com.portfolio.juan.bustos;

import com.portfolio.juan.bustos.model.emailModel;
import com.portfolio.juan.bustos.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST","DELETE","OPTIONS","PUT").allowedHeaders("*");
			}
		};
	}
/*
	@Autowired
	private emailService emailServ;
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		emailModel email = new emailModel();
		email.setEmailDe("JuanBustos@hotmail.com");
		email.setMensaje("Hola juan como estas, esto es una prueba");
		email.setNombreDe("Juan Bustos");
		emailServ.enviarEmail(email);
	}*/

}
