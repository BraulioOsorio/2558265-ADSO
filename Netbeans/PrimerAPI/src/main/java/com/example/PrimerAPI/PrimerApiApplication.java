package com.example.PrimerAPI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerApiApplication {
        DataBase base_datos;

        public PrimerApiApplication() {
            this.base_datos = new DataBase();
        }
        
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
        
        @CrossOrigin
        @GetMapping("/listaPersonas")
        public List<Persona> listado() throws SQLException{
            List<Persona> listado = new ArrayList<>();
            
            
            ResultSet listados = base_datos.listaPersonas();
            if(listados != null){
                try {
                    do{
                        Persona temporal = new Persona(listados.getString("cedula"),listados.getString("nombres"),listados.getString("apellidos"),listados.getString("telefono"),listados.getString("email"));
                        listado.add(temporal);

                    }while( listados.next() );
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            return listado;
        }
        
        @GetMapping("/persona2")
        public String getPersona(@RequestParam String cedula){
            return "La persona buscada es: "+cedula;
        }
}
