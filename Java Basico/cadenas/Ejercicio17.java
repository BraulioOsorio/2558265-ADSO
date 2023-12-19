import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int tamanio = entrada.nextInt();
        int arreglo[]=new int[tamanio];
        int pares=0;
        int impares=0;
        for(int i=0;i<tamanio;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        for(int i=0;i<tamanio;i++){
            if(arreglo[i]%2==0){
                pares++;
            }else{
                impares++;
            }
        }
        int numeros_pares[]=new int[pares];
        int numeros_impares[]=new int[impares];
        int cuenta_pares=0;
        int cuenta_impares=0;
        for(int i=0;i<tamanio;i++){
            if(arreglo[i]%2==0){
                numeros_pares[cuenta_pares]=arreglo[i];
                cuenta_pares++;
            }else{
                numeros_impares[cuenta_impares]=arreglo[i];
                cuenta_impares++;
            }
        }
        System.out.print("Arreglo Original: {");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]);
            if(i<arreglo.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        if(pares>0){
            System.out.print("\nArreglo Pares : {");
            for(int i=0;i<numeros_pares.length;i++){
                System.out.print(numeros_pares[i]);
                if(i<numeros_pares.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("} - Longitud: "+pares);
        }
        if(impares>0){
            System.out.print("\nArreglo Impares : {");
            for(int i=0;i<numeros_impares.length;i++){
                System.out.print(numeros_impares[i]);
                if(i<numeros_impares.length-1){
                    System.out.print(",");
                }
            }
        System.out.print("} - Longitud: "+impares);
        }
    }
}