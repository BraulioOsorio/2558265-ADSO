//0.4 litros por Kilometro
//litro de gasolina es igual a 2.389
//el valor de 0.4 litros es de 5,97
import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        double total_kilometros=0;
        System.out.print("Digite el precio del galon de Gasolina-> ");
        double gasolina=entrada.nextInt();
        System.out.print("Cuantos kilometros consume por galon-> ");
        double consumo_galon=entrada.nextInt();
        
        System.out.println("|       1=Apia                  |  2=Balboa        |  3=Belen de Umbria       |");
        System.out.println("|       4=Dosquebradas          |  5=Guatica       |  6=La Celia              |");
        System.out.println("|       7=La Virginia           |  8=Marsella      |  9=Mistrato              |");
        System.out.println("|       10=Pereira              |  11=Pueblo Rico  |  12=Quinchia             |");
        System.out.println("|       13=Santa Rosa de Cabal  |  14=Santuario    |                          |");
        System.out.println("");
        System.out.print("Ingrese la Ciudad de Origen: ");
        int origen= entrada.nextInt();
        System.out.print("Ingrese la cantidad de paradas: ");
        int paradas= entrada.nextInt();
        System.out.println("|       1=Apia                  |  2=Balboa        |  3=Belen de Umbria       |");
        System.out.println("|       4=Dosquebradas          |  5=Guatica       |  6=La Celia              |");
        System.out.println("|       7=La Virginia           |  8=Marsella      |  9=Mistrato              |");
        System.out.println("|       10=Pereira              |  11=Pueblo Rico  |  12=Quinchia             |");
        System.out.println("|       13=Santa Rosa de Cabal  |  14=Santuario    |                          |");
        System.out.println("");
        for(int i=1; i<=paradas; i++){
            System.out.print("Ingrese la ciudad de la parada "+i+" -> ");
            int ciudad_paradas=entrada.nextInt();
            if(origen==ciudad_paradas){
                total_kilometros += 5;
            }else if(origen==1 && ciudad_paradas==2){
                total_kilometros += 39.8;
            }else if(origen==1 && ciudad_paradas==3){
                total_kilometros += 39.5;
            }else if(origen==1 && ciudad_paradas==4){
                total_kilometros += 68.9;
            }else if(origen==1 && ciudad_paradas==5){
                total_kilometros += 58.7;
            }else if(origen==1 && ciudad_paradas==6){
                total_kilometros += 24.1;
            }else if(origen==1 && ciudad_paradas==7){
                total_kilometros += 34.7;
            }else if(origen==1 && ciudad_paradas==8){
                total_kilometros += 88.1;
            }else if(origen==1 && ciudad_paradas==9){
                total_kilometros += 55.6;
            }else if(origen==1 && ciudad_paradas==10){
                total_kilometros += 65.7;
            }else if(origen==1 && ciudad_paradas==11){
                total_kilometros += 26.4;
            }else if(origen==1 && ciudad_paradas==12){
                total_kilometros += 77.4;
            }else if(origen==1 && ciudad_paradas==13){
                total_kilometros += 77.8;
            }else if(origen==1 && ciudad_paradas==14){
                total_kilometros += 15.3;
            }
            //Balboa
            if(origen==2 && ciudad_paradas==1){
                total_kilometros += 39.8;
            }else if(origen==2 && ciudad_paradas==3){
                total_kilometros += 56.9;
            }else if(origen==2 && ciudad_paradas==4){
                total_kilometros += 52.9;
            }else if(origen==2 && ciudad_paradas==5){
                total_kilometros += 76.6;
            }else if(origen==2 && ciudad_paradas==6){
                total_kilometros += 13.7;
            }else if(origen==2 && ciudad_paradas==7){
                total_kilometros += 18.9;
            }else if(origen==2 && ciudad_paradas==8){
                total_kilometros += 72.1;
            }else if(origen==2 && ciudad_paradas==9){
                total_kilometros += 73.0;
            }else if(origen==2 && ciudad_paradas==10){
                total_kilometros += 49.7;
            }else if(origen==2 && ciudad_paradas==11){
                total_kilometros += 64.8;
            }else if(origen==2 && ciudad_paradas==12){
                total_kilometros += 94.8;
            }else if(origen==2 && ciudad_paradas==13){
                total_kilometros += 61.9;
            }else if(origen==2 && ciudad_paradas==14){
                total_kilometros += 38.3;
            }
            //Delen de Umbria
            if(origen==3 && ciudad_paradas==1){
                total_kilometros += 39.5;
            }else if(origen==3 && ciudad_paradas==2){
                total_kilometros += 56.9;
            }else if(origen==3 && ciudad_paradas==4){
                total_kilometros += 74.6;
            }else if(origen==3 && ciudad_paradas==5){
                total_kilometros += 25.1;
            }else if(origen==3 && ciudad_paradas==6){
                total_kilometros += 71.9;
            }else if(origen==3 && ciudad_paradas==7){
                total_kilometros += 40.8;
            }else if(origen==3 && ciudad_paradas==8){
                total_kilometros += 93.8;
            }else if(origen==3 && ciudad_paradas==9){
                total_kilometros += 16.3;
            }else if(origen==3 && ciudad_paradas==10){
                total_kilometros += 71.4;
            }else if(origen==3 && ciudad_paradas==11){
                total_kilometros += 65.4;
            }else if(origen==3 && ciudad_paradas==12){
                total_kilometros += 52.4;
            }else if(origen==3 && ciudad_paradas==13){
                total_kilometros += 83.6;
            }else if(origen==3 && ciudad_paradas==14){
                total_kilometros += 71.4;
            }
            //Dosquebradas
            if(origen==4 && ciudad_paradas==1){
                total_kilometros += 67.5;
            }else if(origen==4 && ciudad_paradas==2){
                total_kilometros += 51.5;
            }else if(origen==4 && ciudad_paradas==3){
                total_kilometros += 73.1;
            }else if(origen==4 && ciudad_paradas==5){
                total_kilometros += 92.3;
            }else if(origen==4 && ciudad_paradas==6){
                total_kilometros += 66.6;
            }else if(origen==4 && ciudad_paradas==7){
                total_kilometros += 32.5;
            }else if(origen==4 && ciudad_paradas==8){
                total_kilometros += 34.4;
            }else if(origen==4 && ciudad_paradas==9){
                total_kilometros += 89.3;
            }else if(origen==4 && ciudad_paradas==10){
                total_kilometros += 2.4;
            }else if(origen==4 && ciudad_paradas==11){
                total_kilometros += 92.5;
            }else if(origen==4 && ciudad_paradas==12){
                total_kilometros += 93.9;
            }else if(origen==4 && ciudad_paradas==13){
                total_kilometros += 12.4;
            }else if(origen==4 && ciudad_paradas==14){
                total_kilometros += 66.0;
            }
            //Guatica
            if(origen==5 && ciudad_paradas==1){
                total_kilometros += 58.7;
            }else if(origen==5 && ciudad_paradas==2){
                total_kilometros += 76.1;
            }else if(origen==5 && ciudad_paradas==3){
                total_kilometros += 25.1;
            }else if(origen==5 && ciudad_paradas==4){
                total_kilometros += 93.8;
            }else if(origen==5 && ciudad_paradas==6){
                total_kilometros += 91.1;
            }else if(origen==5 && ciudad_paradas==7){
                total_kilometros += 60.0;
            }else if(origen==5 && ciudad_paradas==8){
                total_kilometros += 98.5;
            }else if(origen==5 && ciudad_paradas==9){
                total_kilometros += 25.1;
            }else if(origen==5 && ciudad_paradas==10){
                total_kilometros += 90.6;
            }else if(origen==5 && ciudad_paradas==11){
                total_kilometros += 84.8;
            }else if(origen==5 && ciudad_paradas==12){
                total_kilometros += 22.9;
            }else if(origen==5 && ciudad_paradas==13){
                total_kilometros += 85.5;
            }else if(origen==5 && ciudad_paradas==14){
                total_kilometros += 73.4;
            }
            //La celia
            if(origen==6 && ciudad_paradas==1){
                total_kilometros += 24.1;
            }else if(origen==6 && ciudad_paradas==2){
                total_kilometros += 13.7;
            }else if(origen==6 && ciudad_paradas==3){
                total_kilometros += 71.9;
            }else if(origen==6 && ciudad_paradas==4){
                total_kilometros += 67.9;
            }else if(origen==6 && ciudad_paradas==5){
                total_kilometros += 91.1;
            }else if(origen==6 && ciudad_paradas==7){
                total_kilometros += 33.9;
            }else if(origen==6 && ciudad_paradas==8){
                total_kilometros += 87.2;
            }else if(origen==6 && ciudad_paradas==9){
                total_kilometros += 88.1;
            }else if(origen==6 && ciudad_paradas==10){
                total_kilometros += 64.7;
            }else if(origen==6 && ciudad_paradas==11){
                total_kilometros += 49.1;
            }else if(origen==6 && ciudad_paradas==12){
                total_kilometros += 110.0;
            }else if(origen==6 && ciudad_paradas==13){
                total_kilometros += 76.9;
            }else if(origen==6 && ciudad_paradas==14){
                total_kilometros += 22.6;
            }
            //La virginia
            if(origen==7 && ciudad_paradas==1){
                total_kilometros += 35.0;
            }else if(origen==7 && ciudad_paradas==2){
                total_kilometros += 19.0;
            }else if(origen==7 && ciudad_paradas==3){
                total_kilometros += 40.8;
            }else if(origen==7 && ciudad_paradas==4){
                total_kilometros += 34.0;
            }else if(origen==7 && ciudad_paradas==5){
                total_kilometros += 60.0;
            }else if(origen==7 && ciudad_paradas==6){
                total_kilometros += 34.0;
            }else if(origen==7 && ciudad_paradas==8){
                total_kilometros += 53.3;
            }else if(origen==7 && ciudad_paradas==9){
                total_kilometros += 56.9;
            }else if(origen==7 && ciudad_paradas==10){
                total_kilometros += 30.8;
            }else if(origen==7 && ciudad_paradas==11){
                total_kilometros += 60.0;
            }else if(origen==7 && ciudad_paradas==12){
                total_kilometros += 78.7;
            }else if(origen==7 && ciudad_paradas==13){
                total_kilometros += 43.0;
            }else if(origen==7 && ciudad_paradas==14){
                total_kilometros += 33.5;
            }
            //Marsella
            if(origen==8 && ciudad_paradas==1){
                total_kilometros += 88.0;
            }else if(origen==8 && ciudad_paradas==2){
                total_kilometros += 72.0;
            }else if(origen==8 && ciudad_paradas==3){
                total_kilometros += 93.6;
            }else if(origen==8 && ciudad_paradas==4){
                total_kilometros += 35.8;
            }else if(origen==8 && ciudad_paradas==5){
                total_kilometros += 98.4;
            }else if(origen==8 && ciudad_paradas==6){
                total_kilometros += 87.0;
            }else if(origen==8 && ciudad_paradas==7){
                total_kilometros += 53.0;
            }else if(origen==8 && ciudad_paradas==9){
                total_kilometros += 110.0;
            }else if(origen==8 && ciudad_paradas==10){
                total_kilometros += 32.9;
            }else if(origen==8 && ciudad_paradas==11){
                total_kilometros += 113.0;
            }else if(origen==8 && ciudad_paradas==12){
                total_kilometros += 96.6;
            }else if(origen==8 && ciudad_paradas==13){
                total_kilometros += 44.7;
            }else if(origen==8 && ciudad_paradas==14){
                total_kilometros += 86.5;
            }
            //Mistrato
            if(origen==9 && ciudad_paradas==1){
                total_kilometros += 55.7;
            }else if(origen==9&& ciudad_paradas==2){
                total_kilometros += 73.1;
            }else if(origen==9 && ciudad_paradas==3){
                total_kilometros += 16.3;
            }else if(origen==9 && ciudad_paradas==4){
                total_kilometros += 90.8;
            }else if(origen==9 && ciudad_paradas==5){
                total_kilometros += 25.1;
            }else if(origen==9 && ciudad_paradas==6){
                total_kilometros += 88.1;
            }else if(origen==9 && ciudad_paradas==7){
                total_kilometros += 57.0;
            }else if(origen==9 && ciudad_paradas==8){
                total_kilometros += 110.0;
            }else if(origen==9 && ciudad_paradas==10){
                total_kilometros += 87.6;
            }else if(origen==9 && ciudad_paradas==11){
                total_kilometros += 81.7;
            }else if(origen==9 && ciudad_paradas==12){
                total_kilometros += 53.6;
            }else if(origen==9 && ciudad_paradas==13){
                total_kilometros += 99.8;
            }else if(origen==9 && ciudad_paradas==14){
                total_kilometros += 70.4;
            }
            //Pereira
            if(origen==10 && ciudad_paradas==1){
                total_kilometros += 65.7;
            }else if(origen==10 && ciudad_paradas==2){
                total_kilometros += 49.8;
            }else if(origen==10 && ciudad_paradas==3){
                total_kilometros += 71.3;
            }else if(origen==10 && ciudad_paradas==4){
                total_kilometros += 2.4;
            }else if(origen==10 && ciudad_paradas==5){
                total_kilometros += 90.5;
            }else if(origen==10 && ciudad_paradas==6){
                total_kilometros += 64.8;
            }else if(origen==10 && ciudad_paradas==7){
                total_kilometros += 30.7;
            }else if(origen==10 && ciudad_paradas==8){
                total_kilometros += 33.0;
            }else if(origen==10 && ciudad_paradas==9){
                total_kilometros += 87.5;
            }else if(origen==10 && ciudad_paradas==11){
                total_kilometros += 90.7;
            }else if(origen==10 && ciudad_paradas==12){
                total_kilometros += 95.8;
            }else if(origen==10 && ciudad_paradas==13){
                total_kilometros += 14.3;
            }else if(origen==10 && ciudad_paradas==14){
                total_kilometros += 64.2;
            }
            //Pueblo rico
            if(origen==11 && ciudad_paradas==1){
                total_kilometros += 26.2;
            }else if(origen==11 && ciudad_paradas==2){
                total_kilometros += 64.6;
            }else if(origen==11 && ciudad_paradas==3){
                total_kilometros += 65.5;
            }else if(origen==11 && ciudad_paradas==4){
                total_kilometros += 93.7;
            }else if(origen==11 && ciudad_paradas==5){
                total_kilometros += 84.5;
            }else if(origen==11 && ciudad_paradas==6){
                total_kilometros += 48.9;
            }else if(origen==11 && ciudad_paradas==7){
                total_kilometros += 59.7;
            }else if(origen==11 && ciudad_paradas==8){
                total_kilometros += 113.0;
            }else if(origen==11 && ciudad_paradas==9){
                total_kilometros += 81.5;
            }else if(origen==11 && ciudad_paradas==10){
                total_kilometros += 90.5;
            }else if(origen==11 && ciudad_paradas==12){
                total_kilometros += 103.0;
            }else if(origen==11 && ciudad_paradas==13){
                total_kilometros += 103.0;
            }else if(origen==11 && ciudad_paradas==14){
                total_kilometros += 34.3;
            }
            //Quinchia
            if(origen==12 && ciudad_paradas==1){
                total_kilometros += 77.4;
            }else if(origen==12 && ciudad_paradas==2){
                total_kilometros += 94.7;
            }else if(origen==12 && ciudad_paradas==3){
                total_kilometros += 52.4;
            }else if(origen==12 && ciudad_paradas==4){
                total_kilometros += 91.3;
            }else if(origen==12 && ciudad_paradas==5){
                total_kilometros += 22.8;
            }else if(origen==12 && ciudad_paradas==6){
                total_kilometros += 110.0;
            }else if(origen==12 && ciudad_paradas==7){
                total_kilometros += 78.7;
            }else if(origen==12 && ciudad_paradas==8){
                total_kilometros += 96.2;
            }else if(origen==12 && ciudad_paradas==9){
                total_kilometros += 57.9;
            }else if(origen==12 && ciudad_paradas==10){
                total_kilometros += 93.8;
            }else if(origen==12 && ciudad_paradas==11){
                total_kilometros += 103.0;
            }else if(origen==12 && ciudad_paradas==13){
                total_kilometros += 83.2;
            }else if(origen==12 && ciudad_paradas==14){
                total_kilometros += 109.0;
            }
            //Santa rosa de cabal
            if(origen==13 && ciudad_paradas==1){
                total_kilometros += 76.7;
            }else if(origen==13 && ciudad_paradas==2){
                total_kilometros += 60.8;
            }else if(origen==13 && ciudad_paradas==3){
                total_kilometros += 82.6;
            }else if(origen==13 && ciudad_paradas==4){
                total_kilometros += 10.3;
            }else if(origen==13 && ciudad_paradas==5){
                total_kilometros += 85.4;
            }else if(origen==13 && ciudad_paradas==6){
                total_kilometros += 75.8;
            }else if(origen==13 && ciudad_paradas==7){
                total_kilometros += 41.7;
            }else if(origen==13 && ciudad_paradas==8){
                total_kilometros += 43.6;
            }else if(origen==13 && ciudad_paradas==9){
                total_kilometros += 98.5;
            }else if(origen==13 && ciudad_paradas==10){
                total_kilometros += 12.3;
            }else if(origen==13 && ciudad_paradas==11){
                total_kilometros += 102.0;
            }else if(origen==13 && ciudad_paradas==12){
                total_kilometros += 83.5;
            }else if(origen==13 && ciudad_paradas==14){
                total_kilometros += 75.2;
            }
            //Santuario
            if(origen==14 && ciudad_paradas==1){
                total_kilometros += 15.3;
            }else if(origen==14 && ciudad_paradas==2){
                total_kilometros += 38.3;
            }else if(origen==14 && ciudad_paradas==3){
                total_kilometros += 71.4;
            }else if(origen==14 && ciudad_paradas==4){
                total_kilometros += 67.4;
            }else if(origen==14 && ciudad_paradas==5){
                total_kilometros += 73.5;
            }else if(origen==14 && ciudad_paradas==6){
                total_kilometros += 22.6;
            }else if(origen==14 && ciudad_paradas==7){
                total_kilometros += 33.4;
            }else if(origen==14 && ciudad_paradas==8){
                total_kilometros += 86.6;
            }else if(origen==14 && ciudad_paradas==9){
                total_kilometros += 70.5;
            }else if(origen==14 && ciudad_paradas==10){
                total_kilometros += 64.2;
            }else if(origen==14 && ciudad_paradas==11){
                total_kilometros += 34.5;
            }else if(origen==14 && ciudad_paradas==12){
                total_kilometros += 109.0;
            }else if(origen==14 && ciudad_paradas==13){
                total_kilometros += 76.4;
            }
            origen = ciudad_paradas;
        }
        System.out.println("Kilometros Recorridos: "+total_kilometros);
        double total_gasolina=(total_kilometros/consumo_galon)*gasolina;

        System.out.println("total de Dinero gasratdo en Gasolina: "+total_gasolina+" $");

        

    }
}