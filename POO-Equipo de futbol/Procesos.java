import java.util.Scanner;
public class Procesos{
    Scanner entrada = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    Estadio arrayEstadios[] = new Estadio[100];
    int estadios = 0;
    public void nuevoEqui(Jugadores jugadores[],Equipo equipo[],int numeroJugadores,int numeroEquipos){  
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
            equipo[nuevoEquipo-1].agregarJugador(jugadores[posicion]);
    }
    public void detalleEquipo(Equipo equipo[],int numeroEquipos){
        System.out.println("Lista de equipos");
        for(int i=0;i<numeroEquipos;i++){
            System.out.print((i+1)+" - ");
            equipo[i].imprimir();
        }
        System.out.print("\nElija un equipo por su numero: ");
        int opcion = entrada.nextInt();
        equipo[opcion-1].imprimirDetalle();

    }
    public void nuevoEstadio(){
        System.out.println("NUEVO ESTADIO");
        System.out.print("Ingrese el nombre del Estadio: ");
        String nombre = texto.nextLine();
        System.out.print("Ingrese la Ubicacion del estadio: ");
        String ubicacion = texto.nextLine();
        Estadio temporal = new Estadio(nombre,ubicacion);
        boolean existe = false;
        for(int i=0;i<estadios;i++){
            if(arrayEstadios[i].getNombre().equalsIgnoreCase(nombre) && arrayEstadios[i].getUbicacion().equalsIgnoreCase(ubicacion)){
                existe=true;
                break;
            }
        }
        if(existe==true){
            System.out.println("\nEl Estadio ya existe\n");
        }else{
            arrayEstadios[estadios]=temporal;
            estadios++;
            System.out.println("\nEstadio registrado con exito\n");
        }
    }
    public void registrarPartido(){
        for(int i=0;i<estadios;i++){
            arrayEstadios[i].imprimir();
        }
    }
}