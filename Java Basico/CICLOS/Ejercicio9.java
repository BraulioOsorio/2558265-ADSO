import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero para ver si es un numero primo o no lo es: ");
        int numero = entrada.nextInt();
        int primos=0;
         for(int i=1; i<=numero; i++){
            int residuo = numero%i;

            if(residuo==0){
                primos=primos+1;
            }
         }
         if(primos<=2){
            System.out.println("El numero "+numero+" es primo");

         }else{
            System.out.println("El numero "+numero+" no es primo");
         }
    }
}