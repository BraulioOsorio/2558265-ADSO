import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar un nombre: ");
        String nombre = entrada.nextLine();
        int ultimo = nombre.length();
        for (int i=ultimo-1;i>=0;i--){
            int letra = nombre.charAt(i);
            char revers = (char) letra;
            System.out.print(revers);
        } 
        
    }
}
