import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int n1=1;
        int e=1;
        System.out.print("ingrese el numero inicial ->");
        int numero = entrada.nextInt();
        System.out.print("Ingrese el numero final ->");
        int numero2 = entrada.nextInt();

        for(int i=numero;i<=numero2; i++){
            while(e<=i){
                n1=n1*e;
                e++;
            }System.out.println("Factorial de "+i+" ("+i+" !) : "+n1);
        }
    }
}