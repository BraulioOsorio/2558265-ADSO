import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        int indicador_clientes=0;
        int indicador_vendedor=0;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Personas clientes[]=new Personas[100];
        Personas vendedores[]=new Personas[100];
        Factura nuevo = new Factura();
        boolean salir=false;
        while(salir==false){
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("|| ---------------------  WELCOME  ------------------- ||");
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("||                                                     ||");
            System.out.println("|| 1. -> Creacion de Usuario                           ||");
            System.out.println("|| 2. -> Creacion de Factura                           ||");
            System.out.println("|| 3. -> Ver lista de Clientes                         ||");
            System.out.println("|| 4. -> Ver lista de Vendedores                       ||");
            System.out.println("|| 5. -> Ver lista de Facturas                         ||");
            System.out.println("|| 6. -> Ver detalle de Factura                        ||");
            System.out.println("|| 7. -> Salir                                         ||");
            System.out.println("|| --------------------------------------------------- ||");
            System.out.print("Opcion: ");
            int opcion = entrada.nextInt();
            if(opcion==1){
                System.out.print("Ingrese el numero de documento del usuario: ");
                int documento=entrada.nextInt();
                entrada.nextLine();
                System.out.print("Ingrese los nombres: ");
                String nombres=entrada1.nextLine();
                System.out.print("Ingrese los apellidos: ");
                String apellidos=entrada1.nextLine();
                System.out.print("Ingrese la direccion: ");
                String direccion=entrada1.nextLine();
                System.out.print("Ingrese el telefono: ");
                String telefono=entrada1.nextLine();
                Personas temporal= new Personas(documento,nombres,apellidos,direccion,telefono);
                int valido=0;
                for(int i=0;i<indicador_clientes;i++){
                    if(clientes[i].getDocumento() == documento){
                        valido=1;
                        break;
                    }
                }
                for(int i=0;i<indicador_vendedor;i++){
                    if(vendedores[i].getDocumento() == documento){
                        valido=1;
                        break;
                    }
                }
                if(valido==1){
                    System.out.println("el documento ya existe");
                }else{
                    System.out.println("|| --------------------------------------------------- ||");
                    System.out.println("|| ---------------------  WELCOME  ------------------- ||");
                    System.out.println("|| --------------------------------------------------- ||");
                    System.out.println("||                                                     ||");
                    System.out.println("|| 1. -> Cliente                                       ||");
                    System.out.println("|| 2. -> Vendedor                                      ||");
                    System.out.println("|| --------------------------------------------------- ||");
                    System.out.print("Ingrese el Estado de la persona a registar: ");
                    int escoger = entrada.nextInt();
                    if(valido!=1 && escoger==1){
                        clientes[indicador_clientes] = temporal;
                        indicador_clientes++;
                    }else if(valido!=1 && escoger==2){
                        vendedores[indicador_vendedor] = temporal;
                        indicador_vendedor++;
                    }
                }
            }else if(opcion==2){
                        nuevo.Star();
            }else if(opcion==3){
                for(int i=0;i<clientes.length;i++){
                    if(clientes[i]!= null){
                        clientes[i].imprimir();
                    }else{
                        break;
                    }
                }
            }else if(opcion==4){    
                for(int i=0;i<vendedores.length;i++){
                    if(vendedores[i]!= null){
                        vendedores[i].imprimir();
                    }else{
                        break;
                    }
                }
            }else if(opcion==5){

            }else if(opcion==6){

            }else if(opcion==7){
                salir=true;
            }

        }   
        
    }
}