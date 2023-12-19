import java.util.Scanner;
public class Ejercicio7{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);


        int numero=0;
        int numero2=0;
        int numero3=0;
        int numero_m=0;
        int resultado=0;
        System.out.println("Porfavor ingrese los tres numero par poder encontra el MCM");
        System.out.print("ingrese el Primer numero: ");
        numero = entrada.nextInt();
        System.out.print("ingrese el Segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("ingrese el Terser numero: ");
        numero3 = entrada.nextInt();

        numero_m=numero;
        if(numero2>numero_m){
            numero_m=numero2;
        }
        if(numero3>numero_m){
            numero_m=numero3;
        }
        resultado=numero_m;
        while((resultado%numero!=0)||(resultado%numero2!=0)||(resultado%numero3!=0)){
            resultado++;
        }
        System.out.println("el MCM de "+numero+", "+numero2+", "+numero3+" es "+resultado);
    }
}