import java.util.Scanner;
public class Procesos{
    Scanner entrada = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    Estadio arrayEstadios[] = new Estadio[100];
    Partido arrayPartidos[] = new Partido[100];
    int estadios = 0;
    int partidos=0;
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
            String EquipoAnterior = jugadores[posicion].getEquipo();
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
            for(int i=0;i<numeroEquipos;i++){
                if(equipo[i].getNombreEquipo().equalsIgnoreCase(EquipoAnterior)){
                    equipo[i].limpiar(jugadores[posicion]);
                }
            }
            
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
    public void registrarPartido(Equipo equipo[],int numeroEquipos){
        System.out.println("Lista de Estadios");
        for(int i=0;i<estadios;i++){
            System.out.print((i+1)+" - ");
            arrayEstadios[i].imprimir();
        }
        System.out.print("Eliga un estadio: ");
        int numeroEstadio = entrada.nextInt();
        arrayEstadios[numeroEstadio-1].imprimir();
        for(int i=0;i<numeroEquipos;i++){
            System.out.print((i+1)+" - ");
            equipo[i].imprimir();
        }
        System.out.print("Elija el equipo Local");
        int equipoLocal = entrada.nextInt();
        System.out.print("Elija el equipo Visitante");
        int equipoVisitante = entrada.nextInt();
        System.out.print("Goles del Equipo Local");
        int golesL = entrada.nextInt();
        System.out.print("\nGoles del Equipo Visitante");
        int golesV = entrada.nextInt();
        Partido temporal = new Partido(equipo[equipoLocal-1].getNombreEquipo(),equipo[equipoVisitante-1].getNombreEquipo(),arrayEstadios[numeroEstadio-1].getNombre(),golesL,golesV);
        arrayPartidos[partidos]=temporal;
        if(golesL>golesV){
            arrayPartidos[partidos].setResultado(equipo[equipoLocal-1].getNombreEquipo());
        }else if(golesV>golesL){
            arrayPartidos[partidos].setResultado(equipo[equipoVisitante-1].getNombreEquipo());
        }else if(golesL==golesV){
            arrayPartidos[partidos].setResultado("empate");
        }
        arrayEstadios[numeroEstadio-1].agregarPartido(arrayPartidos[partidos]);
        partidos++;
    }
    public void detallePartido(){
        System.out.println("\nLista de Partidos Realizados\n");
        for(int i=0;i<partidos;i++){
            System.out.print((i+1)+" - ");
            arrayPartidos[i].imprimir();
        }
        System.out.print("Elija el numero del partido del cual queire ver el detalle");
        int detalle = entrada.nextInt();
        arrayPartidos[detalle-1].imprimirDetalle();
    }
    public void ListaPartidosEstadio(){
        System.out.print("Lista de Estadios");
        for(int i=0;i<estadios;i++){
            System.out.print((i+1)+" - ");
            arrayEstadios[i].imprimir();
        }
        System.out.print("Eliga un estadio para ver los partidos realizados en el: ");
        int numeroEstadio = entrada.nextInt();
        arrayEstadios[numeroEstadio-1].PartidosEstadio();
    }
}