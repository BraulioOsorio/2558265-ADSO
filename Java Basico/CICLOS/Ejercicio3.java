import java.util.Scanner;
public class Ejercicio3{

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la alrura de la piramide: ");
        int altura = entrada.nextInt();
       
       for(int filas=1; filas<=altura; filas++){
            for(int e=1; e<=altura-filas; e=e+1){
                System.out.print(" ");
            }for(int j=2; j<=(filas*2); j=j+1){
                    System.out.print("X");
            }
            System.out.println("");
       }
    }
}