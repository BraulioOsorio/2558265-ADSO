import java.util.Scanner;
public class Menu6{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int calculo;
        int digito;
        int opcion;

        System.out.print("Señor usuario ingrese un numero de 6 dijitos: ");
        digito=entrada.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("1-Primer digito  2-Segundo digito  3-Tercer dijito");
        System.out.println("4-Cuarto digito  5-Quinto digito   6-Sexto digito");
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese una opcion de las anteriores: ");
        opcion=entrada.nextInt();
        if(opcion==1){
            calculo=digito%10;
            System.out.println("El primer digito es: "+calculo);
        }else if(opcion==2){
            calculo=(digito/10)%10;
            System.out.println("El segundo digito es: "+calculo);
        }else if(opcion==3){
            calculo=(digito/100)%10;
            System.out.println("El tercer digito es: "+calculo);
        }else if(opcion==4){
            calculo=(digito/1000)%10;
            System.out.println("El cuarto digito es: "+calculo);
        }else if(opcion==5){
            calculo=(digito/10000)%10;
            System.out.println("El quinto digito es: "+calculo);
        }else if(opcion==6){
            calculo=(digito/100000)%10;
            System.out.println("El sexto dijito es: "+calculo);
        }else{
            System.out.println("Usted ingreso un numero que no existe en la lista asignada");
        }
    }
}