import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cantidad de Materias");
        int notas = entrada.nextInt();

        float promedio=0;

        for(int i=1; i<=notas; i++ ){
            System.out.print("Nota Materia "+i+": ");
            float materia = entrada.nextFloat();

            promedio=promedio+materia;
        }
        float total = promedio/notas;
        System.out.println("Promedio obtenido: "+total);
        
    }
}