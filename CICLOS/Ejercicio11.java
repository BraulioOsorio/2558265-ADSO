import java.util.Scanner;

public class Ejercicio11{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int random=0;
        int i=1;
        int resultado=0;
        System.out.print("Ingrese un numero del 1 al 6: ");
        int n = entrada.nextInt();
        System.out.print("El resultado Construido es: ");
        if(n==1){
            while(i<=1){
                random = (int)(Math.random()*10); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else if(n==2){
            while(i<=1){
                random = (int)(Math.random()*100); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else if(n==3){
            while(i<=1){
                random = (int)(Math.random()*1000); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else if(n==4){
            while(i<=1){
                random = (int)(Math.random()*10000); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else if(n==5){
            while(i<=1){
                random = (int)(Math.random()*100000); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else if(n==6){
            while(i<=1){
                random = (int)(Math.random()*1000000); 
                i++;
            }System.out.print(random);
            resultado=random*2;
            System.out.println("");
            System.out.print("resultado producto: "+resultado);
        }else{
            System.out.println("Es invalido porque debe estar en un rango del 1 al 6");
        }


            
    }
}