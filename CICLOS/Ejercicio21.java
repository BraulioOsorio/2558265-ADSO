import java.util.Scanner;

public class Ejercicio21{

    public static void main(String []args){

        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un sueldo Total: ");
        float sueldo= entrada.nextInt();
        System.out.print("Cantidad de pagos: ");
        int pagos=entrada.nextInt();

        System.out.println("---------------FORMA DE PAGO---------------");
        System.out.println("           1. Pagos de igual valor");
        System.out.println("           2. Primer pago diferente.");
        System.out.println("           3. Ultimo pago diferente.");
        System.out.println("           4. Primer y Ultimo pago diferente.");
        System.out.print("Ingrese la forma de pago: ");
        int forma = entrada.nextInt();
        System.out.println("---------------SUS PAGOS SERAN---------------");

        if(forma==1){
            for(int i=1; i<=pagos; i++){
                double valor=sueldo/pagos;
                System.out.println("Mes "+i+" $ "+valor);
            }
        }else if(forma==2){
            for(int i=1; i<=pagos; i++){
                int pagos2=pagos+1;
                double valor=sueldo/pagos2;
                
                if(i==1){
                    double mayor= valor+valor;
                    System.out.println("Mes "+i+" $ "+mayor);
                }else{
                    System.out.println("Mes "+i+" $ "+valor);
                }
                    
                
            }
        }else if(forma==3){
            for(int i=1; i<=pagos; i++){
                int pagos2=pagos+1;
                double valor=sueldo/pagos2;
                
                if(i==pagos){
                    double mayor= valor+valor;
                    System.out.println("Mes "+i+" $ "+mayor);
                }else{
                    System.out.println("Mes "+i+" $ "+valor);
                }
                    
                
            }


        }else if(forma==4){
            for(int i=1; i<=pagos; i++){
                int pagos2=pagos+2;
                double valor=sueldo/pagos2;
                
                if(i==1 || i==pagos){
                    double mayor= valor+valor;
                    System.out.println("Mes "+i+" $ "+mayor);
                }else{
                    System.out.println("Mes "+i+" $ "+valor);
                }
                    
                
            }

        }
    }
}