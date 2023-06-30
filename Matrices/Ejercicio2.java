import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){
        Scanner entrada= new Scanner(System.in);
        int inicio =4;
        int inicio2 =0;
        int matriz[][]={{1,1,1,1,1,1,1},{1,0,0,0,1,0,0},{1,0,1,0,1,0,1},{1,0,1,0,1,0,1},{0,0,1,0,0,0,1},{1,1,1,1,1,1,1}};

        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("Desea Jugar?");
        System.out.println("Si=1");
        System.out.println("No=2");
        int comenzar = entrada.nextInt();
        if(comenzar==1){
            matriz[4][0]=2;
            for(int i=0; i<matriz.length;i++){
                for(int j=0; j<matriz[i].length;j++){
                System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println("");
            }
            for(int q=1;q<=1;q++){
                System.out.println("Para mover el 2 puede puede usar 8=Arriba 2=Abajo 6=Derecha 4=Izquierda");
                for(int m=1;m<=100;m++){
                    System.out.println("Para Donde desea Moverse?");
                    int mover =entrada.nextInt();
                    if(mover==6){
                        inicio2=inicio2+1;
                        if(matriz[inicio][inicio2]==1){
                            System.out.println("Hay una pared");
                            inicio2=inicio2-1;
                        }else{
                            matriz[inicio][inicio2]=2;
                            for(int i=0; i<matriz.length;i++){
                                for(int j=0; j<matriz[i].length;j++){
                                    System.out.print("["+matriz[i][j]+"]");
                                }
                                System.out.println("");
                            }
                        }
                    }
                    if(mover==2){
                        inicio=inicio+1;
                        if(matriz[inicio][inicio2]==1){
                            System.out.println("Hay una pared");
                            inicio=inicio-1;
                        }else{
                            matriz[inicio][inicio2]=2;
                            for(int i=0; i<matriz.length;i++){
                                for(int j=0; j<matriz[i].length;j++){
                                    System.out.print("["+matriz[i][j]+"]");
                                }
                                System.out.println("");
                            }
                        }
                    }
                    if(mover==4){
                        inicio2=inicio2-1;
                        if(matriz[inicio][inicio2]==1){
                            System.out.println("Hay una pared");
                            inicio2=inicio2+1;
                        }else{
                            matriz[inicio][inicio2]=2;
                            for(int i=0; i<matriz.length;i++){
                                for(int j=0; j<matriz[i].length;j++){
                                System.out.print("["+matriz[i][j]+"]");
                                }
                                System.out.println("");
                            }
                        }
                    }
                    if(mover==8){
                        inicio=inicio-1;
                        if(matriz[inicio][inicio2]==1){
                            System.out.println("Hay una pared");
                            inicio=inicio+1;
                        }else{
                            matriz[inicio][inicio2]=2;
                            for(int i=0; i<matriz.length;i++){
                                for(int j=0; j<matriz[i].length;j++){
                                    System.out.print("["+matriz[i][j]+"]");
                                }
                                System.out.println("");
                            } 
                        }
                        
                    }
                    if(matriz[1][6]==2){
                        System.out.println("Ganaste Toma un Dollar $1");
                        m=101;
                    }
                }
            }
        }else if(comenzar==2){
            System.out.println("OK");
        }
    }
}