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
    public void imprimirDetalle(){
        System.out.println(this.nombreEquipo+"    "+this.entrenador);
        System.out.println("JUGADORES");
        for(int i=0;i<numJugadores;i++){
            System.out.print((i+1)+" - ");
            jugadoresEquipo[i].imprimir();
        }
    }
    public void imprimir(){
        System.out.println(this.nombreEquipo+"    "+this.entrenador);
    }
    public void limpiar(Jugadores jugador){
        for(int i=0;i<numJugadores;i++){
            if(jugadoresEquipo[i]==jugador){
                numJugadores--;
                jugadoresEquipo[i]=null;
            }
        }
        for(int i=0;i<numJugadores;i++){
            for(int j=0;j<numJugadores-1;j++){
                if(jugadoresEquipo[j]==null){
                    Jugadores temporal = jugadoresEquipo[j];
                    jugadoresEquipo[j]=jugadoresEquipo[j+1];
                    jugadoresEquipo[j+1]=temporal;
                }
            }
        }
    }
    

}