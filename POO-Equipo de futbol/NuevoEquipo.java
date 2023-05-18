import java.util.Scanner;
public class NuevoEquipo{
    public void nuevoEqui(Jugadores jugadores[],Equipo equipo[],int numeroJugadores,int numeroEquipos){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el documento del Jugador para cambiarlo de equipo: ");
            int documento = entrada.nextInt();
            int posicion =0;
            for(int i=0;i<numeroJugadores;i++){
                if(jugadores[i].getDocumento()==documento){
                    posicion=i;
                }
            }
            jugadores[posicion].imprimir();
            System.out.println("\nLISTA DE EQUIPOS");
            for(int i=0;i<numeroEquipos;i++){
                System.out.print((i+1)+"-");
                equipo[i].imprimir();
            }
            System.out.print("ingrese el nuevo equipo del jugador");
            int nuevoEquipo = entrada.nextInt();
            
            jugadores[posicion].setEquipo(equipo[nuevoEquipo-1].getNombreEquipo());
            System.out.println("Jugador Cambiado con Exito");
            jugadores[posicion].imprimir();
            
       
    }

}