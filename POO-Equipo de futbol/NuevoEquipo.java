public class NuevoEquipo{
    Equipo equipo[];
    Jugadores jugadoresEquipo[];
    String nombreEquipo;
    public NuevoEquipo(){
        this.equipo= new Equipo[99];
        this.jugadoresEquipo= new Jugadores[10];
    }
    public void nuevoEqui(int jugador,int Nequipo){
        jugadoresEquipo[jugador].setEquipo(equipo[Nequipo].getNombreEquipo());
       
    }
}