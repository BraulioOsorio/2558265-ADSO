import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese las filas de la matriz");
        int filas= entrada.nextInt();
        System.out.println("Ingrese las Columnas de la matriz");
        int columnas=entrada.nextInt();
        int matriz[][]=new int [filas][columnas];
        System.out.println("Ingrese el numero de bombas a plantar");
        int bombas = entrada.nextInt();
        for(int i=0;i<matriz.length;i++){
            for(int k=0;k<matriz[i].length;k++){
                System.out.print("["+matriz[i][k]+"]");
                
            }
            System.out.println("");
        }
        
        System.out.println("Tenga en cuenta que para dar la ubicacion de plantacion de la bomba debe ingresar primero el numero de la fila y despues el numero de la columna");
        for(int b=1; b<=bombas;b++){
            int fila12=0;
            int columna12=0;
            System.out.println("\nBomba Nª "+b);
            int fila2=entrada.nextInt();
            int columna2=entrada.nextInt();
            fila12=fila2;
            columna12=columna2;
            matriz[fila2-1][columna2-1]=1; 
                
                if(fila2==1 && columna2==1){
                    matriz[fila12][columna12]=2;
                    matriz[fila12-1][columna12]=2;
                    matriz[fila12][columna12-1]=2;
                }else if(fila2==1 && columna2==columnas){
                    matriz[fila12][columna12-1]=2;
                    matriz[fila12][columna12-2]=2;
                    matriz[fila12-1][columna12-2]=2;
                }else if(fila2==filas && columna2==1){
                    matriz[fila12-2][columna12-1]=2;
                    matriz[fila12-1][columna12]=2;
                    matriz[fila12-2][columna12]=2;
                }else if(fila2==filas && columna2==columnas){
                    matriz[fila12-1][columna12-2]=2;
                    matriz[fila12-2][columna12-1]=2;
                    matriz[fila12-2][columna12-2]=2;
                }else if(columna2==columnas){
                    matriz[fila12][columna12-1]=2;
                    matriz[fila12][columna12-2]=2;
                    matriz[fila12-1][columna12-2]=2;
                    matriz[fila12-2][columna12-2]=2;
                    matriz[fila12-2][columna12-1]=2;
                }else if(columna12==1){
                    matriz[fila12][columna12]=2;
                    matriz[fila12-1][columna12]=2;
                    matriz[fila12-2][columna12]=2;
                    matriz[fila12-2][columna12-1]=2;
                    matriz[fila12][columna12-1]=2;
                }else if(fila12==filas){
                    matriz[fila12-1][columna12]=2;
                    matriz[fila12-2][columna12]=2;
                    matriz[fila12-2][columna12-1]=2;
                    matriz[fila12-2][columna12-2]=2;
                    matriz[fila12-1][columna12-2]=2;
                }else if(fila2==1){
                    matriz[fila12][columna12]=2;
                    matriz[fila12][columna12-1]=2;
                    matriz[fila12][columna12-2]=2;
                    matriz[fila12-1][columna12-2]=2;
                    matriz[fila12-1][columna12]=2;

                }else{
                    matriz[fila12-2][columna12-1]=2;
                    matriz[fila12][columna12-1]=2;
                    matriz[fila12-1][columna12-2]=2;
                    matriz[fila12-1][columna12]=2;
                    matriz[fila12][columna12]=2;
                    matriz[fila12-2][columna12]=2;
                    matriz[fila12][columna12-2]=2;
                    matriz[fila12-2][columna12-2]=2;
                }
            

        }
        for(int i=0;i<matriz.length;i++){
            for(int k=0;k<matriz[i].length;k++){
                System.out.print("["+matriz[i][k]+"]");
            }
            System.out.println("");
        }
    }
}