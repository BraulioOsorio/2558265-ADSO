import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cantidad de Materias");
        int notas = entrada.nextInt();

        float promedio=0;
        float creditos=0;

        for(int i=1; i<=notas; i++ ){
            System.out.print("Nota Materia "+i+": ");
            float materia = entrada.nextFloat();

            System.out.print("Creditos de la Materia "+i+": ");
            float credito = entrada.nextFloat();
            promedio=promedio + (materia*credito);
            creditos=creditos+credito;
        }
        float total =promedio/creditos;
        System.out.println("Total de creditos: "+creditos);
        System.out.println("Promedio del semestre: "+total);
        
    }
}