import java.util.Scanner;

public class Pequena8{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese un numero menor a 9 digitos");
        int numero= entrada.nextInt();

        int numero1 = numero%10;
        int numero2 =(numero/10)%10;
        int numero3 =(numero/100)%10;
        int numero4 =(numero/1000)%10;
        int numero5 =(numero/10000)%10;
        int numero6 =(numero/100000)%10;
        int numero7 =(numero/1000000)%10;
        int numero8 =(numero/10000000)%10;
        int numero9 =(numero/100000000)%10;

        if(numero9 ==9){
            System.out.print("novecientos ");
        }else if(numero9==8){
            System.out.print("ochocientos ");
        }else if(numero9 ==7){
            System.out.print("setecientos ");
        }else if(numero9 ==6){
            System.out.print("seicioentos ");
        }else if(numero9 ==5){
            System.out.print("quinientos ");
        }else if(numero9 ==4){
            System.out.print("cuatrocientos ");
        }else if(numero9 ==3){
            System.out.print("trecientos ");
        }else if(numero9 ==2){
            System.out.print("docientos ");
        }else if(numero9 ==1){
            if(numero8==0 && numero7==0){
                System.out.print("cien ");
            }else{
                System.out.print("ciento ");
            } 
        }


        if (numero8 == 9 && numero7 == 0){
            System.out.print("noventa ");
        }else if(numero8 == 9 && numero7 != 0){
            System.out.print("noventa y ");
        }else if(numero8 == 8 && numero7 == 0){
            System.out.print("ochenta ");
        }else if(numero8 == 8 && numero7 != 0){
            System.out.print("ochenta y");
        }else if(numero8 == 7 && numero7 == 0){
            System.out.print("setenta ");
        }else if(numero8 == 7 && numero7 != 0){
            System.out.print("setenta y ");
        }else if(numero8 == 6 && numero7 == 0){
            System.out.print("secenta ");
        }else if(numero8 == 6 && numero7 != 0){
            System.out.print("secenta y ");
        }else if(numero8 == 5 && numero7 == 0){
            System.out.print("cincuenta");
        }else if(numero8 == 5 && numero7 != 0){
            System.out.print("cincuenta y ");
        }else if(numero8 == 4 && numero7 == 0){
            System.out.print("cuarenta ");
        }else if(numero8 == 4 && numero7 != 0){
            System.out.print("cuarenta y ");
        }else if(numero8 == 3 && numero7 == 0){
            System.out.print("treinta ");
        }else if(numero8 == 3 && numero7 != 0){
            System.out.print("treinta y ");
        }else if(numero8 == 2 && numero7 == 0){
            System.out.print("veinte ");
        }else if(numero8 == 2 && numero7 != 0){
            System.out.print("veinti ");
        }else if(numero8 == 1 && numero7 == 0){
            System.out.print("diez ");
        }else if(numero8 == 1 && numero7 == 1){
            System.out.print("once ");
        }else if(numero8 == 1 && numero7 == 2){
            System.out.print("doce ");
        }else if(numero8 == 1 && numero7 == 3){
            System.out.print("trese ");
        }else if(numero8 == 1 && numero7 == 4){
            System.out.print("catorce ");
        }else if(numero8 == 1 && numero7 == 5){
            System.out.print("quince ");
        }else if(numero8 == 1 && numero7 == 6){
            System.out.print("dieciceis ");
        }else if(numero8 == 1 && numero7 == 7){
            System.out.print("diesiciete ");
        }else if(numero8 == 1 && numero7 == 8){
            System.out.print("dieciocho ");
        }else if(numero8 == 1 && numero7 == 9){
            System.out.print("diecinueve ");
        }else{
            System.out.print("");
        }


        if (numero7 == 9 && numero8!=1 ){
            System.out.print("nueve mil ");
        }else if(numero7 == 8  && numero8!=1){
            System.out.print("ocho mil ");
        }else if(numero7 == 7  && numero8!=1){
            System.out.print("siete mil ");
        }else if(numero7 == 6  && numero8!=1){
            System.out.print("seis mil ");
        }else if(numero7 == 5  && numero8!=1){
            System.out.print("cinco mil ");
        }else if(numero7 == 4  && numero8!=1){
            System.out.print("cuatro mil ");
        }else if(numero7 == 3  && numero8!=1){
            System.out.print("tres mil ");
        }else if(numero7 == 2  && numero8!=1){
            System.out.print("dos mil ");
        }else if(numero7 == 1  && numero8!=1){
            System.out.print("un mil ");
        }else{
            System.out.print("");
        }


