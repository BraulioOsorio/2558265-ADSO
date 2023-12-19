import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la dimencion para el primer arreglo: ");
        int lon1 = entrada.nextInt();
        int arreglo1[] = new int[lon1];
        System.out.println("Ingrese los datos para el primer arreglo");
        for(int i=0;i<lon1;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo1[i]=entrada.nextInt();
        }

        System.out.print("Ingrese la dimencion para el segundo arreglo: ");
        int lon2 = entrada.nextInt();
        int arreglo2[] = new int[lon2];
        System.out.println("Ingrese los datos para el segundo arreglo");
        for(int i=0;i<lon2;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo2[i]=entrada.nextInt();
        }
        int arreglo3[]=new int[lon1+lon2];
        
        if(lon1==lon2){
            int contador=0;
            for(int i=0;i<lon1;i++){
                arreglo3[contador]=arreglo1[i];
                contador++;
                arreglo3[contador]=arreglo2[i];
                contador++;
            }
        }else if(lon1>lon2){
            int iterador=0;
            int segundo_iterador=0;
            int llenar=0;
            while(iterador<lon1){
                if(segundo_iterador==lon2){
                    segundo_iterador=0;
                }
                arreglo3[llenar]=arreglo1[iterador];
                if(llenar<arreglo3.length-1){
                    llenar++;
                }
                arreglo3[llenar]=arreglo2[segundo_iterador];
                if(llenar<arreglo3.length-1){
                    llenar++;
                }
                
                segundo_iterador++;
                iterador++;
            }
        }else if(lon1<lon2){
            int iterador=0;
            int segundo_iterador=0;
            int llenar=0;
            while(iterador<lon2){
                if(segundo_iterador==lon1){
                    segundo_iterador=0;
                }
                arreglo3[llenar]=arreglo2[iterador];
                if(llenar<arreglo3.length-1){
                    llenar++;
                }
                arreglo3[llenar]=arreglo1[segundo_iterador];
                if(llenar<arreglo3.length-1){
                    llenar++;
                }
                segundo_iterador++;
                iterador++;
            }
        }
        System.out.print("Arreglo 1: {");
        for(int i=0;i<arreglo1.length;i++){
            System.out.print(arreglo1[i]);
            if(i<arreglo1.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println("");
        System.out.print("Arreglo 2: {");
        for(int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]);
            if(i<arreglo2.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println("");
        System.out.print("Arreglo 3: {");
        for(int i=0;i<arreglo3.length;i++){
            System.out.print(arreglo3[i]);
            if(i<arreglo3.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}