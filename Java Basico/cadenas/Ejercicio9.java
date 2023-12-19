import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la Primera palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.print("Ingrese la Segunda palabra: ");
        String palabra2 = entrada.nextLine();
        int diametro1=palabra1.length();
        int diametro2=palabra2.length();
        if(diametro1==diametro2){
            for(int i=0;i<diametro1;i++){
                System.out.print(palabra1.charAt(i));
                System.out.print(palabra2.charAt(i));
            }
        }else if(diametro1>diametro2){
            int iterador=0;
            int segundo_iterador=0;
            while(iterador<diametro1){
                if(segundo_iterador==diametro2){
                    segundo_iterador=0;
                }
                System.out.print(palabra1.charAt(iterador));
                System.out.print(palabra2.charAt(segundo_iterador));
                segundo_iterador++;
                iterador++;
            }
        }else if(diametro1<diametro2){
            int iterador=0;
            int segundo_iterador=0;
            while(iterador<diametro2){
                if(segundo_iterador==diametro1){
                    segundo_iterador=0;
                }
                System.out.print(palabra1.charAt(segundo_iterador));
                System.out.print(palabra2.charAt(iterador));
                segundo_iterador++;
                iterador++;
            }
        }
    }
}