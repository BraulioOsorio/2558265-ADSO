import java.util.Scanner;
public class Ejercicio20{
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese un numero-> ");
        int numero = entrada.nextInt();
        int k=0;
          for(int i=1; i<=numero;i++){
            for(k=1;k<=(numero);k++){
                int entero=0;   
                entero+=k;
                System.out.print(entero)  ; 
            }
            System.out.println("");
        }
    }
}