        if(numero6 ==9){
            System.out.print("novecientos ");
        }else if(numero6 ==8){
            System.out.print("ochocientos ");
        }else if(numero6 ==7){
            System.out.print("setecientos ");
        }else if(numero6 ==6){
            System.out.print("seicioentos ");
        }else if(numero6 ==5){
            System.out.print("quinientos ");
        }else if(numero6 ==4){
            System.out.print("cuatrocientos ");
        }else if(numero6 ==3){
            System.out.print("trecientos ");
        }else if(numero6 ==2){
            System.out.print("docientos ");
        }else if(numero6 ==1){
            if(numero5==0 && numero4==0){
                System.out.print("cien ");
            }else{
                System.out.print("ciento ");
            } 
        }

        if (numero5 == 9 && numero4 == 0){
            System.out.print("noventa ");
        }else if(numero5 == 9 && numero4 != 0){
            System.out.print("noventa y ");
        }else if(numero5 == 8 && numero4 == 0){
            System.out.print("ochenta ");
        }else if(numero5 == 8 && numero4 != 0){
            System.out.print("ochenta y ");
        }else if(numero5 == 7 && numero4 == 0){
            System.out.print("setenta ");
        }else if(numero5 == 7 && numero4 != 0){
            System.out.print("setenta y ");
        }else if(numero5 == 6 && numero4 == 0){
            System.out.print("secenta ");
        }else if(numero5 == 6 && numero4 != 0){
            System.out.print("secenta y ");
        }else if(numero5 == 5 && numero4 == 0){
            System.out.print("cincuenta ");
        }else if(numero5 == 5 && numero4 != 0){
            System.out.print("cincuenta y ");
        }else if(numero5 == 4 && numero4 == 0){
            System.out.print("cuarenta ");
        }else if(numero5 == 4 && numero4 != 0){
            System.out.print("cuarenta y ");
        }else if(numero5 == 3 && numero4 == 0){
            System.out.print("treinta ");
        }else if(numero5 == 3 && numero4 != 0){
            System.out.print("treinta y ");
        }else if(numero5 == 2 && numero4 == 0){
            System.out.print("veinte ");
        }else if(numero5 == 2 && numero4 != 0){
            System.out.print("veinti ");
        }else if(numero5 == 1 && numero4 == 0){
            System.out.print("diez ");
        }else if(numero5 == 1 && numero4 == 1){
            System.out.print("once ");
        }else if(numero5 == 1 && numero4 == 2){
            System.out.print("doce ");
        }else if(numero5 == 1 && numero4 == 3){
            System.out.print("trese ");
        }else if(numero5 == 1 && numero4 == 4){
            System.out.print("catorce ");
        }else if(numero5 == 1 && numero4 == 5){
            System.out.print("quince ");
        }else if(numero5 == 1 && numero4 == 6){
            System.out.print("dieciceis ");
        }else if(numero5 == 1 && numero4 == 7){
            System.out.print("diesiciete ");
        }else if(numero5 == 1 && numero4 == 8){
            System.out.print("dieciocho ");
        }else if(numero5 == 1 && numero4 == 9){
            System.out.print("diecinueve ");
        }else{
            System.out.print("");
        }

        if (numero4 == 9  ){
            System.out.print("nueve mil ");
        }else if(numero4 == 8){
            System.out.print("ocho mil ");
        }else if(numero4 == 7){
            System.out.print("siete mil ");
        }else if(numero4 == 6){
            System.out.print("seis mil ");
        }else if(numero4 == 5){
            System.out.print("cinco mil ");
        }else if(numero4 == 4){
            System.out.print("cuatro mil ");
        }else if(numero4 == 3){
            System.out.print("tres mil ");
        }else if(numero4 == 2){
            System.out.print("dos mil ");
        }else if(numero4 == 1){
            System.out.print("un mil ");
        }else{
            System.out.print("");
        }

