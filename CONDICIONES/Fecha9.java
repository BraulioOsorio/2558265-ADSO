import java.util.Scanner;

public class Fecha9{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("no poner ningun tipo de signo en medio de la fecha, simplemente coloque numeros");
        System.out.println("Profavor ingrese un afecha mayor a 1700 y menor a 2100");


        int fecha=entrada.nextInt();

        int numero1= fecha%10;
        int numero2=(fecha/10)%10;
        int numero3=(fecha/100)%10;
        int numero4=(fecha/1000)%10;
        int numero5=(fecha/10000)%10;
        int numero6=(fecha/100000)%10;
        int numero7=(fecha/1000000)%10;
        int numero8=(fecha/10000000)%10;

        if(numero8 ==0 && numero7 ==1){
            System.out.print("primero de ");
        }else if(numero8 ==0 && numero7 ==2){
            System.out.print("dos de ");
        }else if(numero8 ==0 && numero7 ==3){
            System.out.print("tres de ");
        }else if(numero8 ==0 && numero7 ==4){
            System.out.print("cuatro de ");
        }else if(numero8 ==0 && numero7 ==5){
            System.out.print("cinco de ");
        }else if(numero8 ==0 && numero7 ==6){
            System.out.print("seis de ");
        }else if(numero8 ==0 && numero7 ==7){
            System.out.print("siete de ");
        }else if(numero8 ==0 && numero7 ==8){
            System.out.print("ocho de ");
        }else if(numero8 ==0 && numero7 ==9){
            System.out.print("nueve de ");
        }else if(numero8 ==1 && numero7 ==0){
            System.out.print("diez de ");
        }else if(numero8 ==1 && numero7 ==1){
            System.out.print("once de ");
        }else if(numero8 ==1 && numero7 ==2){
            System.out.print("doce de ");
        }else if(numero8 ==1 && numero7 ==3){
            System.out.print("trese de ");
        }else if(numero8 ==1 && numero7 ==4){
            System.out.print("catorse de ");
        }else if(numero8 ==1 && numero7 ==5){
            System.out.print("quince de ");
        }else if(numero8 ==1 && numero7 ==6){
            System.out.print("dieciceis de ");
        }else if(numero8 ==1 && numero7 ==7){
            System.out.print("dieciete de ");
        }else if(numero8 ==1 && numero7 ==8){
            System.out.print("dieciocho de ");
        }else if(numero8 ==1 && numero7 ==9){
            System.out.print("diecinueve de ");
        }else if(numero8 ==2 && numero7 ==0){
            System.out.print("veinte de ");
        }else if(numero8 ==2 && numero7 ==1){
            System.out.print("ventiuno de ");
        }else if(numero8 ==2 && numero7 ==2){
            System.out.print("veintidos de ");
        }else if(numero8 ==2 && numero7 ==3){
            System.out.print("veintitres de ");
        }else if(numero8 ==2 && numero7 ==4){
            System.out.print("veinticuatro de ");
        }else if(numero8 ==2 && numero7 ==5){
            System.out.print("veinticinco de ");
        }else if(numero8 ==2 && numero7 ==6){
            System.out.print("vientiseis de ");
        }else if(numero8 ==2 && numero7 ==7){
            System.out.print("veintisiete de ");
        }else if(numero8 ==2 && numero7 ==8){
            System.out.print("veintiocho de ");
        }else if(numero8 ==2 && numero7 ==9){
            System.out.print("veintinueve de ");
        }else if(numero8 ==3 && numero7 ==0){
            System.out.print("treinta de ");
        }else if(numero8 ==3 && numero7 ==1){
            System.out.print("treinta y uno de ");
        }else{
            System.out.print("");
        }


