import java.util.Scanner;

public class Ejercicio8{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        

        System.out.print("ingresar un numero de 6 digitos: ");
        int digito = entrada.nextInt();

        int n=0;
        
        int division=100000;    
         for(int i=1; i<=6; i++) { 
            int f=(digito/division)%10;
            if(f==0){
                division=division/10;
                
            }else if(f!=0){
                n=n+1;
                System.out.println("El digito "+n+" es "+f);
                division=division/10;
            }    
        }
       
        
        
        
    }
}