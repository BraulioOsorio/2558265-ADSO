import java.util.Scanner;

public class Ejercicio6{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        int n1=0;
        int n2=1;
        int n3=0;
        int mayor=0;

        System.out.print("Ingrese un numero para encontrarlo en la Sucesion Fibonacci: ");
        int numero = entrada.nextInt();

        

        for(int i=1; i<=numero; i++){
            n3= n1+n2;
            n1=n2;
            n2=n3;   
            n3=n2-n1;
          
        }
        mayor=mayor+n3;
        System.out.print("El numero "+numero+" en la sucesion Fibonacci es: "+mayor);
        
        
        
        
    }
}