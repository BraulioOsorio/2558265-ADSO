import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        double total_kilometros=0;


        System.out.println("Digite el precio del galon de Gasolina");
        double gasolina=entrada.nextInt();
        System.out.println("Cuantos kilometros consume por galon");
        double consumo_galon=entrada.nextInt();
        System.out.println("------------------------------------------------------------");
        System.out.println("|1=guatica   2=La Celia  3=La Virginia  4=Marsella   5=Mistrato|");
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese la ciudad de Origen");
        int origen=entrada.nextInt();
        System.out.println("Ingrese la cantidad de paradas");
        int paradas=entrada.nextInt();
        System.out.println("------------------------------------------------------------");
        System.out.println("|1=guatica   2=La Celia  3=La Virginia  4=Marsella   5=Mistrato|");
        System.out.println("------------------------------------------------------------");
        for(int i=1; i<=paradas; i++){
            System.out.println("Ingrese la ciudad de la parada "+i);
            int ciudad_paradas=entrada.nextInt();
            if(origen==ciudad_paradas){
                total_kilometros += 5;
            }else if(origen==1 && ciudad_paradas==2){
                total_kilometros += 91.1;
            }else if(origen==1 && ciudad_paradas==3){
                total_kilometros += 60.0;
            }else if(origen==1 && ciudad_paradas==4){
                total_kilometros += 98.5;
            }else if(origen==1 && ciudad_paradas==5){
                total_kilometros += 25.1;
            }else if(origen==2 && ciudad_paradas==1){
                total_kilometros += 91.1;
            }else if(origen==2 && ciudad_paradas==3){
                total_kilometros += 33.9;
            }else if(origen==2 && ciudad_paradas==4){
                total_kilometros += 87.2;
            }else if(origen==2 && ciudad_paradas==5){
                total_kilometros += 88.1;
            }else if(origen==3 && ciudad_paradas==1){
                total_kilometros += 60.0;
            }else if(origen==3 && ciudad_paradas==2){
                total_kilometros += 34.0;
            }else if(origen==3 && ciudad_paradas==4){
                total_kilometros += 53.3;
            }else if(origen==3 && ciudad_paradas==5){
                total_kilometros += 56.9;
            }else if(origen==4 && ciudad_paradas==1){
                total_kilometros += 98.4;
            }else if(origen==4 && ciudad_paradas==2){
                total_kilometros += 87.0;
            }else if(origen==4 && ciudad_paradas==3){
                total_kilometros += 53.0;
            }else if(origen==4 && ciudad_paradas==5){
                total_kilometros += 110.0;
            }else if(origen==5 && ciudad_paradas==1){
                total_kilometros += 25.1;
            }else if(origen==5 && ciudad_paradas==2){
                total_kilometros += 88.1;
            }else if(origen==5 && ciudad_paradas==3){
                total_kilometros += 57.0;
            }else if(origen==5 && ciudad_paradas==4){
                total_kilometros += 110.0;
            }

            origen = ciudad_paradas;
        }
        
        double total_gasolina=(total_kilometros/consumo_galon)*gasolina;
        System.out.println("total de a pagar por gasolina gastada: "+total_gasolina);

    }
}
