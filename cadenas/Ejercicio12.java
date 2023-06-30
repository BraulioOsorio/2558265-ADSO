import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int tamano = entrada.nextInt();
        int arreglo[]=new int[tamano];
        for(int i=0;i<tamano;i++){
            int num = (int) (Math.random()*100+1);
            arreglo[i]=num;
        }
        for(int i=0;i<tamano;i++){
            for(int j=0;j<tamano-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int auxi = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxi;
                }
            }
        }
        for(int i=0;i<tamano;i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }
}