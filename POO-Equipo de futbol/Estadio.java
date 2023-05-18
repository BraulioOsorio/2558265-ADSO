public class Estadio{
    String nombre;
    String ubicacion;
    Partido partidosJugados[];

    public Estadio(String nombre,String ubicacion){
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
    public void imprimir(){
        System.out.println(this.nombre+" - "+this.ubicacion);
    }
    
}