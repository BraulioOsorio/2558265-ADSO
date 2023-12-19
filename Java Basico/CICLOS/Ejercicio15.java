import java.util.Scanner;

public class Ejercicio15{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero para encontrar el factorial: ");
        int numero = entrada.nextInt();
        int n3 =1;
        for(int i=1; i<=numero; i++){
            System.out.print(" x "+i);
            n3=n3*i;

        }System.out.print(" : "+n3);
    }
}