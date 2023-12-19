import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
         
        System.out.print("Ingrese area inicial en cm2: ");
        double area_inicial=entrada.nextInt();
        System.out.print("Ingrese area Total del metal a consumir: ");
        double area_total=entrada.nextInt();
        double creciendo=0;
        double decreciendo=0;
        double salir=0;
        double dias=0;
        while(area_total>salir){
            for(int w=1; w<=1; w++){
                dias=dias+0.5;
                creciendo=area_inicial*3;
                System.out.println("creciendo-> "+creciendo);
            }
            if(creciendo<area_total){
                for(int f=1; f<=1; f++){
                dias=dias+0.5;
                decreciendo=creciendo-(creciendo*0.30);
                System.out.println("Decreciendo-> "+decreciendo);
            }
            } 
            area_inicial=decreciendo;
            salir=salir+area_inicial; 
        }
        System.out.println("Dias-> "+dias);
        
        
        
        

    }
}
