import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        System.out.print("Hola señ@r usuario por favor");
        System.out.print("ingrese su edad:");
        int edad= entrada.nextInt();
        if( edad>0 && edad <17){
            System.out.println("Señ@r usuario su auxilio de transporte es de: 800000 porque su edad es de: "+ edad);
        }else if(edad>150 ){
            System.out.println("Señ@r usuario la edad ingresada no es validad");
        }else if(edad>=18 && edad<150){
            System.out.println("Señ@r usuario usted debe pagar 200000 porque su edad es de: "+ edad);
        }else{
             System.out.println("Señ@r usuario su edad ingresada es invalidad");
            
        }
    }
}