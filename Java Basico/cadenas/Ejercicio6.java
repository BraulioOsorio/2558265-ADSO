import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea iniciar el juego ");
        System.out.println("1=SI   2=NO");
        int jugara = entrada.nextInt();
        boolean jugar=true;
        if(jugara==1){
            jugar=true;
        }else if(jugara==2){
            jugar=false;
        }
        boolean empate=false;
        while(jugar==true){
            char arreglo[] = new char[9];
            entrada.nextLine();
            System.out.println("Ingrese el numbre del jugador 1");
            String jugador1=entrada.nextLine();
            System.out.println("Ingrese el numbre del jugador 2");
            String jugador2=entrada.nextLine();
            System.out.println("TABLERO");
            for(int h=0;h<=8;h++){
                if(arreglo[h]==0){
                    arreglo[h]=' ';
                }
                System.out.print("["+arreglo[h]+"]");
                if(h==2 || h==5){
                    System.out.println("");
                }
            }
            System.out.println("");
            int i=0;
            while(i<9){
                if(i<8){
                    boolean jugada=true;
                    while(jugada=true){
                        System.out.println("Jugador "+jugador1+" dijite su movimiento su simbolo es O");
                        int posicion1 = entrada.nextInt();
                        if(arreglo[posicion1-1]=='O' || arreglo[posicion1-1]=='X'){
                            System.out.println("La posicion esta ocupada");
                            jugada=true;                
                        }else{
                            arreglo[posicion1-1]='O';
                            break;
                        }
                    }
                    for(int h=0;h<=8;h++){
                        if(arreglo[h]==0){
                            arreglo[h]=' ';
                        }
                        System.out.print("["+arreglo[h]+"]");
                        if(h==2 || h==5){
                        System.out.println("");
                        }
                    }
                    System.out.println("");
                    while(jugada=true){
                        System.out.println("Jugador "+jugador2+" dijite su movimiento su simbolo es X");
                        int posicion2 = entrada.nextInt();
                        if(arreglo[posicion2-1]=='O' || arreglo[posicion2-1]=='X'){
                            System.out.println("La posicion esta ocupada");
                            jugada=true;
                        }else{
                            arreglo[posicion2-1]='X';
                            break;
                        }
                    }
                    i=i+2;
                }else if(i==8){
                   boolean jugada=true;
                    while(jugada=true){
                        System.out.println("Jugador "+jugador1+" dijite su movimiento su simbolo es O");
                        int posicion1 = entrada.nextInt();
                        if(arreglo[posicion1-1]=='O' || arreglo[posicion1-1]=='X'){
                            System.out.println("La posicion esta ocupada");
                            jugada=true;
                        }else{
                            arreglo[posicion1-1]='O';
                            break;
                        }
                    }
                    i++;
                }
                if((arreglo[0]=='O' && arreglo[4]=='O' && arreglo[8]=='O')||(arreglo[0]=='X' && arreglo[4]=='X' && arreglo[8]=='X')){
                    if(arreglo[0]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[0]=='O' && arreglo[1]=='O' && arreglo[2]=='O')||(arreglo[0]=='X' && arreglo[1]=='X' && arreglo[2]=='X')){
                    if(arreglo[0]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[0]=='O' && arreglo[3]=='O' && arreglo[6]=='O')||(arreglo[0]=='X' && arreglo[3]=='X' && arreglo[6]=='X')){
                    if(arreglo[0]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }empate=false;
                    break;
                }else if((arreglo[3]=='O' && arreglo[4]=='O' && arreglo[5]=='O')||(arreglo[3]=='X' && arreglo[4]=='X' && arreglo[5]=='X')){
                    if(arreglo[3]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[6]=='O' && arreglo[7]=='O' && arreglo[8]=='O')||(arreglo[6]=='X' && arreglo[7]=='X' && arreglo[8]=='X')){
                    if(arreglo[6]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[1]=='O' && arreglo[4]=='O' && arreglo[7]=='O')||(arreglo[1]=='X' && arreglo[4]=='X' && arreglo[7]=='X')){
                    if(arreglo[1]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[2]=='O' && arreglo[5]=='O' && arreglo[8]=='O')||(arreglo[2]=='X' && arreglo[5]=='X' && arreglo[8]=='X')){
                    if(arreglo[2]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else if((arreglo[2]=='O' && arreglo[4]=='O' && arreglo[6]=='O')||(arreglo[2]=='X' && arreglo[4]=='X' && arreglo[6]=='X')){
                    if(arreglo[2]=='O'){
                        System.out.println("El jugador "+jugador1+" gano la partida");
                    }else{
                        System.out.println("El jugador "+jugador2+" gano la partida");
                    }
                    empate=false;
                    break;
                }else{
                    empate=true;
                }
                for(int h=0;h<=8;h++){
                    if(arreglo[h]==0){
                        arreglo[h]=' ';
                    }
                    System.out.print("["+arreglo[h]+"]");
                    if(h==2 || h==5){
                        System.out.println("");
                    }
                }
                System.out.println("");  
            }
            System.out.println("FINAL");  
            for(int h=0;h<=8;h++){
                System.out.print("["+arreglo[h]+"]");
                if(h==2 || h==5){
                    System.out.println("");
                }
            }
            System.out.println("\ndesea jugar otra vez?");
            System.out.println("1=SI   2=NO");
            int otroa =entrada.nextInt();
            if(otroa==1){
                jugar=true;
            }else if(otroa==2){
                jugar=false;
            }
            System.out.println("");
            if(empate==true){
                System.out.println("\nEMPATE");
                System.out.println("desea jugar otra vez?");
                System.out.println("1=SI   2=NO");
                int otro =entrada.nextInt();
                if(otro==1){
                    jugar=true;
                }
            }
        }
        if(jugar==false){
            System.out.println("Chau");
        }
    }
}