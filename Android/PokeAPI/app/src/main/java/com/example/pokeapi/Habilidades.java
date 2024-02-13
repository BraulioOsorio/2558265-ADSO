package com.example.pokeapi;

import java.util.List;

public class Habilidades {

    List<String> nombresHabilidades;

    String altura;
    String peso;
    public Habilidades(  List<String> nombresHabilidades,String peso,String altura) {

        this.nombresHabilidades = nombresHabilidades;
        this.altura = altura;
        this.peso = peso;
    }
    public List<String> getNombresHabilidades() {
        return nombresHabilidades;
    }

    public void setNombresHabilidades(List<String> nombresHabilidades) {
        this.nombresHabilidades = nombresHabilidades;
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
