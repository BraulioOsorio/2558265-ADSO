import java.util.Scanner;
public class Ejercicio17{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero Impar:");
        int numero = entrada.nextInt();
        int impar=0;
        impar=numero%2;
        int dividido=0;
        dividido=numero/2;
        if(impar>0){
            for (int i=0; i<=dividido; i++) {
                for (int a=1; a<=dividido-i+1; a++) {
                    System.out.print(" ");
                }
                for (int a=0; a<=(i*2);a++) {
                    System.out.print("X");
                }
                System.out.println("");
            }

            for (int i=0; i<=dividido; i++) {
                for (int a=0; a<=i+1; a++) {
                    System.out.print(" ");
                }
                for (int a=(dividido-i)*2-1; a>0; a--) {
                    System.out.print("X");
                }
                System.out.println("");
            }
        }else{
             System.out.print("El numero ingresado no es impar");
        }
        
    }
}