        if (numero6 == 0 && numero5 == 1){
            System.out.print("enero del ");
        }else if (numero6 == 0 && numero5 == 2){
            System.out.print("febrero del ");
        }else if (numero6 == 0 && numero5 == 3){
            System.out.print("marzo del ");
        }else if (numero6 == 0 && numero5 == 4){
            System.out.print("abril del ");
        }else if (numero6 == 0 && numero5 == 5){
            System.out.print("mayo del ");
        }else if (numero6 == 0 && numero5 == 6){
            System.out.print("junio del ");
        }else if (numero6 == 0 && numero5 == 7){
            System.out.print("julio del ");
        }else if (numero6 == 0 && numero5 == 8){
            System.out.print("agosto del ");
        }else if (numero6 == 0 && numero5 == 9){
            System.out.print("septiempre del ");
        }else if (numero6 == 1 && numero5 == 0){
            System.out.print("octubre del ");
        }else if (numero6 == 1 && numero5 == 1){
            System.out.print("noviembre del ");
        }else if (numero6 == 1 && numero5 == 2){
            System.out.print("diciembre del ");
        }else{
            System.out.print("");
        }


        if(numero4 ==1){
            System.out.print("mil ");
        }else if(numero4 ==2){
            System.out.print("dos mil ");
        }else{
            System.out.print("");
        }

        if( numero4 ==1 && numero3 ==7){
            System.out.print("setecientos ");
        }else if( numero4 ==1 && numero3 ==8){
            System.out.print("ochocientos ");
        }else if( numero4 ==1 && numero3 ==9){
            System.out.print("novecientos ");
        }else if( numero4 ==2 && numero3 ==1){
            System.out.print("cien ");
        }else{
            System.out.print("");
        }

        

        if(numero2 ==9 ){
            System.out.print("noventa y ");
        }else if(numero2 ==8 ){
            System.out.print("ochenta y ");
        }else if(numero2 ==7 ){
            System.out.print("setenta y ");
        }else if(numero2 ==6 ){
            System.out.print("secenta y ");
        }else if(numero2 ==5 ){
            System.out.print("cincuenta y ");
        }else if(numero2 ==4 ){
            System.out.print("cuarenta y ");
        }else if(numero2 ==3 ){
            System.out.print("treinta y ");
        }else if(numero2 ==2 ){
            System.out.print("veinti y ");
        }else if(numero2 ==1 ){
            System.out.print("diez");
        }else if(numero2 ==1 && numero1 ==1){
            System.out.print("once ");
        }else if(numero2 ==1 && numero1 ==2){
            System.out.print("doce ");
        }else if(numero2 ==1 && numero1 ==3){
            System.out.print("trese ");
        }else if(numero2 ==1 && numero1 ==4){
            System.out.print("catorse ");
        }else if(numero2 ==1 && numero1 ==5){
            System.out.print("quince ");
        }else if(numero2 ==1 && numero1 ==6){
            System.out.print("dieciceis ");
        }else if(numero2 ==1 && numero1 ==7){
            System.out.print("diecisiete y ");
        }else if(numero2 ==1 && numero1 ==8){
            System.out.print("dieciocho y ");
        }else if(numero2 ==1 && numero1 ==9){
            System.out.print("diecinueve y ");
        }else{
            System.out.print("");
        }


        if(numero2 ==9 && numero1==0){
            System.out.print("noventa ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("ochenta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("setenta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("secenta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("cincuenta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("cuarenta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("treinta ");
        }else if(numero2 ==9 && numero1==0){
            System.out.print("veinte ");
        }else{
            System.out.print("");
        }

        if(numero1 ==1){
            System.out.print("uno ");
        }else if(numero1 ==2){
            System.out.print("dos ");
        }else if(numero1 ==3){
            System.out.print("tres ");
        }else if(numero1 ==4){
            System.out.print("cuatro ");
        }else if(numero1 ==5){
            System.out.print("cinco ");
        }else if(numero1 ==6){
            System.out.print("seis ");
        }else if(numero1 ==7){
            System.out.print("siete ");
        }else if(numero1 ==8){
            System.out.print("ocho ");
        }else if(numero1 ==9){
            System.out.print("nueve ");
        }else{
            System.out.print("");
        }
    }
}