import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        Jugadores arrayJugadores[] = new Jugadores[99];
        int jugadores=0;
        Equipo arrayEquipos[] = new Equipo[99];
        int equipos=0;
        NuevoEquipo PasarJugador = new NuevoEquipo();
        boolean salir=false;
        while(salir==false){
            System.out.println("     1-> Crear Jugador de Futbol");
            System.out.println("     2-> Crear Equipo de Futbol");
            System.out.println("     3-> Cambiar Jugador de Equipo");
            System.out.println("     4-> Ver Listado de Equipos de Futbol");
            System.out.println("     5-> Ver detalle de Equipos de Futbol");
            System.out.println("     6-> Registrar Partido");
            System.out.println("     7-> Ver detalle de Partidos de Futbol");
            System.out.println("     8-> Ver listado de Partidos de Futbol realizados en un Estadio");
            System.out.print("Ingrese una opcion: ");
            int opcion = entrada.nextInt();
            if(opcion==1){
                System.out.println("\n==NUEVO JUGADOR==\n");
                System.out.print("Ingrese el nombre del jugador: ");
                String nombre = texto.nextLine();
                System.out.print("Ingrese la edad del jugador: ");
                String edad = texto.nextLine();
                System.out.print("Ingrese el documento del jugador: ");
                int documento = entrada.nextInt();
                System.out.print("Ingrese la posicion del jugador: ");
                String posicion = texto.nextLine();
                Jugadores temporal = new Jugadores(nombre,edad,documento,posicion);
                boolean existe = false;
                for(int i=0;i<jugadores;i++){
                    if(arrayJugadores[i].getDocumento()==documento){
                        existe=true;
                        break;
                    }
                }
                if(existe==true){
                    System.out.println("\nEl jugador ya existe\n");
                }else{
                    arrayJugadores[jugadores]=temporal;
                    jugadores++;
                    System.out.println("\nJugador registrado con exito\n");
                }
            }else if(opcion==2){
                System.out.println("\n==NUEVO EQUIPO==\n");
                System.out.print("Ingrese nombre del equipo: ");
                String nombre = texto.nextLine();
                System.out.print("Nombre del entrenador: ");
                String nombreEntrenador=texto.nextLine();
                Equipo nuevo = new Equipo(nombre,nombreEntrenador);
                arrayEquipos[equipos]=nuevo;
                equipos++;
                boolean seguir=true;
                while(seguir==true){
                    System.out.print("Desea selecionar un jugador, si es asi digite 1 de lo contradio digite 2: ");
                    int registrar = entrada.nextInt();
                    if(registrar==2){
                        break;
                    }else if(registrar==1){
                        System.out.println("\nLISTA DE JUGADORES DISPONIBLES\n");
                        for(int i=0;i<jugadores;i++){
                            if(arrayJugadores[i].getEquipo()==null){
                                arrayJugadores[i].imprimir();
                            }
                            
                        }
                        System.out.print("Numero del jugador que desea añadir al equipo: ");
                        int opcionJugador = entrada.nextInt();
                        nuevo.agregarJugador(arrayJugadores[opcionJugador-1]);
                    }
                    
                }
            }else if(opcion==3){
               
              PasarJugador.nuevoEqui(arrayJugadores,arrayEquipos,jugadores,equipos);

            }else if(opcion==4){
                for(int i=0;i<equipos;i++){
                    arrayEquipos[i].imprimir();
                }
            }else if(opcion==5){
                System.out.println("El ingeniero esta trabajando en ello");
                for(int i=0;i<jugadores;i++){
                    arrayJugadores[i].imprimir();
                }
            }
        }
    }
}