import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        int n1=0;
        int n2=1;
        int n3=0;

        System.out.print("Ingrese un numero para mostrar la Sucesion Fibonaccio: ");
        int numero = entrada.nextInt();

        
        System.out.print("La sucesion Fibonacci es: ");
        for(int i=1; i<=numero; i++){
            
            System.out.print(", "+n1);
            n3= n1+n2;
            n1=n2;
            n2=n3;

        
        }
        
        
    }
}