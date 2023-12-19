import java.util.Scanner;
public class Arreglos
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para generar el arreglo");
        int tamanio = entrada.nextInt();
        int arreglo [] = new int [tamanio];
        
        for (int i=0;i<tamanio;i++){
            System.out.println("ingrese el numero en la posicion "+i);
            int numero = entrada.nextInt();
            if (numero %2 == 0 ){
                for(int e=1; e<2;e++){
                    System.out.println("ingrese el numero en la posicion porque el pasado fue par "+i);
                    int numero1 = entrada.nextInt();
                    if(numero1 %2 ==0){
                        e=e-1;
                    }else{
                        e=2;
                        arreglo[i]=numero1;
                    }
                }
            }else{
                arreglo[i]=numero;
            } 
        }
        for(int i=0;i<tamanio;i++){
            System.out.println("El numero en el arrelo "+i+" Es:"+arreglo[i]);
        }
    }
}
