import java.util.Scanner;

public class Ejercicio22{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int lon = entrada.nextInt();
        int arreglo[]=new int[lon];
        System.out.println("Ingrese los valores para llenar el arreglo");
        for(int i=0;i<lon;i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        System.out.print("Arreglo: {");
        for(int i=0;i<lon;i++){
            System.out.print(arreglo[i]);
            if(i<lon-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println("");
        System.out.print("Posicion: ");
        int posicion=entrada.nextInt();
        if(posicion>0){
            int encontrar=0;
            for(int i=0;i<lon;i++){
                encontrar++;
                if(encontrar==lon){
                    posicion=posicion-lon;
                    encontrar=0;
                    i=0;
                }
                if(encontrar==posicion){
                    System.out.println("Valor: "+arreglo[i]);
                }
            }
        }else if(posicion<0){
            int encontrar=0;
            for(int i=lon-1;i>=0;i--){
                encontrar--;
                if(encontrar==i){
                    posicion=posicion+lon;
                    encontrar=0;
                    i=0;
                }
                if(encontrar==posicion){
                    System.out.println("Valor: "+arreglo[i]);
                }

            }
        }

    }
}