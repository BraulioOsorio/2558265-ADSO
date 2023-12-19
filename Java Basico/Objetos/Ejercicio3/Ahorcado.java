import java.util.Scanner;

public class Ahorcado{
    String palabra;
    int intentos;
    Scanner entrada;
    Scanner letras;
    int palabra_tamano;
    char encontrar_palabra[];

    public Ahorcado(String palabra){
        entrada = new Scanner(System.in);
        letras = new Scanner(System.in);
        this.palabra=palabra;
        this.intentos=6;
        this.palabra_tamano=palabra.length();
        this.encontrar_palabra=new char[palabra_tamano];
        this.limpiar();
    }

    public void limpiar(){
        for(int i=0;i<this.palabra_tamano;i++){
            this.encontrar_palabra[i]='_';
        }
    }

    public void start(){
        int opcion=0;
        while(opcion!=2){
            System.out.println("|--------------------------|");
			System.out.println("|- 1. Iniciar     2.Salir -|");
			System.out.println("|--------------------------|");
            System.out.print("Ingrese una opcion -> ");
            opcion = this.entrada.nextInt();
            if(opcion==1){
                System.out.println("La palabra tiene "+this.palabra_tamano+" espacios");
                this.imprimirEspacios();
                this.jugar();
                this.limpiar();
            }else if(opcion==2){
                System.out.println("SALIENDO");
            }else{
                System.out.println("OPCION INVALIDA");
            }
        }
    }

    public void imprimirEspacios(){
        System.out.print("      ");
        for(int i=0;i<this.palabra_tamano;i++){
            System.out.print(" "+this.encontrar_palabra[i]);
        }
        System.out.println();
    }

    public void jugar(){
        while(this.intentos>0){
            System.out.println("Vidas Restantes     "+this.intentos+"");
            System.out.print("Ingrese la letra que quiere probar -> ");
            char letra = this.letras.next().charAt(0);
            if(!this.comprobarLetra(letra)){
                if(this.letraIncorrecta(letra)){
                    this.ponerLetra(letra);
                    if(!this.ganar()){
                        System.out.println("ERES UN PRO");
                        break;
                    }
                }else{
                    System.out.println("Letra incorrecta");
                    this.intentos--;
                }
                   
            }else{
                System.out.println("Letra Repetida");
                this.intentos--;
            }
            if(this.intentos==0){
                System.out.println("te quedaste sin vidas la palabra era: "+this.palabra);
            }

        }
    }

    public boolean letraIncorrecta(char letra){
        for(int i=0;i<this.palabra_tamano;i++){
            if(this.palabra.charAt(i)==letra){
                return true;
            }
        }
        return false;
    }

    public void ponerLetra(char letra){
        System.out.print("      ");
        for(int i=0;i<this.palabra_tamano;i++){
            if(letra==this.palabra.charAt(i)){
                this.encontrar_palabra[i]=letra;
            }
            System.out.print(" "+this.encontrar_palabra[i]);
        }
        System.out.println("\n");
    }
    public boolean comprobarLetra(char letra){
        for(int i=0;i<this.palabra_tamano;i++){
            if(letra==this.encontrar_palabra[i]){
                return true;
            }
        }
        return false;
    }

    public boolean ganar(){
        for(int i=0;i<this.palabra_tamano;i++){
            if(this.encontrar_palabra[i]=='_'){
                return true;
            }
        }
        return false;
    }
}