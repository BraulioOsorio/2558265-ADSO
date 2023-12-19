import java.util.Scanner;
public class Arreglos2
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para generar el arreglo");
        int tamanio = entrada.nextInt();
        int arreglo [] = new int [tamanio];
        
        for (int i=0;i<tamanio;i++){
            for(int k=1;k<2;k++){
                int randon = (int) (Math.random()*1000);
                int acumulado=0;
                int r=1;
                while(r<=randon){
                    if(randon%r==0){
                       acumulado++;
                    }
                    r++;
                }
                if(acumulado==2){
                    arreglo[i]=randon;
                    k=2;
                }else{
                    k--;
                }
            }
        }
        for(int i=0;i<tamanio;i++){
            System.out.println("["+arreglo[i]+"]");
        }
        
    }
}
