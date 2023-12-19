import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero para encontar su Raiz Digital no mayor a 5 digitos-> ");
        int digito = entrada.nextInt();
        int i=0;
        int separar1=1000000;
        int dividir=100000;
        int uno=0;
        int dos=0;
        int suma=0;
        if(digito<100000){
            System.out.println("Raiz digital->");
            while(i<6){
            int separar2=0;
            separar2=(digito%separar1)/dividir;
            if(separar2!=0 || separar2==0 && digito>=dividir){
                System.out.print(separar2+" + ");
            }
            if(i==1){
                uno=separar2;
            }else if(i==5){
                dos=separar2;
            }
            separar1=separar1/10;
            dividir=dividir/10;
            i++;
            suma+=separar2;
            }
            int suma2=uno+dos;
            System.out.println(" = "+suma);
            System.out.println(uno+" + "+dos+" = "+suma2);
            System.out.println("La raiz digital de "+digito+" es "+suma2);
        }else{
            System.out.println("Numero paso de 5 digitos");
        }
    }
}