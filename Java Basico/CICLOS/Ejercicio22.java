import java.util.Scanner;
public class Ejercicio22{
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la cantidad financiada: ");
        int cantidad=entrada.nextInt();
        System.out.print("\nCantidad de cuotas pagadas: ");
        int cuotas=entrada.nextInt();
        System.out.print("\nIngrese el valor de cada cuota: ");
        int valor=entrada.nextInt();
        int pago=0;
        for(int i=1; i<=cuotas; i++){
            pago=pago+valor;
            System.out.print("\nEsto fue lo que usted pago el mes "+i+" "+valor);
        }
        System.out.print("\nPago total: "+pago);
        float intereses=pago-cantidad;
        float porcentaje=intereses/cantidad;
        System.out.print("\nTotal de intereses pagados: "+intereses);
        System.out.print("\nen promedio seria: "+porcentaje+"%");
    }
}
