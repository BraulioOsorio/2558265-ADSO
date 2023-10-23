package com.example.PrimerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerApiApplication.class, args);
	}
        @GetMapping("/")
        public String inicio(){
            return "Hola mundo";
        }
        
        @GetMapping("/Persona")
        public Persona prueba(){
            Persona temporal = new Persona("10","Juan","nose","31313","jajajaj@");
            return temporal;
        }
}
