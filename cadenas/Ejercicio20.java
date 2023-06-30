import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int lon =entrada.nextInt();
        int arreglo[]=new int[lon];
        int arreglo2[]=new int[lon];
        int aux=0;
        System.out.println("ARREGLO 1");
        for(int i=0;i<lon;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("ARREGLO 2");
        for(int i=0;i<lon;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo2[i]=entrada.nextInt();
        }
        System.out.print("Arreglo 1: {");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]);
            if(i<arreglo.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.print("\nArreglo 2: {");
        for(int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]);
            if(i<arreglo2.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        
        for(int i=0;i<lon;i++){
            for (int r=0;r<lon-1 ;r++){
                if (arreglo[r]>arreglo[r+1]){
                    aux=arreglo[r];
                    arreglo[r]=arreglo[r+1];
                    arreglo[r+1]=aux;
                }
            }
        }
        for(int m=0;m<lon;m++){
            for (int r=0;r<lon-1 ;r++){
                if (arreglo2[r]>arreglo2[r+1]){
                    aux=arreglo2[r];
                    arreglo2[r]=arreglo2[r+1];
                    arreglo2[r+1]=aux;
                }
            }
        }
        int contador=0;
        for(int i=0;i<lon;i++){
            if(arreglo[i]==arreglo2[i]){
                contador++;
            }
        }
        
        if(contador==lon){
            System.out.println("\nResultado: Los arreglos son equivalentes.");
        }else if(contador!=lon){
            System.out.println("\nResultado: Los arreglos NO son equivalentes.");
        }

    }
}