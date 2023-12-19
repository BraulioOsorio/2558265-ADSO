import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombre = entrada.nextLine();
        boolean option=true;
        int salario[]=new int [12];
        while(option==true){
            System.out.println("----------------------------------------------");
            System.out.println("1: Registrar pago mensual - año 2019.");
            System.out.println("2: Ver Pago todos los meses - año 2019.");
            System.out.println("3: Ver Pago mes especifico.");
            System.out.println("4: Salir.");
            System.out.print("Ingrese una opcion: ");
            int continuar=entrada.nextInt();
            if(continuar==1){
                System.out.println("Ingrese un mes del año 2019 para realizar el pago");
                int pago = entrada.nextInt();
                System.out.println("Ingrese el pago para ese mes");
                int dinero=entrada.nextInt();
                salario[pago-1]=salario[pago-1]+dinero;
            }else if(continuar==2){
                int contador=1;
                int salario_anual=0;
                System.out.println("Usuario "+nombre+" este es su pago por mes");
                for(int i=0;i<12;i++){
                   System.out.println("Pago del mes "+contador+" es: "+salario[i]);
                   salario_anual=salario_anual+salario[i];
                   contador++;
                }
                System.out.println("Si queria saber este es su salario anual "+salario_anual);
            }else if(continuar==3){
                System.out.println("Que pago de que mes desea ver?");
                int mes_pago=entrada.nextInt();
                for(int i=0;i<12;i++){
                    if(i==mes_pago-1){
                        System.out.println("Este es el pago del mes "+mes_pago+": "+salario[i]);
                    }
                }
            }else if(continuar==4){
                option=false;
                System.out.println("Gracias "+nombre);
            }
        }
    }
}