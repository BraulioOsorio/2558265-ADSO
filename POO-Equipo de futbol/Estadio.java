public class Estadio{
    String nombre;
    String ubicacion;
    Partido partidosJugados[];

    public Estadio(){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.partidosJugados=new Partido[20];
    }
    public String getNombre(){
        return nombre;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    
}