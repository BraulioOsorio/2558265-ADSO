import java.util.Scanner;

public class Notas10 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

        float matematicas;
        float deportes;
        float espanol;
        float ingles;
        float naturales;

        System.out.println("Senor usuario por favor ingresar sus notas ");

        System.out.print("Matematicas: ");
        matematicas=entrada.nextFloat();

        System.out.print("Espanol: ");
        espanol=entrada.nextFloat();

        System.out.print("Ingles: ");
        ingles=entrada.nextFloat();

        System.out.print("Ciencias Naturales: ");
        naturales=entrada.nextFloat();

        System.out.print("Deportes: ");
        deportes=entrada.nextFloat();

        float acumulado=(matematicas+espanol+ingles+naturales+deportes)/5;
        
        if(acumulado<3){

            if(matematicas<espanol && matematicas<ingles && matematicas<naturales && matematicas<deportes){
               
                System.out.println("Matematicas saco la nota mas baja: "+matematicas);
                float falta= 15-espanol-ingles-deportes-naturales;
                System.out.println("esto le falta a la area de Matematicas para pasar el periodo: "+falta);
            }else if(espanol<matematicas && espanol<ingles && espanol<naturales && espanol<deportes){
                System.out.println("Espanol saco la nota mas baja: "+espanol);
                float falta= 15-matematicas-ingles-deportes-naturales;
                System.out.println("esto le falta a la area de Espanol para pasar el periodo: "+falta);
            }else if(ingles<matematicas && ingles<espanol && ingles<naturales && ingles<deportes){
                System.out.println("Ingles saco la nota mas baja: "+ingles);
                float falta= 15-matematicas-espanol-deportes-naturales;
                System.out.println("esto le falta a la area de Ingles para pasar el periodo: "+falta);
            }else if(naturales<matematicas && naturales<ingles && naturales<espanol && naturales<deportes){
                System.out.println("Ciencias Naturales saco la nota mas baja: "+naturales);
                float falta= 15-matematicas-espanol-deportes-ingles;
                System.out.println("esto le falta a la area de Ciencias Naturales para pasar el periodo: "+falta);
            }else if(deportes<matematicas && deportes<ingles && deportes<naturales && deportes<espanol){
                System.out.println("Deportes saco la nota mas alta: "+deportes);
                float falta= 15-matematicas-espanol-naturales-ingles;
                System.out.println("esto le falta a la area de Deportes para pasar el periodo: "+falta);
            }else{
            System.out.print("");
            }
            if(matematicas>espanol && matematicas>ingles && matematicas>naturales && matematicas>deportes){
                float mayor=matematicas;
                System.out.println("Matematicas saco la nota mas alta de: "+mayor);
            }else if(espanol>matematicas && espanol>ingles && espanol>naturales && espanol>deportes){
                float mayor=espanol;
                System.out.println("Espanol saco la nota mas alta de: "+mayor);
            }else if(ingles>matematicas && ingles>espanol && ingles>naturales && ingles>deportes){
                float mayor=ingles;
                System.out.println("Ingles saco la nota mas alta de: "+mayor);
            }else if(naturales>matematicas && naturales>ingles && naturales>espanol && naturales>deportes){
                float mayor=naturales;
                System.out.println("Ciencias Naturales saco la nota mas alta de: "+mayor);
            }else if(deportes>matematicas && deportes>ingles && deportes>naturales && deportes>espanol){
                float mayor=deportes;
                System.out.println("Deportes saco la nota mas alta de: "+mayor);
            }else{
            System.out.print("");
            }
        }else{
            System.out.print("");
        }
                


        if(acumulado>=3){
            if(matematicas>espanol && matematicas>ingles && matematicas>naturales && matematicas>deportes){
                System.out.println("Matematicas saco la nota mas alta: "+matematicas);
            }else if(espanol>matematicas && espanol>ingles && espanol>naturales && espanol>deportes){
                System.out.println("Espanol saco la nota mas alta: "+espanol);
            }else if(ingles>matematicas && ingles>espanol && ingles>naturales && ingles>deportes){
                System.out.println("Ingles saco la nota mas alta: "+ingles);
            }else if(naturales>matematicas && naturales>ingles && naturales>espanol && naturales>deportes){
                System.out.println("Ciencias Naturales saco la nota mas alta: "+naturales);
            }else if(deportes>matematicas && deportes>ingles && deportes>naturales && deportes>espanol){
                System.out.println("Deporte saco la nota mas alta: "+deportes);
            }

            if(matematicas<espanol && matematicas<ingles && matematicas<naturales && matematicas<deportes){
                System.out.println("Matematicas saco la nota mas baja: "+matematicas);
            }else if(espanol<matematicas && espanol<ingles && espanol<naturales && espanol<deportes){
                float menor=espanol;
                System.out.println("Espanol saco la nota mas baja: "+menor);
            }else if(ingles<matematicas && ingles<espanol && ingles<naturales && ingles<deportes){
                float menor=ingles;
                System.out.println("Ingles saco la nota mas baja: "+menor);
            }else if(naturales<matematicas && naturales<ingles && naturales<espanol && naturales<deportes){
                float menor=naturales;
                System.out.println("Ciencias Naturales saco la nota mas baja: "+menor);
            }else if(deportes<matematicas && deportes<ingles && deportes<naturales && deportes<espanol){
                float menor=deportes;
                System.out.println("Deportes saco la nota mas baja: "+menor);
            }
        }else{
            System.out.print("");
        }
        
        System.out.println("Este es el acumulado de las 5 notas: "+acumulado );

        

       


    }
}