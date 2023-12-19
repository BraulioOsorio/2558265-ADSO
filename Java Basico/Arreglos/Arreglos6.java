import java.util.Scanner;
public class Arreglos6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Ingrese numero tamanio del array: ");
        int tamanio = entrada.nextInt();
        
        int array[] = new int[tamanio];
        int i=0;
        int cont_primos=0,cont_noPrimos=0;
        
        for (int t=0;t<tamanio;t++){
            int aleatorio = (int)(Math.random()*20);
            array[t]=aleatorio;
        } 
        

        System.out.print("Original: ");
        System.out.print("{");
			for (int n=0; n<array.length;n++) {
				System.out.print(((n==0)? "":",")+array[n]);
			}
		System.out.println("}");
		
        while (i<tamanio){
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int j=1;
            while (j<=array[i]){           
                if (array[i]%j==0){
                    acumulador++;
                }
                j++;
            }
            if (acumulador==2){
                cont_primos+=1;
                
            }else{
                cont_noPrimos+=1;
            }
            i++;
        }
        
        int primos[] = new int[cont_primos];
        int no_primos[] = new int[cont_noPrimos];
        int i_s=0;
        int i_p=0;
        int i_t=0;
        while (i_s<tamanio){
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int k=1;
            while (k<=array[i_s]){           
                if (array[i_s]%k==0){
                    acumulador++;
                }
                k++;
            }
            if (acumulador==2){
                primos[i_p]=array[i_s];
                i_p++;
                
            }else{
                no_primos[i_t]=array[i_s];
                i_t++;
            }
            i_s++;
        }
        
         System.out.print("Primos: ");
        System.out.print("{");
			for (int n=0; n<cont_primos;n++) {
				System.out.print(((n==0)? "":",")+primos[n]);
			}
		System.out.println("}");
        
         System.out.print("no Primos: ");
        System.out.print("{");
			for (int n=0; n<cont_noPrimos;n++) {
				System.out.print(((n==0)? "":",")+no_primos[n]);
			}
		System.out.println("}");
        
        
        
       System.out.println("N primos:"+cont_primos);
       System.out.println("N noPrimos:"+cont_noPrimos);
       
        
        
    }
}