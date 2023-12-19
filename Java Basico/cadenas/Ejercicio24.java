import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese el tamaño del String: ");
        int numero=entrada.nextInt();
        entrada.nextLine();
        String arreglo[]=new String[numero];
        for(int i=0;i<numero;i++){
            System.out.print("Ingrese la palabra para la posicion Nª "+i);
            String palabra=entrada.nextLine();
            arreglo[i]=palabra;
        }
        System.out.print("Arreglo { ");
        for(int i=0;i<numero;i++){
            System.out.print("'"+arreglo[i]+"'");
            if(i<numero-1){
                System.out.print(",");
            }
        }
        System.out.println(" }");
        boolean mas=true;
        while(mas=true){
            System.out.println("Posicion que desea eliminar:");
            int posicion=entrada.nextInt();
            arreglo[posicion]="";
            System.out.print("Arreglo { ");
            for(int i=0;i<numero-1;i++){
                if(arreglo[i]==""){
                    arreglo[i]=arreglo[i+1];
                    arreglo[i+1]="";
                }
            }
            for(int i=0;i<numero;i++){
                
                System.out.print("'"+arreglo[i]+"'");
                if(i<numero-1){
                    System.out.print(",");
                }
            }
            System.out.println(" }");
            System.out.println("Desea eliminar otra posicion?");
            System.out.println("1=SI----------------2=NO");
            int si = entrada.nextInt();
            if(si==1){
               mas=true; 
            }else{
                break;
            }
        }
    }
}