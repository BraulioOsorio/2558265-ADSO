import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int tamano=entrada.nextInt();
        entrada.nextLine();
        String arreglo[]=new String[tamano];
        for(int i=0;i<tamano;i++){
            System.out.print("Ingrese el nombre del usuario "+(i+1)+" ");
            arreglo[i]=entrada.nextLine();
        }
        System.out.println("Arreglo original");
        for(int i=0;i<tamano;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
        System.out.println("");
        for (int i=0;i<tamano;i++) {
            for (int j=i+1;j<arreglo.length;j++) {
                if(arreglo[i].compareTo(arreglo[j])>0){
                    String temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        System.out.println("Arreglo Ordenado");
        for(int i=0;i<tamano;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}