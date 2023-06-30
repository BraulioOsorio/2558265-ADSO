
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count_vocal=0;
        System.out.println("Digite una oracion");
        String cadena = entrada.nextLine();
        for (int i=0;i<cadena.length();i++){
            if (((cadena.charAt(i)) == 'a' || (cadena.charAt(i)) == 'A' ) || ((cadena.charAt(i)) == 'e' || (cadena.charAt(i)) == 'E') || ((cadena.charAt(i)) == 'i' || (cadena.charAt(i)) == 'I') || ((cadena.charAt(i)) == 'o' || (cadena.charAt(i)) == 'O') || ((cadena.charAt(i)) == 'u' || (cadena.charAt(i)) == 'U') ){
                count_vocal++;
            }
        }
        System.out.println(count_vocal);
    }
}