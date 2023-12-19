import java.util.Scanner;
public class Ejercicio4{

    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        for(int i=1; i<=10000; i++){
            System.out.println("|----------Bienvenido----------|");
            System.out.println("|                              |");
            System.out.println("|  1.Docente                   |");
            System.out.println("|  2.Estudiante                |");
            System.out.println("|  3.Salir                     |");
            System.out.println("|------------------------------|");
            System.out.print(" Ingrese una opcion: ");

        int menu = entrada.nextInt();
            if(menu==1 ){
                System.out.print("Ingrese cantidad de Materias: ");
                int notas = entrada.nextInt();

                float promedio=0;
                float creditos=0;
                for(int a=1; a<=notas; a++ ){
                    System.out.print("Nota Materia "+a+": ");
                    float materia = entrada.nextFloat();

                    System.out.print("Creditos de la Materia "+a+": ");
                    float credito = entrada.nextFloat();
                    promedio=promedio + (materia*credito);
                    creditos=creditos+credito;
                }
                float total =promedio/creditos;
                System.out.println("Total de creditos: "+creditos);
                System.out.println("Promedio del semestre: "+total);
            }else if(menu==2){
                System.out.println("Ingrese cantidad de Materias");
                int notas = entrada.nextInt();

                float promedio=0;

                for(int f=1; f<=notas; f++ ){
                    System.out.print("Nota Materia "+f+": ");
                    float materia = entrada.nextFloat();

                    promedio=promedio+materia;
                }
                float total = promedio/notas;
                System.out.println("Promedio obtenido: "+total);
            }else if(menu==3){
                i=100;
            }

        }
    }
}