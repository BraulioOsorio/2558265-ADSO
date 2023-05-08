import java.util.Scanner;

public class Principal{
    public static void main(String[]args){

        Clientes arrayClientes [] = new Clientes[99];
        Vendedor arrayVendedores [] = new Vendedor[99];
        Factura arrayFactura [] = new Factura[99];

		int opcion = 0;
        int posicionClientes =0;
        int posicionVendedores =0;
        int posicionFactura = 0;
        while(opcion!=7){
            Scanner entrada = new Scanner(System.in);
            Scanner texto = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.println("  1 - Crear Cliente");
            System.out.println("  2 - Crear Vendedor");
            System.out.println("  3 - Realizar Factura");
            System.out.println("  4 - Ver Clientes ");
            System.out.println("  5 - Ver Vendedore");
            System.out.println("  6 - Ver Facturas");
            System.out.println("  7 - Ver Detalle de Factura");
            System.out.println("  8 - Salir");
            System.out.println("-----------------------");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            if(opcion==1){
                System.out.print("Ingrese Documento: ");
                int documento = entrada.nextInt();
                System.out.print("Ingrese El Nombre Completo: ");
                String nombre  = texto.nextLine();
                boolean valido = true;
                for (int i=0; i<posicionClientes; i++) {
                    if(arrayClientes[i].getDocumento() == documento){
                        valido = false;
                        break;
                    }
                }
                if(valido){
                    Clientes temporal = new Clientes(documento, nombre);
                    arrayClientes[posicionClientes] = temporal;
                    posicionClientes++;
                    System.out.println(" ==  CLIENTE REGISTRADO CON EXITO ==");
                }else{
                    System.out.println(" == DOCUMENTO REPETIDO, DEBE INTENTAR DE NUEVO EL PROCESO ==");
                }
            }else if(opcion==2){
                System.out.print("Ingrese Documento: ");
                int documento = entrada.nextInt();
                System.out.print("Ingrese El Nombre Completo: ");
                String nombre  = texto.nextLine();
                boolean valido = true;
                for (int i=0; i<posicionVendedores; i++) {
                    if(arrayVendedores[i].getDocumento() == documento){
                        valido = false;
                        break;
                    }
                }
                if(valido){
                    Vendedor temporal = new Vendedor(documento, nombre);
                    arrayVendedores[posicionVendedores] = temporal;
                    posicionVendedores++;
                    System.out.println(" ==  VENDEDOR REGISTRADO CON EXITO ==");
                }else{
                    System.out.println(" == DOCUMENTO REPETIDO, DEBE INTENTAR DE NUEVO EL PROCESO ==");
                }
            }else if(opcion==3){
                System.out.println("NUEVA FACTURA");
                System.out.println("Lista de Clientes");
                for(int i=0;i<arrayClientes.length;i++){
                    if(arrayClientes[i]!= null){
                        System.out.print((i+1)+") ");
                        arrayClientes[i].imprimir();
                    }else{
                        break;
                    }
                }
                System.out.print("Selecione el Cliente ingresando el numero identificador: ");
                int selectCliente = entrada.nextInt();
                Clientes clienteSelect = arrayClientes[selectCliente-1];
                System.out.println("=============================");
                System.out.println("Lista de Vendedores");
                for(int i=0;i<arrayVendedores.length;i++){
                    if(arrayVendedores[i]!= null){
                        System.out.print((i+1)+") ");
                        arrayVendedores[i].imprimir();
                    }else{
                        break;
                    }
                }
                System.out.print("Selecione el Vendedor ingresando el numero identificador: ");
                int selectVendedor = entrada.nextInt();
                Vendedor VendedorSelect = arrayVendedores[selectVendedor -1];

                Factura factura = new Factura(VendedorSelect,clienteSelect);
                System.out.println("Agregar Productos");
                while(true){
                    System.out.print("Nombre del Producto o 1 para salir: ");
                    String nombreProducto = texto.nextLine();
                    if(nombreProducto.equals("1")){
                        break;
                    }
                    System.out.print("Cantidad del Producto: ");
                    int cantidadPro = entrada.nextInt();
                    System.out.print("Precio unitario del Producto");
                    double preciosPro = entrada.nextDouble();
                    Producto producto = new Producto(nombreProducto,preciosPro);
                    factura.agregarPro(producto,cantidadPro);
                }
                System.out.println("TOtal Facturado: "+factura.getTotal());
                arrayFactura[posicionFactura]=factura;
                posicionFactura++;
            }
        }
        

    }
}