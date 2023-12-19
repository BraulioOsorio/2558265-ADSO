import java.util.Scanner;

public class Ejercicio23{
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero de palabras para llenar el arreglo");
        int numero = entrada.nextInt();
        entrada.nextLine();
        String cadena[]= new String[numero];
        for(int i=0;i<cadena.length;i++){
            System.out.println("Ingrese la palabra o las palabras para el espacio numero "+i);
            cadena[i]=entrada.nextLine();
        }
        System.out.print("Arreglo: {");
        for(int i=0;i<cadena.length;i++){
            System.out.print("'"+cadena[i]+"'");
            if(i<numero-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println("Ingrese la palabra a buscar");
        String buscar = entrada.nextLine();
        int veces=0;
        
        System.out.println("La palabra a buscar es: "+buscar);
        for(int i=0;i<cadena.length;i++){
            if(cadena[i].indexOf(buscar)>=0){
                veces++;
                System.out.println("-> Posicion "+i+": "+cadena[i]);
            }
        }
        System.out.println("Solo la palabra "+buscar+" se encontro en "+veces+" veces.");
        
    }
}