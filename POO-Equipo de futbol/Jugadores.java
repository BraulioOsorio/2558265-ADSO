import java.util.Scanner;

public class Jugadores{
    String nombre;
    String edad;
    int documento;
    String equipo;
    String posicion;
    Scanner entrada;
    Scanner texto;
    public Jugadores(String nombre,String edad,int documento,String posicion){
        this.nombre=nombre;
        this.edad=edad;
        this.documento=documento;
        this.equipo=equipo;
        this.posicion=posicion;
        this.entrada = new Scanner(System.in);
        this.texto = new Scanner(System.in);
    }

    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public int getDocumento(){
        return documento;
    }
    
    public String getPosicion(){
        return posicion;
    }
    public String getEquipo(){
        return equipo;
    }
    public void setEquipo(String equipo){
        this.equipo=equipo;
    }
    public void imprimir(){
        System.out.println(this.nombre+" - "+this.documento+" - "+this.posicion+"--"+this.equipo);
    }
}