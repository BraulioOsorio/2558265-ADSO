import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("->Ingrese un numero");
        int n = entrada.nextInt();
        int X=2;
        
        for (int f=1; f<=(n*n); f++ ){ 
            
            int divisores= 0;
            for(int j = 1; j<= X ; j++){
                int mod = X%j;
                if (mod == 0){
                    divisores = divisores + 1;    
                }
            }
            if (divisores<=2){
                System.out.print(" ["+((X<10)?"00":((X<100)?"0":""))+X+"] "+((f%n==0)?"\n":""));
            }else{
                //Que hacer en caso de que no sea primo 
                f=f-1;
            }
            X++;
            
        }
    }
}


