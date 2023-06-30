import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        System.out.print("Ingrese las filas de la Matriz = ");
        int filas=entrada.nextInt();
        System.out.print("Ingrese las columnas de la Matriz = ");
        int columnas=entrada.nextInt();
        int matriz[][] = new int [filas][columnas];
        int mitad=0;
        
        for(int i=0;i<matriz.length;i++){
            for(int w=0;w<matriz[i].length;w++){
                int aleatorio = (int)(Math.random()*89+10);
                matriz[i][w]=aleatorio;
                mitad=mitad+1;
                System.out.print("["+matriz[i][w]+"]");
            }
            System.out.println("");
        }
        int mitad2=mitad/2;
        if(mitad%2==0){
            int arreglo[]=new int [mitad2];
            int arreglo1[]=new int [mitad2];
            System.out.print("\nArreglo 1{");
            for(int w=0;w<matriz.length/2;w++){
                for(int u=0; u<matriz[w].length;u++){
                    arreglo[u]=matriz[w][u];
                    System.out.print("["+arreglo[u]+"]"); 
                }
            }
            System.out.println("}");
            System.out.println("");
            System.out.print("\nArreglo 2{");
            for(int w=matriz.length/2;w<matriz.length;w++){
                for(int u=0; u<matriz[w].length;u++){
                    arreglo1[u]=matriz[w][u];
                    System.out.print("["+arreglo1[u]+"]"); 
                }
            }
             System.out.println("}");
        }else{
            System.out.print("\nArreglo 1{");
            int arreglo[]=new int [mitad2+1];
            int arreglo1[]=new int [mitad2];
            for(int w=0;w<matriz.length/2+1;w++){
                for(int u=0; u<matriz[w].length;u++){
                    arreglo[u]=matriz[w][u];
                    System.out.print("["+arreglo[u]+"]"); 
                }
            }
            System.out.println("}");
            System.out.println("");
            System.out.print("\nArreglo 2{");
            for(int w=matriz.length/2+1;w<matriz.length;w++){
                for(int u=0; u<matriz[w].length;u++){
                    arreglo1[u]=matriz[w][u];
                    System.out.print("["+arreglo1[u]+"]"); 
                }
            }
            System.out.println("}");
        }
        
    }
}