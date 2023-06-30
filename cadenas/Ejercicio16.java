import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int aux=0;
            System.out.println("ingrese tamanio del arreglo");
            int tamanio=entrada.nextInt();
            int arreglo [] = new int [tamanio];
            for(int g=0;g<arreglo.length;g++){
                System.out.println("ingrese numeros para lenar el arreglo");
                arreglo[g]=entrada.nextInt();
            }
            for(int m=0;m<tamanio;m++){
                for (int r=0;r<tamanio-1 ;r++){
                    if (arreglo[r]>arreglo[r+1]){
                        aux=arreglo[r];
                        arreglo[r]=arreglo[r+1];
                        arreglo[r+1]=aux;
                    }
                }
            }
            System.out.println("numero ingresados por usted ordenados");
            for (int p=0;p<tamanio;p++){
                System.out.print(arreglo[p]+" - ");
            }
            
            System.out.println("\nIngrese la posicion");
            int posicion = entrada.nextInt();
            System.out.println("---------------------");
            for(int i=posicion;i>=0;i--){
                System.out.print(arreglo[i]+" - ");
            }
            for(int h=arreglo.length-1;h>posicion;h--){
                System.out.print(arreglo[h]+((h!=posicion+1)?" - ":""));

            }
        
    }
}
