import java.util.Scanner;

public class Ejercicio13{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero de 1 al 168: ");
        int n = entrada.nextInt();
        int numero=n;
        int i=1;
        int h=1;
        int residuo=0;
        int contador=0;
        int random1=0;
        int random=0;
        while(i<=n){
            while(h<=numero){
                    random1 = (int)(Math.random()*1000+1);
                    random=random1;
                    int primos=0; 
                for(int f=1; f<=random; f++){
                       residuo = random%f;
                    if(residuo==0){
                        primos=primos+1;
                    }
                }if(primos<=2){
                    contador=contador+1;
                    System.out.println("Primo "+contador+" Generado es "+random);
                    h++;
                }
                 
                if(contador==n){
                    i=n+1;
                }
            }
        }
        
    }
}
