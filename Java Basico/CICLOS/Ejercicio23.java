import java.util.Scanner;

public class Ejercicio23{
    public static void main (String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el valor total a financiar");
        double valor_financiar = entrada.nextInt();
        System.out.println("Ingrese la tasa de interes en %");
        double tasa_interes = entrada.nextInt();
        System.out.println("Ingrese la cantidad de cuotas");
        double cant_cuotas = entrada.nextInt();
        
        double interes = tasa_interes/100;
        double potencia = Math.pow(interes+1, cant_cuotas);
        double saldo = valor_financiar;
        for (int i=1; i<=cant_cuotas ; i++){
            double valor_cuota = valor_financiar*(potencia*interes)/(potencia-1);
            double valor_interes = saldo*interes;
            double abono_capi = valor_cuota-valor_interes;
            saldo = saldo-abono_capi;
            System.out.println("Cuota "+i+" : ");
            System.out.println("Valor de la cuota: "+valor_cuota);
            System.out.println("Valor del interes: "+valor_interes);
            System.out.println("Valor del abono capital: "+abono_capi);
            System.out.println("-> Deauda total: "+saldo);
            System.out.println("------------------------------------------------------");
        }
        
    }
}
