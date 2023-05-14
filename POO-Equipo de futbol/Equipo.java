public class Equipo{
    String nombreEquipo;
    String entrenador;
    Jugadores jugadoresEquipo[];
    int numJugadores;

    public Equipo(String nombreEquipo,String entrenador){
        this.nombreEquipo=nombreEquipo;
        this.entrenador=entrenador;
        this.numJugadores=0;
        this.jugadoresEquipo=new Jugadores[10];
    }
    public String getNombreEquipo(){
        return nombreEquipo;
    }
    public String getEntrenador(){
        return entrenador;
    }
    public void agregarJugador(Jugadores jugador) {
        jugadoresEquipo[numJugadores] = jugador;
        jugadoresEquipo[numJugadores].setEquipo(getNombreEquipo());
        numJugadores++;
       
    }
    public void imprimir(){
        System.out.println(this.nombreEquipo+" - "+this.entrenador);
    }
    

}