import java.util.Scanner;

public class Principal{
    public static void main(String[]args){

        Persona arreglo [] = new Persona[99];
		int posicion = 0;
		int opcion = 0;

        while(opcion!=){
            Scanner entrada = new Scanner(System.in);
            Scanner texto = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.println("  1 - Crear Cliente");
            System.out.println("  2 - Crear Vendedor");
            System.out.println("  3 - Realizar Factura");
            System.out.println("  4 - Ver Clientes ");
            System.out.println("  5 - Ver Vendedore");
            System.out.println("  6 - Ver Facturas");
            System.out.println("  7 - Salir");
            System.out.println("-----------------------");
            System.out.print("Opcion: ");
            int opcion = entrada.nextInt();

            if(opcion==1){
                System.out.print("Ingrese Documento: ");
                String documento = texto.nextLine();
                System.out.print("Ingrese Nombre: ");
                String nombre  = texto.nextLine();
                System.out.print("Ingrese Apellido: ");
                String apellido = texto.nextLine();
                System.out.print("Ingrese Direccion: ");
                String direccion = texto.nextLine();
                System.out.print("Ingrese Telefono: ");
                String telefono = texto.nextLine();
                System.out.print("Ingrese Email: ");
                String email = texto.nextLine();

                boolean valido = true;
                for (int i=0; i<posicion; i++) {
                    if(arreglo[i].getDocumento() == documento){
                        valido = false;
                        break;
                    }
                }

                if(valido){
                    Persona temporal = new Persona(documento, nombres, apellidos, direccion, telefono, email);
                    arreglo[posicion] = temporal;
                    posicion++;
                    System.out.println(" == REGISTRADO CON EXITO ==");
                }else{
                    System.out.println(" == DOCUMENTO REPETIDO, DEBE INTENTAR DE NUEVO EL PROCESO ==");
                }
            }
        }
        

    }
}