        if (numero3 == 9){
            System.out.print("novecientos ");
        }else if (numero3 == 8){
            System.out.print("ochosientos ");
        }else if (numero3 == 7){
            System.out.print("setecientos ");
        }else if (numero3 == 6){
            System.out.print("seicientos ");
        }else if (numero3 == 5){
            System.out.print("quinientos ");
        }else if (numero3 == 4){
            System.out.print("cuatrocientos ");
        }else if (numero3 == 3){
            System.out.print("trecientos ");
        }else if (numero3 == 2){
            System.out.print("docientos ");
        }else if (numero3 == 1){
           if (numero3 == 0 && numero4 == 0){
                System.out.print("cien ");
           }else{
                System.out.print("ciento ");
           }
        }

        if (numero2 == 9 && numero1 == 0){
            System.out.print("noventa ");
        }else if(numero2 == 9 && numero1 != 0){
            System.out.print("noventa y ");
        }else if(numero2 == 8 && numero1 == 0){
            System.out.print("ochenta ");
        }else if(numero2 == 8 && numero1 != 0){
            System.out.print("ochenta y ");
        }else if(numero2 == 7 && numero1 == 0){
            System.out.print("setenta ");
        }else if(numero2 == 7 && numero1 != 0){
            System.out.print("setenta y ");
        }else if(numero2 == 6 && numero1 == 0){
            System.out.print("secenta ");
        }else if(numero2 == 6 && numero1 != 0){
            System.out.print("secenta y ");
        }else if(numero2 == 5 && numero1 == 0){
            System.out.print("cincuenta ");
        }else if(numero2 == 5 && numero1 != 0){
            System.out.print("ciencuenta y ");
        }else if(numero2 == 4 && numero1 == 0){
            System.out.print("cuarenta ");
        }else if(numero2 == 4 &&numero1 != 0){
            System.out.print("cuarenta y ");
        }else if(numero2 == 3 && numero1 == 0){
            System.out.print("treinta ");
        }else if(numero2 == 3 && numero1 != 0){
            System.out.print("treinta y ");
        }else if(numero2 == 2 && numero1 == 0){
            System.out.print("veinte ");
        }else if(numero2 == 2 && numero1 != 0){
            System.out.print("veinti ");
        }else if(numero2 == 1 && numero1 == 0){
            System.out.print("diez ");
        }else if(numero2 == 1 && numero1 == 1){
            System.out.print("once ");
        }else if(numero2 == 1 && numero1 == 2){
            System.out.print("doce ");
        }else if(numero2 == 1 && numero1 == 3){
            System.out.print("trece ");
        }else if(numero2 == 1 && numero1 == 4){
            System.out.print("cetorce ");
        }else if(numero2 == 1 && numero1 == 5){
            System.out.print("quince ");
        }else if(numero2 == 1 && numero1 == 6){
            System.out.print("dieciceis ");
        }else if(numero2 == 1 && numero1 == 7){
            System.out.print("dieciciete ");
        }else if(numero2 == 1 && numero1 == 8){
            System.out.print("dieciocho ");
        }else if(numero2 == 1 && numero1 == 9){
            System.out.print(" diecinueve ");
        }else{
            System.out.print("");
        }

        if (numero1 == 9  && numero2!=1 ){
            System.out.print(" nueve ");
        }else if (numero1 == 8  && numero2!=1){
            System.out.print(" ocho ");
        }else if (numero1 == 7  && numero2!=1){
            System.out.print(" siete ");
        }else if (numero1 == 6  && numero2!=1){
            System.out.print(" seis ");
        }else if (numero1 == 5  && numero2!=1){
            System.out.print(" cinco ");
        }else if (numero1 == 4  && numero2!=1){
            System.out.print(" cuatro ");
        }else if (numero1 == 3  && numero2!=1){
            System.out.print(" tres ");
        }else if (numero1 == 2  && numero2!=1){
            System.out.print(" dos ");
        }else if (numero1 == 1  && numero2!=1 ){
            System.out.print(" uno ");
        }else{
            System.out.print("");
        }
    }
}