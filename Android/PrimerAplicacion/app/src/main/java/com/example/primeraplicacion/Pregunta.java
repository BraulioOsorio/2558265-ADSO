package com.example.primeraplicacion;

import java.util.List;

public class Pregunta {
    private String descripcion;

    private List<String> respuestas;
    private String imagenUrl;

    public Pregunta(String descripcion, List<String> respuestas, String imagenUrl) {
        this.descripcion = descripcion;
        this.respuestas = respuestas;
        this.imagenUrl = imagenUrl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getRespuestas()
    {
        return respuestas;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }
}

