import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese cuantos usuarios son: ");
        int usuarios=entrada.nextInt();
        entrada.nextLine();
        String nombres[]=new String[usuarios];
        int contador=1;
        int mujer=0;
        int hombre=0;
        int genero_juntos[]= new int[usuarios];
        for(int i=0;i<usuarios;i++){
            System.out.println("Ingrese el nombre del usuario Nª "+contador);
            String nombre=entrada.nextLine();
            nombres[i]=nombre;
            System.out.println("Si es mujer ingrese 1");
            System.out.println("Si es Hombre ingrese 2");
            int genero = entrada.nextInt();
            entrada.nextLine();
            if(genero==1){
                genero_juntos[i]=genero;
                mujer++;
            }else if(genero==2){
                genero_juntos[i]=genero;
                hombre++;
            }
            contador++;
        }
        String mujeres[]= new String[mujer];
        String hombres[]= new String[hombre];
        int contandoH=0;
        int contandoM=0;
        String resultado[]= new String[usuarios];
        for(int i=0;i<usuarios;i++){
            if(genero_juntos[i]==1){
                mujeres[contandoM]=nombres[i];
                resultado[i]="[ "+mujeres[contandoM]+" -> Mujer ]";
                contandoM++;
            }else if(genero_juntos[i]==2){
                hombres[contandoH]=nombres[i];
                resultado[i]="[ "+hombres[contandoH]+" -> Hombre ]";
                contandoH++;
            }
        }
        System.out.println("---------------------------");
        for(int i=0;i<usuarios;i++){
            System.out.println(resultado[i]);
        }
    }
}