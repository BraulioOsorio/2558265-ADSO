import java.util.Scanner;

public class Ejercicio25{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        boolean mas=true;
        String municipios[]=new String[5];
        String departamentos[]=new String[5];
        int habitantes[]=new int[5];
        int asmn[]=new int[5];
        int  espacio=5;
        int agregar=0;
        while(mas==true && espacio>0){
            System.out.println("                                          Memoria disponible: "+espacio+" Registros");
            System.out.println("----------------------------BIENVENIDO----------------------------");
            System.out.println("1: Registrar municipio.");
            System.out.println("2: Ver lista de municipios.");
            System.out.println("3: Ver información municipio.");
            System.out.println("4: Registrar número de habitantes de un municipio.");
            System.out.println("5: Registrar altura sobre el nivel del mar de un municipio.");
            System.out.println("6: Ver lista de departamentos registrados.");
            System.out.println("7: Ver información de departamento.");
            System.out.println("8: Eliminar municipio.");
            System.out.println("9: Eliminar departamento. ");
            System.out.println("10. Salir");
            System.out.println("------------------------------------------------------------------");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            int condicion=entrada.nextInt();
            entrada.nextLine();
            boolean valido=true;
            if(condicion==1){
                boolean repetir=true;
                while(repetir==true){
                    System.out.print("Ingrese el municipio: ");
                    String buscarmunicipio = entrada.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String buscardepartamento = entrada.nextLine();
                    boolean validar=true;
                    for(int j=0;j<municipios.length;j++){
                        if(buscarmunicipio.equalsIgnoreCase(municipios[j]) && buscardepartamento.equalsIgnoreCase(departamentos[j])){
                            validar=false;
                        }
                    }
                    if(validar==true){
                        municipios[agregar]=buscarmunicipio;
                        departamentos[agregar]=buscardepartamento;
                        espacio--;
                        agregar++;
                        System.out.println("");
                        repetir=false;

                    }else{
                        System.out.println("Esta repetido intente nuevamente");
                    }     
                }
            }else if(condicion==2){
                System.out.println("LISTA DE MUNICIPIOS");
                for(int i=0;i<municipios.length;i++){
                    if(municipios[i]!=null){
                        System.out.println(municipios[i]);
                    }
                }
            }else if(condicion==3){
                System.out.print("Ingrese el nombre del municipio para buscarlo: "); 
                String buscar=entrada.nextLine();
                boolean encontrado=false; 
                for(int i=0;i<municipios.length;i++){ 
                    if(buscar.equalsIgnoreCase(municipios[i])){
                        System.out.println("DEPARTAMENTO: ["+departamentos[i]+"]   ");
                        System.out.println("MUNICIPIOS: ["+municipios[i]+"]");
                        if(habitantes[i]!=0 ){
                            System.out.println("HABITANTES: ["+habitantes[i]+"]    ");
                        }
                        if(asmn[i]!=0){
                            System.out.println("ASMN: ["+asmn[i]+"]");
                        }
                        encontrado=true;              
                    }
                }
                if(encontrado==false){
                    System.out.println("Municipio no encontrado");
                } 
            }else if(condicion==4){ 
                boolean falso=false;
                System.out.print("Ingrese el municipio para agregar los habitaltes o modificarlo: "); 
                String buscar = entrada.nextLine(); 
                for(int i=0;i<municipios.length;i++){ 
                    if(buscar.equalsIgnoreCase(municipios[i])){
                        System.out.print("Ingrese la cantidad de habitantes del municipio "+municipios[i]+": "); 
                        habitantes[i]=entrada.nextInt();
                        falso=true;
                    }
                }
                if(falso==false){
                    System.out.println("El municipio no se encuentra registrado");
                }                                 
            }else if(condicion==5){
                boolean falso=false;
                System.out.print("Ingrese el municipio al cual le quire ingresar el ANMS o modificarlo: "); 
                String buscar = entrada.nextLine(); 
                for(int i=0;i<municipios.length;i++){ 
                    if(buscar.equalsIgnoreCase(municipios[i])){
                        System.out.print("Ingrese el ASMN del municipio "+municipios[i]+": "); 
                        asmn[i]=entrada.nextInt();
                        falso=true;
                    } 
                }
                if(falso==false){
                    System.out.println("El municipio no se encuentra registrado");
                }   
            }else if(condicion==6){
                System.out.println("LISTA DE DEPARTAMENTOS");
                for(int i=0;i<departamentos.length;i++){
                    if(departamentos[i]==null){
                        departamentos[i]="";
                    }
                }
                for(int i=0;i<departamentos.length;i++){
                    boolean encontrar=false;
                    for(int j=0;j<i;j++){
                        if(departamentos[i].equalsIgnoreCase(departamentos[j])){
                            encontrar=true;
                            break;
                        }
                    }
                    if(encontrar==false){
                        System.out.println(departamentos[i]);
                    }
                }
         
            }else if(condicion==7){
                System.out.print("Ingrese el departamento que desea buscar: ");
                String buscar=entrada.nextLine();
                int habitantes_totales=0;
                int asmn_mayor=0;
                int asmn_menor=999999999;
                System.out.println("MUNICIPIOS DE "+buscar);
                for(int i=0;i<municipios.length;i++){
                    if(buscar.equalsIgnoreCase(departamentos[i])){
                        System.out.println("["+municipios[i]+"]");
                        int mientras_mayor=0;
                        int mientras_menor=0;
                        habitantes_totales=habitantes_totales+habitantes[i];
                        mientras_mayor=asmn[i];
                        mientras_menor=asmn[i];
                        if(mientras_mayor>asmn_mayor){
                            asmn_mayor=mientras_mayor;
                        }
                        if(mientras_menor<asmn_menor){
                            asmn_menor=mientras_menor;
                        }
                    }
                }
                System.out.println("La cantida de habitantes de "+buscar+" es: "+habitantes_totales);
                System.out.println("La altura mas alta sobre el nivel del mar de "+buscar+" es: "+asmn_mayor);
                System.out.println("La altura mas baja sobre el nivel del mar de "+buscar+" es: "+asmn_menor);
            }else if(condicion==8){
                System.out.print("Ingrese el municipio a eliminar: ");
                String buscar=entrada.nextLine();
                for(int i=0;i<municipios.length;i++){
                    if(buscar.equalsIgnoreCase(municipios[i])){
                        municipios[i]="";
                        departamentos[i]="";
                        habitantes[i]=0;
                        asmn[i]=0;
                        agregar--;
                        espacio++;
                    }
                }
                for(int i=0;i<municipios.length-1;i++){
                    if((municipios[i]=="")&&(departamentos[i]=="")&&(habitantes[i]==0)&&(asmn[i]==0)){
                       municipios[i]=municipios[i+1];
                       municipios[i+1]="";
                       departamentos[i]=departamentos[i+1];
                       departamentos[i+1]="";
                       habitantes[i]=habitantes[i+1];
                       habitantes[i+1]=0;
                       asmn[i]=asmn[i+1];
                       asmn[i+1]=0;
                    }
                }
            }else if(condicion==9){
                System.out.print("Ingrese el departamento que desea eliminar: ");
                String buscar=entrada.nextLine();
                for(int i=0;i<departamentos.length;i++){
                    if(buscar.equalsIgnoreCase(departamentos[i])){
                        municipios[i]="";
                        departamentos[i]="";
                        habitantes[i]=0;
                        asmn[i]=0;
                        agregar--;
                        espacio++;
                    }
                }
                for(int i=0;i<departamentos.length-1;i++){
                    if((municipios[i]=="")&&(departamentos[i]=="")&&(habitantes[i]==0)&&(asmn[i]==0)){
                       municipios[i]=municipios[i+1];
                       municipios[i+1]="";
                       departamentos[i]=departamentos[i+1];
                       departamentos[i+1]="";
                       habitantes[i]=habitantes[i+1];
                       habitantes[i+1]=0;
                       asmn[i]=asmn[i+1];
                       asmn[i+1]=0;
                    }
                }
            }else if(condicion==10){
                System.out.println("Gracias por usar este sistema NICE");
                mas=false;
            }
        }
    }
}