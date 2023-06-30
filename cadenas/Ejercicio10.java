import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero para crear un arreglo: ");
        int tamano = entrada.nextInt();
        int arreglo[]=new int[tamano];
        for(int i=0;i<tamano;i++){
            int numero = (int) (Math.random()*100+1);
            if(numero%2==0){
                arreglo[i]=numero;
            }else{
                i--;
            }
        }
        for(int i=0;i<tamano;i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }
}