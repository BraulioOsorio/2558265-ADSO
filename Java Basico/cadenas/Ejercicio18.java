import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la longitud para el arreglo: ");
        int tamanio=entrada.nextInt();
        int arreglo[]=new int[tamanio];
        int primos=0;
        int noprimos=0;
        for(int i=0;i<tamanio;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        for (int i=0;i<tamanio;i++){
            int numero=(int)(arreglo[i]);
            int acumulado=0;
            int r=1;
            while(r<=numero){
                if(numero%r==0){
                    acumulado++;
                }
                r++;
            }
            if(acumulado==2){
                primos++;
            }else{
                noprimos++;
            }
        }
        int numeros_primos[]=new int[primos];
        int numeros_noprimos[]=new int[noprimos];
        int numeropri=0;
        int numeronopri=0;
        for (int i=0;i<tamanio;i++){
            int numero=(int)(arreglo[i]);
            int acumulado=0;
            int r=1;
            while(r<=numero){
                if(numero%r==0){
                    acumulado++;
                }
                r++;
            }
            if(acumulado==2){
                numeros_primos[numeropri]=numero;
                numeropri++;
            }else if(acumulado!=2){
                numeros_noprimos[numeronopri]=numero;
                numeronopri++;
            }
        }
        System.out.print("Arreglo Original: {");
        for(int i=0;i<tamanio;i++){
            System.out.print(arreglo[i]);
            if(i<tamanio-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        if(primos>0){
            System.out.print("\nArreglo Primos: {");
            for(int i=0;i<numeros_primos.length;i++){
                System.out.print(numeros_primos[i]);
                if(i<numeros_primos.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("} - Longitud: "+primos);
        }
        if(noprimos>0){
            System.out.print("\nArreglo Norimos: {");
            for(int i=0;i<numeros_noprimos.length;i++){
                System.out.print(numeros_noprimos[i]);
                if(i<numeros_noprimos.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("} - Longitud: "+noprimos);
        }
    }
}