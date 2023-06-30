import java.util.Scanner;
public class Arreglos1
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para generar el arreglo");
        int tamanio = entrada.nextInt();
        int arreglo [] = new int [tamanio];
        
        for (int i=0;i<tamanio;i++){
            for(int r=1;r<2;r++){
                int randon = (int) (Math.random()*100);
                if(randon %2 == 0){
                    r=r-1;
                }else{
                    arreglo[i]=randon;
                    r=2;
                }
                
            }
        } 
        for(int i=0;i<tamanio;i++){
            System.out.println("En la posicion "+i+" Esta el impar "+arreglo[i]);
        }
        
    }
}
