package com.example.primeraplicacion;

import java.util.List;

public class Pregunta {
    private String descripcion;

    private List<String> respuestas;
    private int imagenResourceId;

    public Pregunta(String descripcion, List<String> respuestas,int imagenResourceId) {
        this.descripcion = descripcion;
        this.respuestas = respuestas;
        this.imagenResourceId = imagenResourceId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public int getImagenResourceId() {
        return imagenResourceId;
    }
}

