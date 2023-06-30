import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese las Filas de la Matriz = ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese las Columnas de la Matriz = ");
        int columnas = entrada.nextInt();
        int matriz [][]= new int [filas][columnas];
        System.out.println("Ingrese los valores de la Matriz");
        for(int i=0; i<matriz.length;i++){
            for(int o=0;o<matriz[i].length;o++){
                System.out.print("\nmatriz ["+i+"]["+o+"] = ");
                matriz[i][o]= entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es:");
        for(int i=0; i<matriz.length;i++){
            for(int o=0;o<matriz[i].length;o++){
                System.out.print("["+matriz[i][o]+"]");
            }
            System.out.println("");
        }
    }
}