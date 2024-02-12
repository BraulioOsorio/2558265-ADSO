package com.example.pokeapi;

public class Habilidades {
    String url;
    String nombre;
    String altura;
    String peso;
    public Habilidades(String nombre, String url,String peso,String altura) {
        this.nombre = nombre;
        this.url = url;
        this.altura = altura;
        this.peso = peso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
