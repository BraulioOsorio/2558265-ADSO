import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador=0;
        java.lang.String palabra = "dinosaurio";
        java.lang.String menu = "1.INICIAR    2.SALIR ";
        System.out.println(menu);
        int jugar = entrada.nextInt();
        int vida=5;
        int tamano = palabra.length();
        char arreglo[] = new char[tamano];
        if(jugar==1){
                System.out.println("ADIVINA LA PALABRA\n");
                for (int i=0;i<palabra.length();i++){
                    System.out.print(((i==0)?"    ":"  ")+"_");
                }
                System.out.println(" ");
                
                while(vida>0){
                    int k=0;
                    System.out.println("Vidas: "+vida);
                    System.out.println("Digite una letra");
                    char letra = entrada.next().charAt(0);
                    
                    for(int i=0;i<palabra.length();i++){
                        if(letra == palabra.charAt(i)){
                            k++;
                            contador++;
                        }
                    }
                    if(k>0){
                        System.out.println("Bien Hecho");
                        for (int i=0;i<palabra.length();i++){
                            if(letra==palabra.charAt(i)){
                                arreglo[i]=letra;
                            }
                            if(arreglo[i]==0){
                                arreglo[i]='_';
                            }
                            System.out.print(((i==0)?"    ":"  ")+arreglo[i]);
                        }
                        System.out.println("");
                    }else{
                        System.out.println("Letra incorrecta - 1 vida");
                        vida--;
                    }
                    
                    if(contador==tamano){
                        System.out.println("Gano un frutiño");
                        System.out.println("La palabra es "+palabra);
                        break;
                    }
                    System.out.println(" ");
                }                
                if(vida==0){
                    System.out.println("¡Lo siento, perdiste! La palabra era "+palabra);
                }                        
            }        
    }
}
