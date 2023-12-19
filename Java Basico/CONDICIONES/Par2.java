import java.util.Scanner;

public class Par2{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese un numeros");
        int numero= entrada.nextInt();
        if(numero%2==0){
            System.out.println("este numero es par: "+ numero);
        }else{
            System.out.println("este numero es impar: " + numero);
        }
    }
}