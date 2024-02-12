package com.example.pokeapi;

public class Pokemon {

    String numero;
    String nombre;
    String url;

    public Pokemon(String numero, String nombre,String url) {
        this.numero = numero;
        this.nombre = nombre;
        this.url = url;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String  getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getUrl() {
        return url;
    }
}
