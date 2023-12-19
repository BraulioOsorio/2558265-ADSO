import java.util.Scanner;

public class Maximo7 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        int moneda=0;

       System.out.println("ingrese un numero mayor a 10 dijitos y menor a dos mil millones ");
       moneda=entrada.nextInt();

        int moneda1 =moneda%10;
        int moneda2 =(moneda/10)%10;
        int moneda3 =(moneda/100)%10;
        int moneda4 =(moneda/1000)%10;
        int moneda5 =(moneda/10000)%10;
        int moneda6 =(moneda/100000)%10;
        int moneda7 =(moneda/1000000)%10;
        int moneda8 =(moneda/10000000)%10;
        int moneda9 =(moneda/100000000)%10;
        int moneda10=(moneda/1000000000)%10;

       if(moneda>=1000 && moneda<10000){
        System.out.println("Valor:"+moneda4+ "."+moneda3+moneda2+moneda1);
       }else if(moneda>10000 && moneda<100000){
        System.out.println("Valor:"+moneda5 +moneda4+ "."+moneda3+ moneda2 +moneda1);
       }else if(moneda>100000 && moneda<1000000){
        System.out.println("Valor:"+moneda6 +moneda5 +moneda4+ "."+moneda3 +moneda2 +moneda1);
       }else if(moneda>1000000 && moneda<10000000){
        System.out.println("Valor:"+moneda7+ "." +moneda6 +moneda5 +moneda4+ "."+moneda3 +moneda2 +moneda1);
       }else if(moneda>10000000 && moneda<100000000){
        System.out.println("Valor:"+moneda8 +moneda7+ "."+moneda6 +moneda5 +moneda4+ "."+moneda3 +moneda2 +moneda1);
       }else if(moneda>100000000 && moneda<1000000000){
        System.out.println("Valor:"+moneda9 +moneda8 +moneda7+ "."+moneda6 +moneda5 +moneda4+ "." +moneda3 +moneda2 +moneda1);
       }else if(moneda>1000000000 && moneda<2000000000){
        System.out.println("Valor:"+moneda10+ "."+moneda9 +moneda8 +moneda7+ "."+moneda6 +moneda5 +moneda4+ "."+moneda3 +moneda2 +moneda1);
       }else if(moneda>0 && moneda<1000){
        System.out.println("Valor:"+moneda);
       }else{
            System.out.print("");
        }
    }
}