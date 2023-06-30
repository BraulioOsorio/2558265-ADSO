import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean palindromo=false;
        System.out.println("Ingrese palabra");
        String oracion = entrada.nextLine();
        int ultimo = oracion.length();
        int i=0;
        for (int k=ultimo-1;k>=0;k--){
            int letra1 = oracion.charAt(i);
            int letra2 = oracion.charAt(k);
            if (letra1 == letra2){
                palindromo=true;
            }else if (letra1!=letra2){
                palindromo=false;
                break;
            } 
            i++;
        }
        if (palindromo==true){
            System.out.println("La palabra "+oracion+" palindroma");
        }else{
            System.out.println("La palabra "+oracion+"NO es palindroma");
        } 
    }
}