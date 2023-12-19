import java.util.Scanner;
public class Arreglos4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int aux=0;
            System.out.println("ingrese tamanio del arreglo");
            int tamanio=entrada.nextInt();
            int arreglo [] = new int [tamanio];
            for(int g=0;g<arreglo.length;g++){
                System.out.println("ingrese numeros para llenar el arreglo");
                arreglo[g]=entrada.nextInt();
            }
            System.out.println("Ingresado por usted");
            for (int w=0;w<arreglo.length;w++){
                System.out.print(arreglo[w]+" - ");
            }
            
            for(int m=0;m<arreglo.length;m++){
                for (int r=0;r<arreglo.length-1 ;r++){
                    if (arreglo[r]<arreglo[r+1]){
                        aux=arreglo[r];
                        arreglo[r]=arreglo[r+1];
                        arreglo[r+1]=aux;
                    }
                }
            }
            System.out.println("");
            for (int p=0;p<arreglo.length;p++){
                System.out.print(arreglo[p]+" - ");
            }
    }
}
