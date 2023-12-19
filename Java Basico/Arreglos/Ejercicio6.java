import java.util.Scanner;
public class Ejercicio6
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int tamanio = entrada.nextInt();
        int arreglo [] = new int [tamanio];
        int primos=0;
        int noprimos=0;
        for (int i=0;i<arreglo.length;i++){
            for(int k=0;k<i;k++){
                int acumulado=0;
                int r=1;
                while(r<=i){
                    if(i%r==0){
                       acumulado++;
                    }
                    r++;
                    if(acumulado==2){
                        primos++;
                    }else{
                        noprimos++;
                    }
                }
                
            }
        }
        
        System.out.println(primos);
        System.out.println(noprimos);
        int primoss[] = new int [primos];
        int noprimoss[] = new int [noprimos];
        
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=i+1;
            for(int k=0;k<i;k++){
                int acumulado=0;
                int r=1;
                while(r<=i){
                    if(i%r==0){
                       acumulado++;
                    }
                    r++;
                }
                if(acumulado==2){
                    primoss[i]=i+1;
                }else{
                    noprimoss[i]=i+1;
                }
                k++;
            }
        }
        for(int i=0;i<tamanio;i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("\n-------------------------------");
        for(int i=0;i<primos;i++){
            System.out.print("["+primoss[i]+"]");
        }
        System.out.println("\n-------------------------------");
        for(int i=0;i<noprimos;i++){
            System.out.print("["+noprimoss[i]+"]");
        }
        
    }
}
// 
