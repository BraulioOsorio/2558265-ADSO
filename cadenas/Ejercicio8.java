import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            int posicion = i - numero;
            if (posicion < 0) {
                posicion=posicion + frase.length();
            }
            nueva=nueva+frase.charAt(posicion);
        }
        System.out.println("La nueva frase es: " + nueva);
    }
}
