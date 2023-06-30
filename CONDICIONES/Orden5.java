import java.util.Scanner;
    public class Orden5{
        public static void main(String[]args){
            Scanner entrada =new Scanner(System.in);
            System.out.println("Porfavor ingrese 3 numeros enteros");
            System.out.print("Primer numero:");
            int n1 = entrada.nextInt();
            System.out.print("Segundo numero:");
            int n2 = entrada.nextInt();
            System.out.print("Tercer numero:");
            int n3 = entrada.nextInt();
            if(n1>n2 && n1>n3){
                System.out.println("Los numeros ingresados no estan en orden ascendente");
            }else{
                System.out.println("Los nuemros ingresados estan en orden ascendente");
            }
        }
    }
