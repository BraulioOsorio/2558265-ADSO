import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        System.out.print("Ingrese un numero maximo de 6 digitos-> ");
        int numero = entrada.nextInt();
        int guardar=numero;
        int invertido=0;
        int cambiar=0;

        while(numero!=0){
            cambiar=numero%10;
            invertido=(invertido*10)+cambiar;
            numero=numero/10;
        }
        if(invertido==guardar){
            System.out.println("El numero SI es PALINDROMO");
        }else{
            System.out.println("El numero NO es PALINDROMO");
        }
        
    }
}