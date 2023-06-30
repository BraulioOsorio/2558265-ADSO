import java.util.Scanner;
    public class Menor4{
        public static void main(String[]args){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Porfavor ingrese 3 numeros enteros");
            System.out.println("Ingrese el primer valor");
            int n1=entrada.nextInt();
            System.out.println("Ingrese el segundo valor");
            int n2=entrada.nextInt();
            System.out.println("Ingrese el tercer valor");
            int n3=entrada.nextInt();
            if(n1>n2 && n1>n3){
                System.out.println("Este es el numero mayor: "+n1);
            }else if(n2>n1 && n2>n3){
                System.out.println("Este es el numero mayor: "+n2);
            }else{
                System.out.println("Este es el nuemro mayor: "+n3);
            }
            if(n1<n2 && n1<n3){
                System.out.println("Este es el numero menor: "+n1);
            }else if(n2<n1 && n2<n3){
                System.out.println("Este es el numero menor: "+n2);
            }else{
                System.out.println("Este es el nuemro menor: "+n3);
            }
        }

        
    }