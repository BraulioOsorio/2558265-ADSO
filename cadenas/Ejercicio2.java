import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oracion");
        String cadena = entrada.nextLine();
        System.out.print("Oración invertida: ");
        int number = 32;
        for (int i=0;i<cadena.length();i++){
            int numero = cadena.charAt(i);
            if(numero >= 65 && numero <= 90){
                number+=numero;
                char texto = (char) number;
                System.out.print(texto);
            }else if(numero >= 97 && numero <=122 ){
                numero = numero-number;
                char texto = (char) numero;
                System.out.print(texto);
            }else{
                char texto = (char) numero;
                System.out.print(texto);
            }
            number=32;
        }
    }
}