public class Estadio{
    String nombre;
    String ubicacion;
    Partido partidosJugados[];
    int numPartidos;

    public Estadio(String nombre,String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.partidosJugados=new Partido[20];
        this.numPartidos=numPartidos;
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
    public void agregarPartido(Partido partidos){
        partidosJugados[numPartidos]=partidos;
        numPartidos++;
    }
    public void PartidosEstadio(){
        System.out.println("Lista de partidos jugados");
        for(int i=0;i<numPartidos;i++){
            System.out.print((i+1)+" - ");
            partidosJugados[i].imprimirVS();
        }
    }
    
}