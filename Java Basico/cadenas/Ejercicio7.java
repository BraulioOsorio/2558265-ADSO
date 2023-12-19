import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        boolean correcto=false;
        while(correcto==false){
            boolean simbolo=false;
            boolean Mayuscula=false;
            boolean minuscula=false;
            boolean numero=false;
            boolean espacio=true;
            System.out.print("Porfavor ingrese su contraseña");
            System.out.println("REQUISITOS: ");
            System.out.println("- Mínimo 8 caracteres.");
            System.out.println("- Al menos una letra mayúscula.");
            System.out.println("- Al menos una letra minúscula.");
            System.out.println("- Al menos un digito numérico.");
            System.out.println("- Al menos un carácter especial como: . - * { } [ ] # $ % & / ? ¡ !");
            System.out.println(" No debe contener espacios.");
            String contra = entrada.nextLine();
            int ultimo = contra.length();
            for(int i=0;i<contra.length();i++){
                int letra = (int)contra.charAt(i);
                if( letra==33 || letra==35 || letra==36 || letra==46 || letra==45 || letra==42 || letra==123 || letra==125 || letra==91 || letra==93 || letra==37 || letra==38 || letra==47 || letra==63 || letra==173){
                    simbolo=true;
                }
                if(letra>=65 && letra<=90){
                    Mayuscula=true;
                }
                if(letra>=97 && letra<=122){
                    minuscula=true;
                }
                if(letra>=48 && letra<=57){
                    numero=true;
                }
                if(letra==32){
                    numero=false;
                }
            }
            if((ultimo >=7) && (simbolo==true) && (Mayuscula==true) && (minuscula=true) && (numero==true) && (espacio==true)){
                System.out.println("La Contraseña  valida");
                correcto=true;
            }else{
                System.out.println("La Contraseña no es valida");
                correcto=false;
            } 
        }
        
    }
}