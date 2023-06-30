import java.util.Scanner;

public class Cartesiano3{
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        System.out.println("señor usuario ingrese valor de la cordenada X");
        int x=entrada.nextInt(); 
        System.out.println("señor usuario ingrese valor de la cordenada Y");
        int y=entrada.nextInt();
        
        if(x>=1 && y>=1){
            System.out.println("Esta en el cuadrante 1");
        }else if(x<=-1 && y>=1 ){
            System.out.println("Esta en el cuadrante 2");
        }else if(x<=-1 && y<=-1){
            System.out.println("Esta en el cuadrante 3");
        }else if(x>=1 && y<=-1){
            System.out.println("Esta en el cuadrante 4");
        }else if(x==0 && y==0){
            System.out.println("No esta en ningun cuadrante");
        }else if(x==0 && y>=1){
            System.out.println("No esta en ningun cuadrante su numero esta ubicado en Y: " + y);
        }else if(x==0 && y<=-1){
            System.out.println("No esta en ningun cuadrante su numero esta ubicado en Y: " + y);
        }else if(x>=1 && y==0){
            System.out.println("No esta en ningun cuadrante su numero esta ubicado en X: " + x);
        }else if(x<=-1 && y==0 ){
            System.out.println("No esta en ningun cuadrante su numero esta ubicado en X: " + x);
        }
    }  
}
        